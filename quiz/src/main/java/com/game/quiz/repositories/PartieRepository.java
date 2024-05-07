package com.game.quiz.repositories;

import com.game.quiz.entities.Partie;
import com.game.quiz.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartieRepository extends JpaRepository<Partie, Integer> {
    List<Partie> findAllByPlayer(Player player);
}