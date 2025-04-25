package com.cashflow.game.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public record Asset(String name, @Enumerated(EnumType.STRING) TYPES type,
                    @Enumerated(EnumType.STRING) SUB_TYPES subType, Float count,
                    Float down, Float cost,
                    @Embedded @AttributeOverrides({
                            @AttributeOverride(name = "type", column = @Column(name = "liability_type")),
                            @AttributeOverride(name = "name", column = @Column(name = "liability_name")),
                            @AttributeOverride(name = "value", column = @Column(name = "liability_value"))})
                    Liability liability,
                    Float cashflow) {

    public static Asset of(Float cost) {
        return new Asset(null, null, null, null, null, cost, null, null);
    }

    public static Asset of(TYPES type, Float cost) {
        return new Asset(null, type, null, null, null, cost, null, null);
    }

    public static Asset of(TYPES type, SUB_TYPES subType) {
        return new Asset(null, type, subType, null, null, null, null, null);
    }

    public static Asset of(TYPES type, SUB_TYPES subType, Float cost) {
        return new Asset(null, type, subType, null, null, cost, null, null);
    }

    public static Asset of(TYPES type, SUB_TYPES subType, Float count, Float cost) {
        return new Asset(null, type, subType, count, null, cost, null, null);
    }

    public static Asset of(String name, TYPES type, SUB_TYPES subType) {
        return new Asset(name, type, subType, null, null, null, null, null);
    }

    public static Asset of(String name, TYPES type, SUB_TYPES subType, Float cost) {
        return new Asset(name, type, subType, null, null, cost, null, null);
    }

    public static Asset of(String name, TYPES type, SUB_TYPES subType, Float count, Float cost) {
        return new Asset(name, type, subType, count, null, cost, null, null);
    }

    public static Asset of(String name, TYPES type, SUB_TYPES subType, Float down, Float cost, Liability liability, Float cashflow) {
        return new Asset(name, type, subType, null, down, cost, liability, cashflow);
    }

    public static Asset of(String name, TYPES type, SUB_TYPES subType, Float down, Float cost, Float liability, Float cashflow) {
        return new Asset(name, type, subType, null, down, cost, new Liability(Liability.Types.valueOf(type.name()), name, liability), cashflow);
    }

    public static Asset of(String name, TYPES type, SUB_TYPES subType, Float count, Float down, Float cost, Liability liability, Float cashflow) {
        return new Asset(name, type, subType, count, down, cost, liability, cashflow);
    }

    public static Asset of(String name, TYPES type, SUB_TYPES subType, Float count, Float down, Float cost, Float liability, Float cashflow) {
        return new Asset(name, type, subType, count, down, cost, new Liability(Liability.Types.valueOf(type.name()), name, liability), cashflow);
    }

    public enum TYPES {
        BUSINESS, DREAM, FAST_TRACK, REAL_ESTATE, STOCK, NO_TYPE
    }

    public enum SUB_TYPES {
        APT, AUTO, BNB, CAR_WASH, CD, CONDO, GOLD, HOUSE, LAND, LTD, MALL, MUTUAL, NO_SUB_TYPE, PIZZA, PLEX, PREFERRED, SHARE, STARTUP
    }

    public boolean matchesCriteria(Asset criteria) {
        return this.equals(criteria) || ((this.type == null || this.type == criteria.type) && (criteria.subType == null || this.subType == criteria.subType) && (criteria.count == null || criteria.count.equals(this.count)) && (criteria.name == null || (this.name != null && this.name.contains(criteria.name))));
    }
}
