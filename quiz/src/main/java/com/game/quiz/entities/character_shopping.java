package com.game.quiz.entities;


import jakarta.persistence.*;
import java.util.Date;

@Entity
public class character_shopping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long shopping_id;
    private Date shopping_date;

    @ManyToOne
    @JoinColumn(name = "idPlayer")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "character_id")
    private Character character;

    public character_shopping() {
    }

    public character_shopping(Player player, Character character) {
        this.player = player;
        this.character = character;
        this.shopping_date = new Date();
    }

    public Date getShopping_date() {
        return shopping_date;
    }

    public void setShopping_date(Date shopping_date) {
        this.shopping_date = shopping_date;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "character_shopping{" +
                "shopping_id=" + shopping_id +
                ", shopping_date=" + shopping_date +
                ", player=" + player +
                ", character=" + character +
                '}';
    }
}
