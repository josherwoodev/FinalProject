package com.cashflow.game.controller;

import com.cashflow.game.entity.Game;
import com.cashflow.game.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/game")
public class GameController {

    GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/")
    public String testing() {
        return "['Hello World']";
    }

    @GetMapping(value = {"s/{playerId}","s/{playerId}/"})
    public String testing(@PathVariable("playerId") String playerId) {
        return "['Game1','Game2']";
    }

    @GetMapping(value = {"/{gameId}/player/{profileId}","/{gameId/player/{profileId}/"})
    public Game getGameById(@PathVariable("gameId") Long gameId, @PathVariable("profileId") Long profileId) {
        return gameService.getById(gameId, profileId);
    }

    @GetMapping(value = {"/new","/new/"})
    public Game newGame() {
        return gameService.newGame();
    }
}
