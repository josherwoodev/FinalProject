package com.cashflow.game.service;

import com.cashflow.game.constant.Board;
import com.cashflow.game.constant.Errors.InvalidArgumentsException;
import com.cashflow.game.constant.GameCards;
import com.cashflow.game.model.Card;
import com.cashflow.game.model.Card.TYPES;
import com.cashflow.game.model.Position;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DataService {

    public Card getCard(String strType, Integer index) {
        var src = switch (TYPES.valueOf(strType)) {
            case BIG_DEAL -> GameCards.BIG_DEALS;
            case DOODAD -> GameCards.DOODADS;
            case MARKET -> GameCards.MARKET_CARDS;
            case SMALL_DEAL -> GameCards.SMALL_DEALS;
        };
        return src[index];
    }

    public List<Position> getBoard(String strType) {
        var src = switch (strType) {
            case "FAST_TRACK" -> Board.FAST_TRACK;
            case "RAT_RACE" -> Board.RAT_RACE;
            default -> throw new InvalidArgumentsException();
        };
        return Arrays.stream(src).toList();
    }
}
