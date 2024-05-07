package com.game.quiz.entities;

import jakarta.persistence.*;

@Entity
public class Question {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idQuestion;
	private String containt;
	private String correctAnswer;
	private int goldQuestion;


	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private Categorie Categorie;
	@ManyToOne
	@JoinColumn(name = "levelNumber")
	private Level Level; // corrected property name to match the mappedBy attribute in Level


	public Question() {
		super();
	}
	public Question(String containt, String correctAnswer, int goldQuestion) {
		super();
		this.containt = containt;
		this.correctAnswer = correctAnswer;
		this.goldQuestion = goldQuestion;
	}
	public String getContaint() {
		return containt;
	}
	public void setContaint(String containt) {
		this.containt = containt;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public int getGoldQuestion() {
		return goldQuestion;
	}
	public void setGoldQuestion(int goldQuestion) {
		this.goldQuestion = goldQuestion;
	}
	@Override
	public String toString() {
		return "Question [containt=" + containt + ", correctAnswer=" + correctAnswer + ", goldQuestion=" + goldQuestion
				+ "]";
	}

}
