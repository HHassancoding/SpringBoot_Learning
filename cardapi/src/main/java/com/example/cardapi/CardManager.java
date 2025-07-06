package com.example.cardapi;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CardManager implements CardService {

    private final List<Card> cards = new ArrayList<>();


    public CardManager(){
        cards.add(new Card(3000, "Red Dragon", 7));
        cards.add(new Card(3500, "Blue eyes", 8));
    }


    @Override
    public List<Card> getCards() {
        return cards;
    }

    @Override
    public void addCards(Card card){
        cards.add(card);
    }

    @Override
    public void deleteCards(String name ){
        cards.removeIf(card -> card.getName().equals(name));
    }

    @Override
    public void updateCards(String name, Card updateCard) {
        for(int i =0; i<cards.size();i++){
            if(cards.get(i).getName().equalsIgnoreCase(name)){
                cards.set(i,updateCard);
            }
        }

    }
}
