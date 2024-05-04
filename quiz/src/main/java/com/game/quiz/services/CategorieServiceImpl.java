package com.game.quiz.services;

import com.game.quiz.entities.Categorie;
import com.game.quiz.repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieServiceImpl implements CategorieService {
    @Autowired
    private  CategorieRepository CategorieRepository;

    @Override
    public Categorie rechercheCategorie(int idCategorie) {
        return CategorieRepository.findByIdCategorie(idCategorie);
    }

    @Override
    public void afficheCategorie(Categorie categorie) {
        System.out.println("Category ID: " + categorie.getIdCategorie());
        System.out.println("Category Name: " + categorie.getCategorieName());
        System.out.println("Category Description: " + categorie.getCategorieDescription());
    }
}
