package com.cashflow.game.controller;

import com.cashflow.game.model.Card;
import com.cashflow.game.model.Position;
import com.cashflow.game.service.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    //    get /data/card/TYPE/INDEX
    @GetMapping(value = {"/card/{type:[\\w]+}/{index:\\d+]}", "/card/{type:[\\w]+}/{index:\\d+]}/"})
    public Card getCardByTypeAndId(@PathVariable String type, @PathVariable Integer index) {
        return dataService.getCard(type, index);
    }

    //    get /data/board/TYPE
    @GetMapping(value = {"/board/{type:[\\w]+}", "/board/{type:[\\w]+}/"})
    public List<Position> getBoardPositionsByBoardType(@PathVariable String type) {
        return dataService.getBoard(type);
    }

//    get /data/board/TYPE/POSITION
//    @GetMapping(value = {"/board/{type:[\\w]+}/{pos:\\d+}", "/board/{type:[\\w]+}/{pos:\\d+}/"})
//    public Board getBoardPositionByTypeAndPosition(@PathVariable String type, @PathVariable Integer pos) {
//        return null;
//    }
}
