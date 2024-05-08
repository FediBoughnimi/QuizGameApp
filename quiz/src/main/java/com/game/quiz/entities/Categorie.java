package com.game.quiz.entities;

import jakarta.persistence.*;

import java.util.Collection;

import java.util.Set;

@Entity
public class Categorie {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idCategorie;
	private String CategorieName;
	private String CategorieDescription;

	@OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
	public Collection<Partie> parties ;

	@OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
	public Collection<Question> questions;

	@ManyToMany(mappedBy = "categories")
	private Set<Level> levels;


	public Categorie() {
		super();
	}
	public Categorie(String categorieName, String categorieDescription) {
		super();
		this.CategorieName = categorieName;
		this.CategorieDescription = categorieDescription;
	}
	public int getIdCategorie() { return idCategorie; }
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
