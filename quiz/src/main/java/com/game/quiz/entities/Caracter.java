package com.game.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Caracter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long caracter_id;
    private String caracter_name;
    private String caracter_photo;
    private String Descrition;
    private int Price;

    public Caracter() {
    }

    public Caracter(String caracter_name, String caracter_photo, String descrition, int price) {
        this.caracter_name = caracter_name;
        this.caracter_photo = caracter_photo;
        Descrition = descrition;
        Price = price;
    }

    public String getCaracter_name() {
        return caracter_name;
    }

    public String getCaracter_photo() {
        return caracter_photo;
    }

    public String getDescrition() {
        return Descrition;
    }

    public int getPrice() {
        return Price;
    }

    public void setCaracter_name(String caracter_name) {
        this.caracter_name = caracter_name;
    }

    public void setCaracter_photo(String caracter_photo) {
        this.caracter_photo = caracter_photo;
    }

    public void setDescrition(String descrition) {
        Descrition = descrition;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Caracter{" +
                "caracter_id=" + caracter_id +
                ", caracter_name='" + caracter_name + '\'' +
                ", caracter_photo='" + caracter_photo + '\'' +
                ", Descrition='" + Descrition + '\'' +
                ", Price=" + Price +
                '}';
    }
}