package com.cashflow.game.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/game/{gameId:\\d+}/turn")
public class TurnController {

//    get /game/ID/turn
    @GetMapping(value = {"", "/"})
    public String getCurrentTurnState(@PathVariable Long gameId) {
        return "['Functional Test " + gameId + "']";
    }

//    get /game/ID/turn/roll/NUM/?player/ID
    @GetMapping(value = {"/roll/{count:\\d+}", "/roll/{count:\\d+}/"})
    public String rollForCurrentPlayer(@PathVariable String gameId, @PathVariable Integer count) {
        return "['roll " + gameId + " | num of dice: " + count + "']";
    }

//    get /game/ID/turn/player/ID/position
    @GetMapping(value = {"/player/{playerId:\\d+}/position", "/player/{playerId:\\d+}/position/"})
    public String getCurrentPlayerPosition(@PathVariable Long gameId, @PathVariable String playerId) {
        return "['Player " + gameId + " | player " + playerId + "']";
    }

//    get /game/ID/turn/event
    @GetMapping(value = {"/event", "/event/"})
    public String getCurrentEvent(@PathVariable Long gameId) {
        return "['Event " + gameId + "']";
    }

//    post /game/ID/turn/event/?player/ID
    @PostMapping(value = {"/event/player/{playerId:\\d+}", "/event/player/{playerId:\\d+}/"})
    public String resolveEvent(@PathVariable Long gameId, @PathVariable Integer playerId) {
        return "['Event " + gameId + " | player " + playerId + "']";
    }
//    get /game/ID/turn/event -> 410 -> get /game/ID/turn/card
    @GetMapping(value = {"/card", "/card/"})
    public String getCurrentCard(@PathVariable Long gameId) {
        return "['Card " + gameId + "']";
    }

//    post /game/ID/turn/player/ID/end
    @PostMapping(value = {"/player/{playerId:\\d+}/end", "/player/{playerId:\\d+}/end/"})
    public String endTurn(@PathVariable Long gameId, @PathVariable Integer playerId) {
        return "['Player " + playerId + " | game " + gameId + " ending turn']";
    }
}
