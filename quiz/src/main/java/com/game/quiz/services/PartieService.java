package com.game.quiz.services;

import com.game.quiz.entities.Partie;

import java.util.List;
import java.util.Optional;

public interface PartieService {
    List<Partie> getAllParties();

    Optional<Partie> getPartieById(Integer id);

    Partie savePartie(Partie partie);

    void deletePartie(Integer id);

    // Ajouter d'autres méthodes si nécessaire
}
