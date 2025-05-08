package com.cashflow.game.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Game> games;
    private String name;
    @ManyToMany
    private List<Profile> friends;
    @ManyToMany
    private List<Profile> friendRequests;
    @Embedded
    private Setting setting;
    @Embedded
    private History history;

    public Long getId() {
        return id;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Profile> getFriends() {
        return friends;
    }

    public void setFriends(List<Profile> friends) {
        this.friends = friends;
    }

    public List<Profile> getFriendRequests() {
        return friendRequests;
    }

    public void setFriendRequests(List<Profile> friendRequests) {
        this.friendRequests = friendRequests;
    }

    public Setting getSetting() {
        return setting;
    }

    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    @Embeddable
    public class Setting {

        public enum SPEED {
            SLOW, NORMAL, FAST;
        }

        private SPEED speed;
        private Boolean showHints;
        private Float autoSelectOpportunityByCash;

        public Setting() {
        }

        public Setting(SPEED speed, Boolean showHints, Float autoSelectOpportunityByCash) {
            this.speed = speed;
            this.showHints = showHints;
            this.autoSelectOpportunityByCash = autoSelectOpportunityByCash;
        }

        public SPEED getSpeed() {
            return speed;
        }

        public void setSpeed(SPEED speed) {
            this.speed = speed;
        }

        public Boolean getShowHints() {
            return showHints;
        }

        public void setShowHints(Boolean showHints) {
            this.showHints = showHints;
        }

        public Float getAutoSelectOpportunityByCash() {
            return autoSelectOpportunityByCash;
        }

        public void setAutoSelectOpportunityByCash(Float autoSelectOpportunityByCash) {
            this.autoSelectOpportunityByCash = autoSelectOpportunityByCash;
        }
    }

    @Embeddable
    public class History {

        private Double netWorth;
        private Integer gamesPlayed;
        private Integer gamesWon;

        public History() {
        }

        public History(Double netWorth, Integer gamesPlayed, Integer gamesWon) {
            this.netWorth = netWorth;
            this.gamesPlayed = gamesPlayed;
            this.gamesWon = gamesWon;
        }

        public Double getNetWorth() {
            return netWorth;
        }

        public void setNetWorth(Double netWorth) {
            this.netWorth = netWorth;
        }

        public Integer getGamesPlayed() {
            return gamesPlayed;
        }

        public void setGamesPlayed(Integer gamesPlayed) {
            this.gamesPlayed = gamesPlayed;
        }

        public Integer getGamesWon() {
            return gamesWon;
        }

        public void setGamesWon(Integer gamesWon) {
            this.gamesWon = gamesWon;
        }
    }
}
