package com.game.quiz.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
public class Level {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int levelNumber;
	private String difficulty;
	private String description;

	@OneToMany(mappedBy = "level" , cascade = CascadeType.ALL)
	private List<Question> questions;

	@ManyToOne
	private Categorie categorie;

	public Level() {
		super();
	}
	public Level(String difficulty, String description , Categorie categorie) {
		super();
		this.difficulty = difficulty;
		this.description = description;
		this.categorie = categorie;
		this.questions = new ArrayList<>();
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
	@Override
	public String toString() {
		return "Level [difficulty=" + difficulty + ", description=" + description + "]";
	}
	
}
