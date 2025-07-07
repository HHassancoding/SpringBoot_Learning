package Controllers;

import Entity.Card;
import Services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/card")
public class CardController {
    private final CardService cardService;


    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }


    @GetMapping("/get")
    public List<Card> getAllCard(){
        return cardService.getCards();
    }


    @PostMapping("/post")
    public String addCard(@RequestBody Card card){
        cardService.addCards(card);
        return "Added " + card.getName();
    }

    @DeleteMapping("/delete/{name}")
    public String deleteCard(@PathVariable String name){
        cardService.deleteCards(name);
        return name + " Deleted";
    }

    @PutMapping("/update/{name}")
    public String updateCard(@PathVariable String name, @RequestBody Card card){
        cardService.updateCards(name, card);
        return "Updated " + card.getName();

    }

}
