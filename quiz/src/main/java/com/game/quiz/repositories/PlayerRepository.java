package com.game.quiz.repositories;

import com.game.quiz.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    // You can add custom query methods here if needed
}
