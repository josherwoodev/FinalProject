package com.cashflow.game.entity;

import jakarta.persistence.Entity;
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

    private Integer currentPlayer = 0;
    private Boolean playerHasMoved = false;
    private Boolean eventHasResolved = false;
    private Boolean saleIsActive = false;
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Sale sale;
}
