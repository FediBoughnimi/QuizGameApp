package com.game.quiz.controllers;


import com.game.quiz.entities.character_shopping;
import com.game.quiz.repositories.characterShoppingRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characterShopping")
public class characterShoppingController {

    @Autowired
    private characterShoppingRepository characterShoppingRepository;

    @GetMapping
    public List<character_shopping> getAllShoppingCharacters() {

        return characterShoppingRepository.findAll();
    }

    @PostMapping
    public character_shopping addShoppingCharacter(@RequestBody character_shopping characterShopping) {

        return characterShoppingRepository.save(characterShopping);
    }
}
