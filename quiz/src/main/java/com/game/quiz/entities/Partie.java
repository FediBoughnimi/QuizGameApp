package com.game.quiz.entities;

import jakarta.persistence.*;

@Entity
public class Partie {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idPartie;
	private int levelReached;


	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private Categorie Categorie;




	public Partie() {
		super();
	}
	public Partie(int levelReached) {
		super();
		this.levelReached = levelReached;
	}
	public int getLevelReached() {
		return levelReached;
	}
	public void setLevelReached(int levelReached) {
		this.levelReached = levelReached;
	}
	@Override
	public String toString() {
		return "Partie [levelReached=" + levelReached + "]";
	}
	
}
