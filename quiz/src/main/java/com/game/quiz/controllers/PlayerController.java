package com.game.quiz.controllers;

import com.game.quiz.entities.Player;
import com.game.quiz.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    // Get all players
    @GetMapping
    public List<Player> getAllPlayers() {

        return playerRepository.findAll();
    }

    // Get player by ID
    @GetMapping("/{id}")
    public Player getPlayerById(@PathVariable Long id) {

        return playerRepository.findById(id).orElse(null);
    }

    // Add a new player
    @PostMapping("/add")
    public Player addPlayer(@RequestBody Player player) {

        return playerRepository.save(player);
    }

    // Update player details
    @PutMapping("/update/{id}")
    public Player updatePlayer(@PathVariable Long id, @RequestBody Player playerDetails) {
        Player player = playerRepository.findById(id).orElse(null);
        if (player != null) {
            player.setUserName(playerDetails.getUserName());
            player.setEmail(playerDetails.getEmail());
            player.setPassword(playerDetails.getPassword());
            player.setScore(playerDetails.getScore());
            player.setGold(playerDetails.getGold());
            return playerRepository.save(player);
        }
        return null;
    }

    // Delete a player
    @DeleteMapping("/delete/{id}")
    public void deletePlayer(@PathVariable Long id) {

        playerRepository.deleteById(id);
    }
}