package com.example.cardapi.Services;

import com.example.cardapi.Entity.Card;

import java.util.List;

public interface CardService {

    List<Card> getCards();

    void addCards(Card card);

    void deleteCards(String name);

    void updateCards(String name, Card card);

    Card addCardToDeck(String name, Card card);

}
