package Repositories;

import Entity.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckRepo extends JpaRepository<Deck, Long> {
}
