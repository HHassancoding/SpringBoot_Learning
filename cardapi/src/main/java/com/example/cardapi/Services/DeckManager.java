package com.example.cardapi.Services;

import com.example.cardapi.Entity.Card;
import com.example.cardapi.Entity.Deck;
import com.example.cardapi.Repositories.DeckRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeckManager implements DeckService {


    private final DeckRepo deckRepository;

    public DeckManager(DeckRepo deckRepository) {
        this.deckRepository = deckRepository;
    }

    @Override
    public List<Deck> getDecks() {
        return deckRepository.findAll();
    }

    @Override
    public Deck createDeck(Deck deck) {
        return deckRepository.save(deck);
    }

    @Override
    public void DeleteDeck(String name) {
        deckRepository.deleteAll(
                deckRepository.findAll().stream().filter(c -> c.getName().equals(name)).collect(Collectors.toList())
        );
    }


}
