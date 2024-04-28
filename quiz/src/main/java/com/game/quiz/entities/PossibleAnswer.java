package com.game.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PossibleAnswer {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idPossibleAnswer;
	private String possibleAnswer;
	public PossibleAnswer() {
		super();
	}
	public PossibleAnswer(String possibleAnswer) {
		super();
		this.possibleAnswer = possibleAnswer;
	}
	public String getPossibleAnswer() {
		return possibleAnswer;
	}
	public void setPossibleAnswer(String possibleAnswer) {
		this.possibleAnswer = possibleAnswer;
	}
	@Override
	public String toString() {
		return "PossibleAnswer [possibleAnswer=" + possibleAnswer + "]";
	}
	
}
