package com.cashflow.game.service;

import com.cashflow.game.constant.Errors;
import com.cashflow.game.entity.Game;
import com.cashflow.game.entity.Profile;
import com.cashflow.game.repo.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static com.cashflow.game.constant.Errors.*;

@Service
public class GameService {

    final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

//    public Game newGame(Profile[] profiles) {
//        var res = new Game();
//        res.toString(); ///
//        return res;
//    }

    public Game getById(Long gameId) {kg
        var game = gameRepository.findById(gameId).orElse(null);
        if (game == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Game not found");
        else if (!game.getHasBegun()) throw new GameNotInitializedException();
        else return game;
    }
}
