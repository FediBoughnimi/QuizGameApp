package com.game.quiz.services;

import com.game.quiz.entities.character_shopping;
import com.game.quiz.repositories.characterShoppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class characterShoppingServiceImpl implements characterShoppingService{
    @Autowired
    private characterShoppingRepository characterShoppingRepository;


    @Override
    public List<character_shopping> getShoppingsByPlayer(Long playerId) {
        return characterShoppingRepository.findByPlayer_IdPlayer(playerId);
    }

    @Override
    public character_shopping addShoppingCharacter(character_shopping characterShopping) {
        return characterShoppingRepository.save(characterShopping);
    }

    @Override
    public character_shopping getShoppingCharacterById(Long id) {
        return characterShoppingRepository.findById(id).orElse(null);
    }

    @Override
    public List<character_shopping> getAllShoppingCharacters() {
        return characterShoppingRepository.findAll();
    }
}
