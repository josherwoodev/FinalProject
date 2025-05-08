package com.cashflow.game.service;

import com.cashflow.game.entity.Game;
import com.cashflow.game.entity.Profile;
import org.springframework.stereotype.Service;

@Service
public class GameService {


    public Game newGame(Profile[] profiles) {
        var res = new Game();
        res.toString(); ///
        return res;
    }

    public Game getById(Long gameId, Long profileId) {
        return null;
    }
}
