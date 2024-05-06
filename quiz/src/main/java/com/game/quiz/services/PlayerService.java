package com.game.quiz.services;

import com.game.quiz.entities.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {
    List<Player> getAllPlayers();

    Optional<Player> getPlayerById(Long id);

    Player savePlayer(Player player);

    void deletePlayer(Long id);

    // Ajouter d'autres méthodes si nécessaire
}
