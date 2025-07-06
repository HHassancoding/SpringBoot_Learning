package com.example.cardapi;

import java.util.Objects;

public class Card {


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
}
