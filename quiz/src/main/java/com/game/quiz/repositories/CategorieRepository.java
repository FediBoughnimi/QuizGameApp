package com.game.quiz.repositories;

import com.game.quiz.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    // You can add custom query methods here if needed
    Categorie findByIdCategorie(int idCategorie);
}

