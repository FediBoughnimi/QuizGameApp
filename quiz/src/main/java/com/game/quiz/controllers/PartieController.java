package com.game.quiz.controllers;

import com.game.quiz.entities.Partie;
import com.game.quiz.entities.Player;
import com.game.quiz.services.PartieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/parties")
public class PartieController {

    @Autowired
    private PartieService partieService;

    @GetMapping()
    public List<Partie> getAllParties() {
        return partieService.getAllParties();
    }

    @GetMapping("/{id}")
    public Optional<Partie> getPartieById(@PathVariable Integer id) {

        return partieService.getPartieById(id);
    }
    @PostMapping("/add")
    public Partie addPartie(@RequestBody Partie partie) {
        return partieService.savePartie(partie);
    }
    @PutMapping("/{id}")
    public Partie updatePartie(@PathVariable Integer id, @RequestBody Partie partie) {
        partie.setIdPartie(id); // Assurez-vous que l'ID de la partie est défini
        return partieService.savePartie(partie);
    }

    @DeleteMapping("/{id}")
    public void deletePartie(@PathVariable Integer id) {
        partieService.deletePartie(id);
    }

    @GetMapping("/byPlayer/{playerId}")
    public List<Partie> getAllPartiesByPlayerId(@PathVariable Long playerId) {
        Player player = new Player();
        player.setIdPlayer(playerId); // Assurez-vous que l'ID de la partie est défini
        return partieService.getAllPartiesByPlayer(player);
    }
     // Ajouter d'autres méthodes si nécessaire
}
