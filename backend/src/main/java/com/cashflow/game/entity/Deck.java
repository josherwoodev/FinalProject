package com.cashflow.game.entity;

import com.cashflow.game.constant.GameCards;
import com.cashflow.game.model.Card;
import com.cashflow.game.persistance.IntegerListToStringConverter;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Entity
public class Deck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Convert(converter = IntegerListToStringConverter.class)
    private List<Integer> cardIndices;
    private Integer currentCardIndex;
    @Enumerated(EnumType.STRING)
    private Card.TYPES cardType;

    public Deck() {
    }

    public Deck(List<Integer> cardIndices, Integer currentCardIndex, Card.TYPES cardType) {
        this.cardIndices = cardIndices;
        this.currentCardIndex = currentCardIndex;
        this.cardType = cardType;
    }

    public static Deck from(Card.TYPES type) {
        Deck deck = new Deck();
        deck.cardType = type;
        var src = getSrc(type);
        var temp = new Integer[src.length];
        for (int i = 0; i < src.length; ++i) temp[i] = i;
        deck.cardIndices = Arrays.asList(temp);
        Collections.shuffle(deck.cardIndices);
        deck.currentCardIndex = 0;
        return deck;
    }

    public Card drawNextCard() {
        var src = getSrc(cardType);
        if (currentCardIndex >= cardIndices.size()) {
            currentCardIndex = 0;
            Collections.shuffle(cardIndices);
        }
        return src[cardIndices.get(currentCardIndex++)];
    }

    private static Card[] getSrc(Card.TYPES type) {
        return switch (type) {
            case Card.TYPES.BIG_DEAL -> GameCards.BIG_DEALS;
            case Card.TYPES.SMALL_DEAL -> GameCards.SMALL_DEALS;
            case Card.TYPES.MARKET -> GameCards.MARKET_CARDS;
            case Card.TYPES.DOODAD -> GameCards.DOODADS;
            default ->
                    throw new IllegalArgumentException("Unknown card type: " + type);
        };
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Integer> getCardIndices() {
        return cardIndices;
    }

    public void setCardIndices(List<Integer> cardIndices) {
        this.cardIndices = cardIndices;
    }

    public Integer getCurrentCardIndex() {
        return currentCardIndex;
    }

    public void setCurrentCardIndex(Integer currentCardIndex) {
        this.currentCardIndex = currentCardIndex;
    }

    public Card.TYPES getCardType() {
        return cardType;
    }

    public void setCardType(Card.TYPES cardType) {
        this.cardType = cardType;
    }
}
