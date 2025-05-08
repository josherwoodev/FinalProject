package com.cashflow.game.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.time.Instant;
import java.util.List;

@Entity
public class Game {

    public static final int MAX_PLAYER_COUNT = 6;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Player> players;
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Deck bigDeals;
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Deck smallDeals;
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Deck marketCards;
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Deck doodads;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BoardPosition> ratRace;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BoardPosition> fastTrack;
    private Instant createdAt;
    private Instant lastPlayed;
    private Boolean isGameOver;
    private Boolean hasBegun;
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private GameSetting settings;
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private TurnState turnState;
}
