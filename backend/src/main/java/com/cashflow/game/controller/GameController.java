package com.cashflow.game.controller;

import com.cashflow.game.entity.Game;
import com.cashflow.game.entity.Profile;
import com.cashflow.game.service.GameService;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/game/{gameId:\\d+}")
public class GameController {

    GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    //    get /game/ID
    @GetMapping(value = {"", "/"})
    public String getGameById(@PathVariable String gameId) {
        return "['game " + gameId + "']";
    }

//    get /game/ID -> 428 -> get /game/ID/new
    @GetMapping(value = {"/new", "/new/"})
    public String getNewGameById(@PathVariable String gameId) {
        return "['new game " + gameId + "']";
    }

//    post /game/ID/new/roll
    @PostMapping(value = {"/new/roll", "/new/roll/"})
    public String rollForTurnOrder(@PathVariable String gameId) {
        return "['new game roll " + gameId + "']";
    }

//    post /game/ID/new/color
    @PostMapping(value = {"/new/color", "/new/color/"})
    public String selectPlayerColor(@PathVariable String gameId) {
        return "['new game color " + gameId + "']";
    }

//    post /game/ID/new/career
    @PostMapping(value = {"/new/career", "/new/career/"})
    public String selectPlayerCareer(@PathVariable String gameId) {
        return "['new game career " + gameId + "']";
    }

}
