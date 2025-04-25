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
    private Boolean isActive = false;
    @Enumerated(EnumType.STRING)
    private Piece.Set color;
    @Embedded
    private Status status;
    private Float cash;
    @Enumerated(EnumType.STRING)
    private Careers career;
    @ElementCollection
    private List<Asset> assets;
    @ElementCollection
    private List<Liability> liabilities;
    private Integer children;
    @Embedded
    private Dream dream;
    @Embedded
    private Expenses expenses;

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
