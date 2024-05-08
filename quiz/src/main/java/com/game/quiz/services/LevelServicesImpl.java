package com.game.quiz.services;

import com.game.quiz.repositories.LevelRepository;
import com.game.quiz.entities.Level;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class LevelServicesImpl implements LevelServices{
    @Autowired
    private LevelRepository LevelRepository;

    @Override
    public Level getlevelById(int levelNumber) {
        // Implement logic to search for a level by numNiveau
        return LevelRepository.findBylevelNumber(levelNumber);
    }
    //////////////////////
    @Override
    public List<Level> getAllLevelByIdCategory(int idCategorie) {
        return LevelRepository.findByCategoryId(idCategorie);
    }
    //////////////////////
    @Override
    public List<Level> getLevelByNumberByCategory(int idCategorie, int levelNumber) {
        return LevelRepository.findByCategories_IdAndNumberLevel(idCategorie, levelNumber);
    }
    /////////////////////////////////////////
}
