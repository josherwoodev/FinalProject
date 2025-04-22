package com.cashflow.game.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public record Piece(@Enumerated(EnumType.STRING) Set set
        , @Enumerated(EnumType.STRING) Type type) {

    public enum Set {
        BLACK, PURPLE, BLUE, GREEN, ORANGE, RED
    }

    public enum Type {
        RAT, CHEESE, CHIP
    }
}
