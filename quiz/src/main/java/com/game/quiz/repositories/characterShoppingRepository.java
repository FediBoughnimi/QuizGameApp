package com.game.quiz.repositories;

import com.game.quiz.entities.character_shopping ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface characterShoppingRepository extends JpaRepository<character_shopping, Long> {

}
