package com.game.quiz.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
public class Level {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int levelId;
	private int levelNumber;
	private String difficulty;
	private String description;

	@OneToMany(mappedBy = "level" , cascade = CascadeType.ALL)
	private List<Question> questions;

	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private Categorie categorie;

	public Level() {
		super();
	}
	public Level(String difficulty, String description , Categorie categorie , int number) {
		super();
		this.levelNumber = number ;
		this.difficulty = difficulty;
		this.description = description;
		this.categorie = categorie;
		this.questions = new ArrayList<>();
	}

	public int getLevelNumber() {
		return levelNumber;
	}

	public void setLevelNumber(int levelNumber) {
		this.levelNumber = levelNumber;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Level{" +
				"levelNumber=" + levelNumber +
				", difficulty='" + difficulty + '\'' +
				", description='" + description + '\'' +
				", questions=" + questions +
				", categorie=" + categorie +
				'}';
	}
}
