package com.game.quiz;


import com.game.quiz.entities.Player;
import com.game.quiz.services.PlayerServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class QuizApplication implements CommandLineRunner {
	private PlayerServiceImpl service;

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Add your logic here
		System.out.println("Application started!");


	}

}
