package com.game.quiz.repositories;

import com.game.quiz.entities.Partie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartieRepository extends JpaRepository<Partie, Integer> {
    // Ajouter des méthodes spécifiques si nécessaire
}
