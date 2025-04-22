package com.cashflow.game.service;

import com.cashflow.game.entity.Game;
import org.springframework.stereotype.Service;

@Service
public class GameService {


    public Game newGame() {
        var res = new Game();
        res.toString(); ///
        return res;
    }

    public Game getById(Long gameId, Long profileId) {
        return null;
    }
}
