package com.game.quiz.services;

import com.game.quiz.entities.Categorie;
import com.game.quiz.entities.Player;
import com.game.quiz.repositories.CategorieRepository;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService {
    @Autowired
    private  CategorieRepository CategorieRepository;

    @Override
    public Categorie getCategorybyid(int idCategorie) {//get all category to  modify later

        return CategorieRepository.findByIdCategorie(idCategorie);
    }

    ///////////////////////
    @Override
    public List<Categorie> getAllCategories() {
        return CategorieRepository.findAll();
    }
    ////////////

}
