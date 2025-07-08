package com.example.cardapi.Controllers;


import com.example.cardapi.Entity.Deck;
import com.example.cardapi.Services.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/decks")
public class DeckController {

    @Autowired
    private DeckService deckService;

    @GetMapping("/get")
    public List<Deck> getDecks() {
        return deckService.getDecks();
    }

    @PostMapping("/post")
    public Deck createDeck(@RequestBody Deck deck) {
        return deckService.createDeck(deck);
    }

    @DeleteMapping("/delete/{name}")
    public String deleteDeck(@PathVariable String name) {
        deckService.DeleteDeck(name);
        return "Deck deleted successfully";
    }



}
