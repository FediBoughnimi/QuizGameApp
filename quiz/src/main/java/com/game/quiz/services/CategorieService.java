package com.game.quiz.services;

import com.game.quiz.entities.Categorie;
import com.game.quiz.entities.Player;

import java.util.List;

public interface CategorieService {

    Categorie getCategorybyid(int idCategorie);

    ///////////////
    List<Categorie> getAllCategories();
    //////////////////

}
