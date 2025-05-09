package com.cashflow.game.entity;

import com.cashflow.game.constant.Errors;
import com.cashflow.game.constant.Errors.InvalidArgumentsException;
import com.cashflow.game.model.Card;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Game {

    public static final int MAX_PLAYER_COUNT = 6;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Player> players = new ArrayList<>();
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Deck bigDeals = Deck.from(Card.TYPES.BIG_DEAL);
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Deck smallDeals = Deck.from(Card.TYPES.SMALL_DEAL);
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Deck marketCards = Deck.from(Card.TYPES.MARKET);
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Deck doodads = Deck.from(Card.TYPES.DOODAD);
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BoardPosition> ratRace = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BoardPosition> fastTrack = new ArrayList<>();
    private Instant createdAt = Instant.now();
    private Instant lastPlayed = Instant.now();
    private Boolean isGameOver = false;
    private Boolean hasBegun = false;
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private GameSetting settings;
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private TurnState turnState;

    public static Game createNewGame(List<Profile> profiles, GameSetting gameSetting) {
        if (profiles.size() > MAX_PLAYER_COUNT || profiles.size() < 2) throw new InvalidArgumentsException();
        var game = new Game();
        game.settings = gameSetting;
        profiles.forEach(profile -> game.players.add(Player.from(profile.getId())));
        return game;
    }

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
