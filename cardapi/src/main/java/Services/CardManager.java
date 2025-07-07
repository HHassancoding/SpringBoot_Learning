package Services;


import Entity.Card;
import Repositories.CardRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CardManager implements CardService {

    private CardRepo cardRepository;


    public CardManager(CardRepo cardRepository) {
        this.cardRepository = cardRepository;
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
}
