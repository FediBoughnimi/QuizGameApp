package com.game.quiz.repositories;

import com.game.quiz.entities.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepository extends JpaRepository<Level, Long> {
    // You can add custom query methods here if needed
}
