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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Deck getBigDeals() {
        return bigDeals;
    }

    public void setBigDeals(Deck bigDeals) {
        this.bigDeals = bigDeals;
    }

    public Deck getSmallDeals() {
        return smallDeals;
    }

    public void setSmallDeals(Deck smallDeals) {
        this.smallDeals = smallDeals;
    }

    public Deck getMarketCards() {
        return marketCards;
    }

    public void setMarketCards(Deck marketCards) {
        this.marketCards = marketCards;
    }

    public Deck getDoodads() {
        return doodads;
    }

    public void setDoodads(Deck doodads) {
        this.doodads = doodads;
    }

    public List<BoardPosition> getRatRace() {
        return ratRace;
    }

    public void setRatRace(List<BoardPosition> ratRace) {
        this.ratRace = ratRace;
    }

    public List<BoardPosition> getFastTrack() {
        return fastTrack;
    }

    public void setFastTrack(List<BoardPosition> fastTrack) {
        this.fastTrack = fastTrack;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getLastPlayed() {
        return lastPlayed;
    }

    public void setLastPlayed(Instant lastPlayed) {
        this.lastPlayed = lastPlayed;
    }

    public Boolean getGameOver() {
        return isGameOver;
    }

    public void setGameOver(Boolean gameOver) {
        isGameOver = gameOver;
    }

    public Boolean getHasBegun() {
        return hasBegun;
    }

    public void setHasBegun(Boolean hasBegun) {
        this.hasBegun = hasBegun;
    }

    public GameSetting getSettings() {
        return settings;
    }

    public void setSettings(GameSetting settings) {
        this.settings = settings;
    }

    public TurnState getTurnState() {
        return turnState;
    }

    public void setTurnState(TurnState turnState) {
        this.turnState = turnState;
    }
}
