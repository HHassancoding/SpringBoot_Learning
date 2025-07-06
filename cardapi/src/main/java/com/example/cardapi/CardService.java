package com.example.cardapi;

import java.util.List;

public interface CardService {

    List<Card> getCards();

    void addCards(Card card);

    void deleteCards(String name);

    void updateCards( String name, Card card);

}
