package com.game.quiz.controllers;


import com.game.quiz.entities.character_shopping;
import com.game.quiz.repositories.characterShoppingRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.ClientInfoStatus;
import java.util.List;

@RestController
@RequestMapping("/charactersShopping")
public class characterShoppingController {

    @Autowired
    private characterShoppingRepository characterShoppingRepository;

    @GetMapping
    public List<character_shopping> getAllShoppingCharacters() {

        return characterShoppingRepository.findAll();
    }
    //get charactershopping by id
    @GetMapping("/{id}")
    public character_shopping getShoppingCharacterById(@PathVariable Long id) {

        return characterShoppingRepository.findById(id).orElse(null);
    }

    @PostMapping("/add")
    public character_shopping addShoppingCharacter(@RequestBody character_shopping characterShopping) {

        return characterShoppingRepository.save(characterShopping);
    }
    @GetMapping("/byPlayer/{playerId}")
    public List<character_shopping> getShoppingsByPlayer(@PathVariable Long playerId) {
        return characterShoppingRepository.findByPlayer_IdPlayer(playerId);
    }
}
