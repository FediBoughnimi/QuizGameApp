package com.game.quiz.repositories;

import com.game.quiz.entities.character_shopping ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface characterShoppingRepository extends JpaRepository<character_shopping, Long> {
    List<character_shopping> findByPlayer_IdPlayer(Long playerId);



}
