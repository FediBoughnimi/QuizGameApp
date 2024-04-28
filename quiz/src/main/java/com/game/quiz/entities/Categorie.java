package com.game.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categorie {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idCategorie;
	private String CategorieName;
	private String CategorieDescription;
	public Categorie() {
		super();
	}
	public Categorie(String categorieName, String categorieDescription) {
		super();
		this.CategorieName = categorieName;
		this.CategorieDescription = categorieDescription;
	}
	public String getCategorieName() {
		return CategorieName;
	}
	public void setCategorieName(String categorieName) {
		CategorieName = categorieName;
	}
	public String getCategorieDescription() {
		return CategorieDescription;
	}
	public void setCategorieDescription(String categorieDescription) {
		CategorieDescription = categorieDescription;
	}
	@Override
	public String toString() {
		return "Categorie [CategorieName=" + CategorieName + ", CategorieDescription=" + CategorieDescription + "]";
	}
	
}
