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

		/*Player p1 = new Player("fedi","ferfer@gmail.com","123",120,20);

		Player p2 = new Player("amin","perper@gmail.com","456",110,20);

		Player p3 = new Player("louay","zerzer@gmail.com","789",95,20);

		service.savePlayer(p1);
		service.savePlayer(p2);
		service.savePlayer(p3);
		*/
	}

}
