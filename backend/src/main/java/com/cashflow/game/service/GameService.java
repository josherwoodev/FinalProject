package com.cashflow.game.service;

import com.cashflow.game.entity.Game;
import com.cashflow.game.repo.GameRepository;
import org.springframework.stereotype.Service;

import static com.cashflow.game.constant.Errors.GameNotInitializedException;
import static com.cashflow.game.constant.Errors.ResourceNotFoundException;

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

    public Game getById(Long gameId) {
        var game = gameRepository.findById(gameId).orElse(null);
        if (game == null) throw new ResourceNotFoundException();
        else if (!game.getHasBegun()) throw new GameNotInitializedException();
        else return game;
    }
}
