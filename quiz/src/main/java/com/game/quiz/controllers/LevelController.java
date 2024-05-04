package com.game.quiz.controllers;

import com.game.quiz.entities.Level;
import com.game.quiz.services.LevelServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/level")

public class LevelController {
    @Autowired
    private LevelServices levelServices;


    @GetMapping("/recherche/{numNiveau}")
    public Level recherchNiveau(@PathVariable int numNiveau) {
        return levelServices.recherchNiveau(numNiveau);
    }
}