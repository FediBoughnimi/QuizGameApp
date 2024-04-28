package com.game.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Level {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int levelNumber;
	private String difficulty;
	private String description;
	public Level() {
		super();
	}
	public Level(String difficulty, String description) {
		super();
		this.difficulty = difficulty;
		this.description = description;
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
