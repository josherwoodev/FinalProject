package com.cashflow.game.model;

public record Position(TYPES type, String title, String message, Float cost,
                       Card effect) {

    public enum TYPES {
        CASHFLOW, CHARITY, DOODAD, DREAM, MARKET, MISFORTUNE, OPPORTUNITY
    }
}