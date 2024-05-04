package com.game.quiz.services;

import com.game.quiz.repositories.LevelRepository;
import com.game.quiz.entities.Level;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LevelServicesImpl implements LevelServices{
    @Autowired
    private LevelRepository LevelRepository;

    @Override
    public Level recherchNiveau(int levelNumber) {
        // Implement logic to search for a level by numNiveau
        return LevelRepository.findBylevelNumber(levelNumber);
    }
}
