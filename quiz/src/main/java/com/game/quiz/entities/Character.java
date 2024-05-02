package com.game.quiz.entities;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(name = "`character`")

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long character_id;
    private String character_name;
    private String character_photo;
    private String Description;
    private int Price;
    @OneToMany(mappedBy = "character")
    private Set<character_shopping> characterShoppings ;


    public Character() {
    }

    public Character(String character_name, String character_photo, String description, int price) {
        this.character_name = character_name;
        this.character_photo = character_photo;
        Description = description;
        Price = price;
        characterShoppings = new HashSet<>();
    }

    public String getCharacter_name() {
        return character_name;
    }

    public String getCharacter_photo() {
        return character_photo;
    }

    public String getDescription() {
        return Description;
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

    public void setDescription(String description) {
        Description = description;
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
                ", Description='" + Description + '\'' +
                ", Price=" + Price +
                '}';
    }
}