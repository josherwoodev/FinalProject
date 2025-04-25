package com.cashflow.game.model;

import jakarta.persistence.Embeddable;

@Embeddable
public record Dream(String dreamName) {

    public boolean matchesDream(String boardDream) {
        return dreamName.equals(boardDream);
    }
}
