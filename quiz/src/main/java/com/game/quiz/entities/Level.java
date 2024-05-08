package com.game.quiz.entities;

import java.util.Collection;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Level {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int levelNumber;
	private String difficulty;
	private String description;


	@OneToMany(mappedBy = "level", cascade = CascadeType.ALL)
	public Collection<Question> questions;


	@ManyToMany
	@JoinTable(
			name = "Level_Categorie",
			joinColumns = @JoinColumn(name = "levelNumber"),
			inverseJoinColumns = @JoinColumn(name = "idCategorie")
	)
	private Set<Categorie> categories;




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
