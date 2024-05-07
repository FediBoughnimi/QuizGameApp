package com.game.quiz.services;

import com.game.quiz.entities.Partie;
import com.game.quiz.entities.Player;
import com.game.quiz.repositories.PartieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartieServiceImpl implements PartieService {

    @Autowired
    private PartieRepository partieRepository;

    @Override
    public List<Partie> getAllParties() {
        return partieRepository.findAll();
    }

    @Override
    public Optional<Partie> getPartieById(Integer id) {
        return partieRepository.findById(id);
    }

    @Override
    public Partie savePartie(Partie partie) {
        return partieRepository.save(partie);
    }

    @Override
    public void deletePartie(Integer id) {
        partieRepository.deleteById(id);
    }

    @Override
    public List<Partie> getAllPartiesByPlayer(Player player) {
        return partieRepository.findAllByPlayer(player);
    }

    // Ajouter d'autres méthodes si nécessaire
}
