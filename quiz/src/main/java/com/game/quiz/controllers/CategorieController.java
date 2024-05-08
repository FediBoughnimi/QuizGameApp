package com.game.quiz.controllers;

import com.game.quiz.entities.Categorie;
import com.game.quiz.entities.Player;
import com.game.quiz.repositories.CategorieRepository;
import com.game.quiz.services.CategorieService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategorieController {
    @Autowired
    private  CategorieService categorieService;

    @GetMapping()
    public List<Categorie> getAllCategories() {
        return categorieService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Categorie getCategorieById(@PathVariable int id) {
        return categorieService.getCategorybyid(id);
    }

    //////////////////////////////

        ///////////////////////////

    }

