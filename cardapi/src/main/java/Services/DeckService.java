package Services;

import Entity.Deck;

import java.util.List;

public interface DeckService {

    List<Deck> getDecks();
    Deck createDeck(Deck deck);
    void DeleteDeck(String name);

}
