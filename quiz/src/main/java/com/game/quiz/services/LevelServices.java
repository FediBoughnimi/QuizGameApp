package com.game.quiz.services;

import com.game.quiz.entities.Level;

import java.util.List;

public interface LevelServices {

        Level getlevelById(int numNiveau);
        ////////////////////
        List<Level> getAllLevelByIdCategory(int idCategorie);
        //////////////////////////
        List<Level> getLevelByNumberByCategory(int idCategorie, int levelNumber);
        //////////////////////////

}

