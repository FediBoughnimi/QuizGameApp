package com.game.quiz.entities;

import jakarta.persistence.*;

@Table(name="Charater")
@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long character_id;
    private String character_name;
    private String character_photo;
    private String Descrition;
    private int Price;

    public Character() {
    }

    public Character(String character_name, String character_photo, String descrition, int price) {
        this.character_name = character_name;
        this.character_photo = character_photo;
        Descrition = descrition;
        Price = price;
    }

    public String getCharacter_name() {
        return character_name;
    }

    public String getCharacter_photo() {
        return character_photo;
    }

    public String getDescrition() {
        return Descrition;
    }

    public int getPrice() {
        return Price;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }

    public void setCharacter_photo(String character_photo) {
        this.character_photo = character_photo;
    }

    public void setDescrition(String descrition) {
        Descrition = descrition;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Character{" +
                "character_id=" + character_id +
                ", character_name='" + character_name + '\'' +
                ", character_photo='" + character_photo + '\'' +
                ", Descrition='" + Descrition + '\'' +
                ", Price=" + Price +
                '}';
    }
}