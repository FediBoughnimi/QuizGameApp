package com.game.quiz.controllers;

import com.game.quiz.entities.Categorie;
import com.game.quiz.services.CategorieService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategorieController {

    private final CategorieService categorieService;

    @Autowired
    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @GetMapping("/{id}")
    public Categorie getCategorieById(@PathVariable int id) {
        return categorieService.rechercheCategorie(id);
    }

    @PostMapping("/display")
    public void displayCategorie(@RequestBody Categorie categorie) {
        categorieService.afficheCategorie(categorie);
    }

}
