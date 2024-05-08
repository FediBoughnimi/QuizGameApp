package com.game.quiz.controllers;

import com.game.quiz.entities.Level;
import com.game.quiz.services.LevelServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/levels")
public class LevelController {
    @Autowired
    private LevelServices levelServices;


    @GetMapping("/{numNiveau}")
    public Level getlevelById(@PathVariable int numNiveau) {

        return levelServices.getlevelById(numNiveau);
    }


    @GetMapping("/ByCategory/{idCategorie}")
    public List<Level> getAllLevelsByCategoryId(@PathVariable int idCategorie) {
        return levelServices.getAllLevelByIdCategory(idCategorie);
    }

    @GetMapping("/ByCategory/{idCategorie}/Bylevel/{numberLevel}")
    public List<Level> getLevelByNumberByCategory(@PathVariable int idCategorie, @PathVariable int numberLevel) {
        return levelServices.getLevelByNumberByCategory(idCategorie, numberLevel);
    }

}