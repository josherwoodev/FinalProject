package com.cashflow.game.entity;

import com.cashflow.game.constant.Careers;
import com.cashflow.game.model.Asset;
import com.cashflow.game.model.Dream;
import com.cashflow.game.model.Expenses;
import com.cashflow.game.model.Liability;
import com.cashflow.game.model.Piece;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Player {

    public enum TARGET {
        SELF, ALL, NONE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long profileId;
    private Boolean hasWon = false;
    private Boolean isActive = true;
    @Enumerated(EnumType.STRING)
    private Piece.Set color;
    @Embedded
    private Status status;
    private Float cash = 0f;
    @Enumerated(EnumType.STRING)
    private Careers career;
    @ElementCollection
    private List<Asset> assets = new ArrayList<>();
    @ElementCollection
    private List<Liability> liabilities = new ArrayList<>();
    private Integer children = 0;
    @Embedded
    private Dream dream;
    @Embedded
    private Expenses expenses;

    public static Player from(Long profileId) {
        Player player = new Player();
        player.profileId = profileId;
        return player;
    }

    public Long getId() {
        return id;
    }

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public Boolean getHasWon() {
        return hasWon;
    }

    public void setHasWon(Boolean hasWon) {
        this.hasWon = hasWon;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Piece.Set getColor() {
        return color;
    }

    public void setColor(Piece.Set color) {
        this.color = color;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Float getCash() {
        return cash;
    }

    public void setCash(Float cash) {
        this.cash = cash;
    }

    public Careers getCareer() {
        return career;
    }

    public void setCareer(Careers career) {
        this.career = career;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public List<Liability> getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(List<Liability> liabilities) {
        this.liabilities = liabilities;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public Dream getDream() {
        return dream;
    }

    public void setDream(Dream dream) {
        this.dream = dream;
    }

    public Expenses getExpenses() {
        return expenses;
    }

    public void setExpenses(Expenses expenses) {
        this.expenses = expenses;
    }

    @Embeddable
    public class Status {

        private Integer turnsLost;
        private Integer turnsCharity;
        private Boolean onFastTrack;

        public Integer getTurnsLost() {
            return turnsLost;
        }

        public void setTurnsLost(Integer turnsLost) {
            this.turnsLost = turnsLost;
        }

        public Integer getTurnsCharity() {
            return turnsCharity;
        }

        public void setTurnsCharity(Integer turnsCharity) {
            this.turnsCharity = turnsCharity;
        }

        public Boolean getOnFastTrack() {
            return onFastTrack;
        }

        public void setOnFastTrack(Boolean onFastTrack) {
            this.onFastTrack = onFastTrack;
        }
    }
}
