package com.cashflow.game.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GameSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer maxChildren = 3;
    private Integer maxDownsize = 0;
    private Boolean firstPlaceOnly = true;
    private Integer startingPaychecks = 1;
    private Integer careersDealt = 1;
    private Integer maxDoodadCost = 0;
    private Boolean ratRaceOnly = false;
    private Boolean dreamRequired = false;
    private Boolean ftBusinessExclusive = true;
    private Boolean forceEscapeRatRace = false;
}
