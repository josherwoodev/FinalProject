package com.cashflow.game.controller;

import com.cashflow.game.entity.Game;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/game/{gameId:\\d+}/player/{playerId:\\d+}")
public class PlayerController {

    //    get /game/ID/player/ID
    @GetMapping(value = {"", "/"})
    public String getPlayerFromGameById(@PathVariable("gameId") Long gameId, @PathVariable("playerId") Long playerId) {
        return "{\"Game\": " + gameId + ",\n\"Player\": " + playerId + "}";
    }

    //    post /game/ID/player/ID/asset
    @PostMapping(value = {"/asset", "/asset/"})
    public String addAssetToPlayerInGameByPlayerId(@PathVariable("gameId") Long gameId, @PathVariable("playerId") Long playerId) {
        return "{\"Game\": " + gameId + ",\n\"Player\": " + playerId + "}";
    }

    //    delete /game/ID/player/ID/asset
    @DeleteMapping(value = {"/asset", "/asset/"})
    public String removeAssetFromPlayerInGameByPlayerId(@PathVariable("gameId") Long gameId, @PathVariable("playerId") Long playerId) {
        return "{\"Game\": " + gameId + ",\n\"Player\": " + playerId + "}";
    }

    //    put /game/ID/player/ID/liability/TYPE
    @PutMapping(value = {"/liability/{type:\\w+}", "/liability/{type:\\w+}/"})
    public String updateLiabilityForPlayerInGameByType(@PathVariable("gameId") Long gameId, @PathVariable("playerId") Long playerId) {
        return "{\"Game\": " + gameId + ",\n\"Player\": " + playerId + "}";
    }

}
