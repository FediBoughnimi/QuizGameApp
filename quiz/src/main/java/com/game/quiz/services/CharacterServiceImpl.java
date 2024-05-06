package com.game.quiz.services;

import com.game.quiz.entities.Character;
import com.game.quiz.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {
    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    @Override
    public Character getCharacterById(Long id) {
        return characterRepository.findById(id).orElse(null);
    }

    @Override
    public Character addCharacter(Character character) {
        return characterRepository.save(character);
    }

    @Override
    public Character updateCharacter(Long id, Character characterDetails) {
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

    @Override
    public void deleteCharacter(Long id) {
        characterRepository.deleteById(id);
    }
}
