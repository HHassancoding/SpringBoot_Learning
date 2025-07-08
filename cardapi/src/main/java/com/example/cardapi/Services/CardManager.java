package com.example.cardapi.Services;


import com.example.cardapi.Entity.Card;
import com.example.cardapi.Entity.Deck;
import com.example.cardapi.Repositories.CardRepo;
import com.example.cardapi.Repositories.DeckRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class CardManager implements CardService {

    private final CardRepo cardRepository;
    private final DeckRepo deckRepository;


    public CardManager(CardRepo cardRepository, DeckRepo deckRepository) {
        this.cardRepository = cardRepository;
        this.deckRepository = deckRepository;
    }

    @Override
    public List<Card> getCards() {return cardRepository.findAll();}

    @Override
    public void addCards(Card card){cardRepository.save(card);}

    @Override
    public void deleteCards(String name){
        cardRepository.deleteAll(
                cardRepository.findAll().stream().filter(c -> c.getName().equals(name)).collect(Collectors.toList())
        );

    }

    @Override
    public void updateCards(String name, Card updateCard) {
        deleteCards(name);
        cardRepository.save(updateCard);
    }

    @Override
    public Card addCardToDeck(String name, Card card) {

        Optional<Deck> optionalDeck = deckRepository.findByName(name);

        Deck deck = optionalDeck.orElseThrow(() -> new RuntimeException("Deck not found"));
        card.setDeck(deck);
        return cardRepository.save(card);

    }
}
