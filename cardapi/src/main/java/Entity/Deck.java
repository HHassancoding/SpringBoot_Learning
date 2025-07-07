package Entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Deck {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Card> cards;

    public Deck(String name) {
        this.name = name;
    }

    public Deck() {}

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Card> getCards() {
        return cards;
    };

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
