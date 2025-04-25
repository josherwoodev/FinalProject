package com.cashflow.game.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public record Liability(@Enumerated(EnumType.STRING) Types type, String name,
                        Float value) {

    public enum Types {
        BOAT, BUSINESS, CAR, CREDIT, LOAN, MORTGAGE, REAL_ESTATE, RETAIL, SCHOOL
    }
}
