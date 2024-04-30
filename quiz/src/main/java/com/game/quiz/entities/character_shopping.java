package com.game.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class character_shopping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long shopping_id ;
    private Date shopping_date;

    public character_shopping() {
    }

    public Date getShopping_date() {
        return shopping_date;
    }

    public void setShopping_date(Date shopping_date) {
        this.shopping_date = shopping_date;
    }

    @Override
    public String toString() {
        return "character_shopping{" +
                "shopping_id=" + shopping_id +
                ", shopping_date=" + shopping_date +
                '}';
    }
}
