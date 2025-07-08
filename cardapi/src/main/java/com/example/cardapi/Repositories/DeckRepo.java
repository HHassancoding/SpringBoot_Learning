package com.example.cardapi.Repositories;

import com.example.cardapi.Entity.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckRepo extends JpaRepository<Deck, Long> {
}
