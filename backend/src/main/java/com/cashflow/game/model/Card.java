package com.cashflow.game.model;

import com.cashflow.game.entity.Player.TARGET;

public record Card(TYPES type, String title, String description, Asset asset,
                   Asset offer, Asset effect, EFFECTS effectType,
                   Float multiplier, Boolean requiresChild, Boolean isTradeable,
                   String yield, TARGET whoCanBuy, TARGET whoCanSell,
                   TARGET targeting) {

    public enum TYPES {
        BIG_DEAL, DOODAD, MARKET, SMALL_DEAL
    }

    public enum EFFECTS {
        ADJUST, SALE
    }
}
