package com.cashflow.game.entity;

import com.cashflow.game.model.Card;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class TurnState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer currentPlayer = -1;
    private Boolean playerHasMoved = false;
    private Boolean eventHasResolved = false;
    private Boolean saleIsActive = false;
    @Enumerated(EnumType.STRING)
    private Card.TYPES drawnCardType;
    private Integer drawnCardIndex = -1;
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Sale sale;
}
