package com.example.cardapi.Services;

import com.example.cardapi.Entity.Card;
import com.example.cardapi.Entity.Deck;

import java.util.List;

public interface DeckService {

    List<Deck> getDecks();
    Deck createDeck(Deck deck);
    void DeleteDeck(String name);

}
