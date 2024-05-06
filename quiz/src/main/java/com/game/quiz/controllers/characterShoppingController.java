package com.game.quiz.controllers;


import com.game.quiz.entities.character_shopping;
import com.game.quiz.services.characterShoppingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/charactersShopping")
public class characterShoppingController {

    @Autowired
    private characterShoppingService characterShoppingService;

    @GetMapping
    public List<character_shopping> getAllShoppingCharacters() {
        return characterShoppingService.getAllShoppingCharacters();
    }

    //get charactershopping by id
    @GetMapping("/{id}")
    public character_shopping getShoppingCharacterById(@PathVariable Long id) {
        return characterShoppingService.getShoppingCharacterById(id);
    }

    @PostMapping("/add")
    public character_shopping addShoppingCharacter(@RequestBody character_shopping characterShopping) {
        return characterShoppingService.addShoppingCharacter(characterShopping);
    }

    @GetMapping("/byPlayer/{playerId}")
    public List<character_shopping> getShoppingsByPlayer(@PathVariable Long playerId) {
        return characterShoppingService.getShoppingsByPlayer(playerId);
    }
}
