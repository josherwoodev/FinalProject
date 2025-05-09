package com.cashflow.game.controller;

import com.cashflow.game.dto.NewGameDTO;
import com.cashflow.game.entity.Game;
import com.cashflow.game.entity.Player;
import com.cashflow.game.entity.Profile;
import com.cashflow.game.service.ProfileService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    //    post /profile
    @PostMapping(value = {"", "/"})
    public Profile create(@RequestBody Profile profile) {
        return profileService.save(profile);
    }

    //    get /profile/all
    @GetMapping(value = {"/all", "/all/"})
    public List<Profile> getAllProfiles() {
        return profileService.getAll();
    }

    //    get /profile/ID
    @GetMapping(value = {"/{profileId:\\d+}", "/{profileId:\\d+}/"})
    public Profile getProfileById(@PathVariable Long profileId) {
        return profileService.getById(profileId);
    }

    //    get /profile/ID/games
    @GetMapping(value = {"/{profileId:\\d+}/games", "/{profileId:\\d+}/games/"})
    public List<Game> getAllGamesByProfile(@PathVariable Long profileId) {
        return profileService.getGamesFromProfileById(profileId);
    }

    //    get /profile/ID/games/active
    @GetMapping(value = {"/{profileId:\\d+}/games/active", "/{profileId:\\d+}/games/active/"})
    public List<Game> getAllActiveGamesByProfile(@PathVariable Long profileId) {
        return profileService.getActiveGamesFromProfileById(profileId);
    }

    //    post /profile/ID/game/new/
    @PostMapping(value = {"/{profileId:\\d+}/games/new", "/{profileId:\\d+}/games/new/"})
    public Game createNewGameForProfile(@PathVariable Long profileId, @RequestBody NewGameDTO newGameDTO) {
        return profileService.createNewGame(profileId, newGameDTO.profileIds(), newGameDTO.gameSetting());
    }

    //    get /profile/ID/games/invites
    @GetMapping(value = {"/{profileId:\\d+}/games/invites", "/{profileId:\\d+}/games/invites/"})
    public List<Game> getAllGameInvitesByProfile(@PathVariable Long profileId) {
        return profileService.getGamesFromProfileById(profileId, true);
    }

    //    delete /profile/ID/games/invites/ID
    @DeleteMapping(value = {"/{profileId:\\d+}/games/invites/{inviteId:\\d+}", "/{profileId:\\d+}/games/invites/{inviteId:\\d+}/"})
    public Boolean removeGameInviteByIdFromProfile(@PathVariable Long profileId, @PathVariable Long inviteId) {
        return profileService.rejectGameInvite(profileId, inviteId);
    }

    //    get /profile/ID/friend/ID
    @GetMapping(value = {"/{profileId:\\d+}/friend", "/{profileId:\\d+}/friend/"})
    public List<Profile> getFriendsForProfileById(@PathVariable Long profileId) {
        return profileService.getFriends(profileId);
    }

    //    post /profile/ID/friend/ID
    @PostMapping(value = {"/{profileId:\\d+}/friend/{friendId:\\d+}", "/{profileId:\\d+}/friend/{friendId:\\d+}/"})
    public Boolean addFriendToProfileById(@PathVariable Long profileId, @PathVariable Long friendId) {
        return profileService.addFriend(profileId, friendId);
    }

    //    delete /profile/ID/friend/ID
    @DeleteMapping(value = {"/{profileId:\\d+}/friend/{friendId:\\d+}", "/{profileId:\\d+}/friend/{friendId:\\d+}/"})
    public Boolean removeFriendFromProfileById(@PathVariable Long profileId, @PathVariable Long friendId) {
        return profileService.removeFriend(profileId, friendId);
    }

    //    delete /profile/ID/game/ID
    @DeleteMapping(value = {"/{profileId:\\d+}/game/{gameId:\\d+}", "/{profileId:\\d+}/game/{gameId:\\d+}/"})
    public Boolean abandonGameForProfileById(@PathVariable Long profileId, @PathVariable Long gameId) {
        return profileService.abandonGame(profileId, gameId);
    }

    //    get /profile/ID/game/ID/player
    @GetMapping(value = {"/{profileId:\\d+}/game/{gameId:\\d+}/player", "/{profileId:\\d+}/game/{gameId:\\d+}/player/"})
    public Player getPlayerFromGameByProfileId(@PathVariable("gameId") Long gameId, @PathVariable("profileId") Long profileId) {
        return profileService.getPlayerFromGame(gameId, profileId);
    }

}
