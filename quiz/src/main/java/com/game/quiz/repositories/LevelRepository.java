package com.game.quiz.repositories;

import com.game.quiz.entities.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LevelRepository extends JpaRepository<Level, Long> {
    // You can add custom query methods here if needed
    Level findBylevelNumber(int levelNumber);
    @Query("SELECT l FROM Level l JOIN l.categories c WHERE c.idCategorie = :categoryId")
    List<Level> findByCategoryId(@Param("categoryId") int categoryId);

    @Query("SELECT l FROM Level l JOIN l.categories c WHERE c.idCategorie = :categoryId AND l.Number_level = :Number_level")
    List<Level> findByCategories_IdAndNumberLevel(@Param("categoryId") int categoryId, @Param("Number_level") int Number_level);
}
