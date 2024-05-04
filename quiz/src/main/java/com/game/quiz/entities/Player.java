package com.game.quiz.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Player {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idPlayer;
	private String userName;
	private String email;
	private String password;
	private int score;
	private int gold;
	@OneToMany(mappedBy = "player", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Partie> parties = new ArrayList<>();
	public Player() {
		super();
	}
	public Player(String userName, String email, String password, int score, int gold) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.score = score;
		this.gold = gold;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	@Override
	public String toString() {
		return "Player [userName=" + userName + ", email=" + email + ", password=" + password + ", score=" + score
				+ ", gold=" + gold + "]";
	}

}
