package com.cashflow.game.controller;

import com.cashflow.game.constant.Board;
import com.cashflow.game.model.Card;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class DataController {

//    get /data/card/TYPE/INDEX
    @GetMapping(value = {"/card/{type:[\\w]+}/{id:\\d+]}", "/card/{type:[\\w]+}/{id:\\d+]}/"})
    public Card getCardByTypeAndId(@PathVariable String type, @PathVariable Integer id) {
        return null;
    }

//    get /data/board/TYPE
    @GetMapping(value = {"/board/{type:[\\w]+}", "/board/{type:[\\w]+}/"})
    public Board getBoardPositionsByBoardType(@PathVariable String type) {
        return null;
    }

//    get /data/board/TYPE/POSITION
    @GetMapping(value = {"/board/{type:[\\w]+}/{pos:\\d+}", "/board/{type:[\\w]+}/{pos:\\d+}/"})
    public Board getBoardPositionByTypeAndPosition(@PathVariable String type, @PathVariable Integer pos) {
        return null;
    }
}
