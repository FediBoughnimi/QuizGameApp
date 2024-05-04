package com.game.quiz.services;

import com.game.quiz.entities.Categorie;

public interface CategorieService {

    Categorie rechercheCategorie(int idCategorie);
    void afficheCategorie(Categorie categorie);

}
