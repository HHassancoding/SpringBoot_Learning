package com.example.cardapi.Repositories;

import com.example.cardapi.Entity.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeckRepo extends JpaRepository<Deck, Long> {
    Optional<Deck> findByName(String name);


}
