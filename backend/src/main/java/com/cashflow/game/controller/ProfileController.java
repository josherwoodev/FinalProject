package com.cashflow.game.controller;

import com.cashflow.game.entity.Game;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    //    get /profile/all
    @GetMapping(value = {"/all", "/all/"})
    public String getAllProfiles() {
        return "All profiles";
    }

    //    get /profile/ID
    @GetMapping(value = {"/{id:\\d+}", "/{id:\\d+}/"})
    public String getProfileById(@PathVariable Long id) {
        return "View profile by id: " + id;
    }

    //    get /profile/ID/games
    @GetMapping(value = {"/{id:\\d+}/games", "/{id:\\d+}/games/"})
    public String getAllGamesByProfile(@PathVariable Long id) {
        return "All games by profile: " + id;
    }

    //    post /profile/ID/game/new/
    @PostMapping(value = {"/{profileId:\\d+}/games/new", "/{profileId:\\d+}/games/new/"})
    public String createNewGameForProfile(@PathVariable Long profileId) {
        return "All invites by profile: " + profileId;
    }

    //    get /profile/ID/games/invites
    @GetMapping(value = {"/{profileId:\\d+}/games/invites", "/{profileId:\\d+}/games/invites/"})
    public String getAllGameInvitesByProfile(@PathVariable Long profileId) {
        return "All invites by profile: " + profileId;
    }

    //    delete /profile/ID/games/invites/ID
    @DeleteMapping(value = {"/{profileId:\\d+}/games/invites/{inviteId:\\d+}", "/{profileId:\\d+}/games/invites/{inviteId:\\d+}/"})
    public String removeGameInviteByIdFromProfile(@PathVariable Long profileId, @PathVariable String inviteId) {
        return "All invites by profile: " + profileId + " | friend: " + inviteId;
    }

    //    get /profile/ID/friend/ID
    @GetMapping(value = {"/{profileId:\\d+}/friend", "/{profileId:\\d+}/friend/"})
    public String getFriendsForProfileById(@PathVariable Long profileId) {
        return "Add friend by id: " + profileId;
    }

    //    post /profile/ID/friend/ID
    @PostMapping(value = {"/{profileId:\\d+}/friend/{friendId:\\d+}", "/{profileId:\\d+}/friend/{friendId:\\d+}/"})
    public String addFriendToProfileById(@PathVariable Long profileId, @PathVariable String friendId) {
        return "Add friend by id: " + profileId + " | friend: " + friendId;
    }

    //    delete /profile/ID/friend/ID
    @DeleteMapping(value = {"/{profileId:\\d+}/friend/{friendId:\\d+}", "/{profileId:\\d+}/friend/{friendId:\\d+}/"})
    public String removeFriendFromProfileById(@PathVariable Long profileId, @PathVariable String friendId) {
        return "Add friend by id: " + profileId + " | friend: " + friendId;
    }

    //    delete /profile/ID/game/ID
    @DeleteMapping(value = {"/{profileId:\\d+}/game/{gameId:\\d+}", "/{profileId:\\d+}/game/{gameId:\\d+}/"})
    public String abandonGameForProfileById(@PathVariable Long profileId, @PathVariable String gameId) {
        return "Add friend by id: " + profileId + " | game: " + gameId;
    }

    //    get /profile/ID/game/ID/player
    @GetMapping(value = {"/{profileId:\\d+}/game/{gameId:\\d+}/player", "/{profileId:\\d+}/game/{gameId:\\d+}/player/"})
    public Game getPlayerFromGameByProfileId(@PathVariable("gameId") Long gameId, @PathVariable("profileId") Long profileId) {
        return null;
    }

}
