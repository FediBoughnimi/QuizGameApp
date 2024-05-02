package com.game.quiz.controllers;

import com.game.quiz.entities.Character;
import com.game.quiz.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/characters")
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping
    public List<Character> getAllCharacters() {

        return characterRepository.findAll();
    }

    @PostMapping
    public Character addCharacter(@RequestBody Character character) {

        return characterRepository.save(character);
    }
    @PutMapping("/{id}")
    public Character updateCharacter(@PathVariable Long id, @RequestBody Character characterDetails) {
        Character character = characterRepository.findById(id).orElse(null);
        if (character != null) {
            character.setCharacter_name(characterDetails.getCharacter_name());
            character.setDescription(characterDetails.getDescription());
            character.setCharacter_photo(characterDetails.getCharacter_photo());
            character.setPrice(characterDetails.getPrice());
            return characterRepository.save(character);
        }
        return null;
    }


    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable Long id) {

        characterRepository.deleteById(id);
    }
}
