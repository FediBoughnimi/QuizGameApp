package com.game.quiz.entities;

import jakarta.persistence.*;

@Entity
public class PossibleAnswer {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idPossibleAnswer;
	private String possibleAnswer;

	@ManyToOne
	private Question question;

	public PossibleAnswer() {
		super();
	}
	public PossibleAnswer(String possibleAnswer , Question question) {
		super();
		this.question = question;
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
