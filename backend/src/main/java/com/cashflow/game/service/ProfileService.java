package com.cashflow.game.service;

import com.cashflow.game.entity.Game;
import com.cashflow.game.entity.GameSetting;
import com.cashflow.game.entity.Player;
import com.cashflow.game.entity.Profile;
import com.cashflow.game.repo.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.cashflow.game.constant.Errors.*;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;
    private final PlayerService playerService;

    public ProfileService(ProfileRepository profileRepository, PlayerService playerService) {
        this.profileRepository = profileRepository;
        this.playerService = playerService;
    }

    public Profile save(Profile profile) {
        return profileRepository.save(profile);
    }

    public List<Profile> getAll() {
        return profileRepository.findAll();
    }

    public Profile getById(Long profileId) {
        return profileRepository.findById(profileId).orElse(null);
    }

    public List<Game> getGamesFromProfileById(Long profileId) {
        return getGamesFromProfileById(profileId, false);
    }

    public List<Game> getActiveGamesFromProfileById(Long profileId) {
        return getGamesFromProfileById(profileId, false).stream().filter(g -> !g.getGameOver() && g.getPlayers().stream().anyMatch(Player::getActive)).collect(Collectors.toList());
    }

    public List<Game> getGamesFromProfileById(Long profileId, boolean invitesOnly) {
        var profile = profileRepository.findById(profileId).orElse(null);
        if (profile == null) throw new ResourceNotFoundException();
        var games = invitesOnly ? profile.getGames().stream().filter(Game::getHasBegun).collect(Collectors.toList()) : profile.getGames();
        return games;
    }

    public Game createNewGame(Long profileId, List<Long> profileIds, GameSetting gameSetting) {
        var profile = profileRepository.findById(profileId).orElse(null);
        var profiles = profileRepository.findAllById(profileIds);
        if (profile == null || profiles.size() < profileIds.size())
            throw new InvalidArgumentsException();

        profiles.add(profile);
        var game = Game.createNewGame(profiles, gameSetting);
        profiles.forEach(p -> {
            p.getGames().add(game);
            profileRepository.save(p);
        });
        return game;
    }

    public Boolean rejectGameInvite(Long profileId, Long inviteId) {
        return abandonGame(profileId, inviteId);
    }

    public Boolean abandonGame(Long profileId, Long gameId) {
        var profile = profileRepository.findById(profileId).orElseThrow(ResourceNotFoundException::new);
        var game = profile.getGames().stream().filter(g -> g.getId().equals(gameId)).findFirst().orElseThrow(ResourceNotFoundException::new);
        var player = game.getPlayers().stream().filter(p -> p.getId().equals(profileId)).findFirst().orElseThrow(ResourceNotFoundException::new);
        player.setActive(false);
        var res = profileRepository.save(profile).getId().equals(profileId);
        if (res && !game.getHasBegun()) {
            player.setProfileId(null);
            profile.getGames().remove(game);
            res = playerService.updatePlayer(player).getId().equals(player.getId());
            res = profileRepository.save(profile).getId().equals(profileId) && res;
        }
        return res;
    }

    public List<Profile> getFriends(Long profileId) {
        var profile = profileRepository.findById(profileId).orElseThrow(ResourceNotFoundException::new);
        return profile.getFriends();
    }

    public Boolean addFriend(Long profileId, Long friendId) {
        var sent = false;
        var profile = profileRepository.findById(profileId).orElseThrow(ResourceNotFoundException::new);
        var friend = profileRepository.findById(friendId).orElseThrow(ResourceNotFoundException::new);
        profile.getFriends().add(friend);
        sent = profileRepository.save(profile).getId().equals(profileId);
        return sent;
    }

    public Boolean removeFriend(Long profileId, Long friendId) {
        var profile = profileRepository.findById(profileId).orElseThrow(ResourceNotFoundException::new);
        var friend = profileRepository.findById(friendId).orElseThrow(ResourceNotFoundException::new);
        var deleted = profile.getFriends().remove(friend);
        friend.getFriends().remove(profile);
        profileRepository.save(profile);
        profileRepository.save(friend);
        return deleted;
    }

    public Player getPlayerFromGame(Long gameId, Long profileId) {
        var profile = profileRepository.findById(profileId).orElseThrow(ResourceNotFoundException::new);
        var game = profile.getGames().stream().filter(g -> g.getId().equals(gameId)).findFirst().orElseThrow(ResourceNotFoundException::new);
        return game.getPlayers().stream().filter(p -> p.getProfileId().equals(profileId)).findFirst().orElseThrow(ResourceNotFoundException::new);
    }
}
