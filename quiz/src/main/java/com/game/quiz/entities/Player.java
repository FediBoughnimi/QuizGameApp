package com.game.quiz.entities;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
public class Player {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idPlayer;
	@Column(unique = true)
	private String userName;
	@Column(unique = true)
	private String email;
	private String password;
	private int score;
	private int gold;

	@OneToMany(mappedBy = "player" , cascade = CascadeType.ALL)
	private Set<character_shopping> characterShoppings;

	@OneToMany(mappedBy = "player" , cascade = CascadeType.ALL)
	private List<Partie> parties;

	public Player() {

	}
	public Player(String userName, String email, String password) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.score = 0;
		this.gold = 0;
		characterShoppings = new HashSet<>();

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
