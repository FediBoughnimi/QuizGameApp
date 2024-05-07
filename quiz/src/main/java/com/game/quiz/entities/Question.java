package com.game.quiz.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Question {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idQuestion;
	private String containt;
	private String correctAnswer;
	private int goldQuestion;

	@ManyToOne
	private Level level;

	@ManyToOne
	private Categorie categorie;

	@OneToMany(mappedBy = "question" , cascade = CascadeType.ALL)
	private Set<PossibleAnswer> possibleAnswers ;

	public Question() {
		super();
	}
	public Question(String containt, String correctAnswer, int goldQuestion , Categorie categorie , Level level) {
		super();
		this.containt = containt;
		this.correctAnswer = correctAnswer;
		this.goldQuestion = goldQuestion;
		this.categorie = categorie;
		this.level = level ;
		this.possibleAnswers = new HashSet<>();

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
