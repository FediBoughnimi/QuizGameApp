package com.game.quiz.services;

import com.game.quiz.entities.Character;

import java.util.List;

public interface CharacterService {
    List<Character> getAllCharacters();
    Character getCharacterById(Long id);
    Character addCharacter(Character character);
    Character updateCharacter(Long id, Character characterDetails);
    void deleteCharacter(Long id);
}
