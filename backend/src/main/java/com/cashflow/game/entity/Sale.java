package com.cashflow.game.entity;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapKeyColumn;

import java.time.Instant;
import java.util.Map;

@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @CollectionTable
    @MapKeyColumn(name = "player_id")
    @Column(name = "offer")
    private Map<Long, Float> offers;
    private Instant createdAt;
    private Instant deadline;
}
