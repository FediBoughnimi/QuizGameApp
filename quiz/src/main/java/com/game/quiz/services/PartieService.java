package com.game.quiz.services;

import com.game.quiz.entities.Partie;
import com.game.quiz.entities.Player;
import jakarta.servlet.http.Part;

import java.util.List;
import java.util.Optional;

public interface PartieService {
    List<Partie> getAllParties();

    Optional<Partie> getPartieById(Integer id);

    Partie savePartie(Partie partie);

    void deletePartie(Integer id);
    List<Partie> getAllPartiesByPlayer(Player player);

    // Ajouter d'autres méthodes si nécessaire
}
