package com.example.cardapi.Entity;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "deck_id")
    private Deck deck;

    private int attack;
    private String name;
    private int level;


    public Card(int attack, String name, int level) {
        this.attack = attack;
        this.name = name;
        this.level = level;
    }
    public Card(){
    }

    public Long getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card cards = (Card) o;
        return attack == cards.attack && level == cards.level && Objects.equals(name, cards.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attack, name, level);
    }

    public Deck getDeck() {
        return deck;
    }
    public void setDeck(Deck deck) {
        this.deck = deck;
    }
}
