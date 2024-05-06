package com.game.quiz.services;

import com.game.quiz.entities.character_shopping;


import java.util.List;

public interface characterShoppingService {
    List<character_shopping> getShoppingsByPlayer(Long playerId);
    character_shopping addShoppingCharacter(character_shopping characterShopping);
    character_shopping getShoppingCharacterById(Long id);
    List<character_shopping> getAllShoppingCharacters();
}
