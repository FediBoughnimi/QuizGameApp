package com.game.quiz.entities;

import jakarta.persistence.*;

@Entity
public class Partie {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idPartie;
	private int levelReached;

	@ManyToOne
	@JoinColumn(name = "idPlayer")
	private Player player;

	@ManyToOne
	@JoinColumn(name ="idCategorie")
	private Categorie categorie;



	public Partie() {

		super();
	}
	public Partie(Player player , Categorie categorie) {
		super();
		this.categorie=categorie;
		this.player=player;
		this.levelReached = 0;
	}

	public int getIdPartie() {
		return idPartie;
	}

	public void setIdPartie(int idPartie) {
		this.idPartie = idPartie;
	}

	public int getLevelReached() {
		return levelReached;
	}

	public void setLevelReached(int levelReached) {
		this.levelReached = levelReached;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Partie{" +
				"idPartie=" + idPartie +
				", levelReached=" + levelReached +
				", player=" + player +
				", categorie=" + categorie +
				'}';
	}
}
