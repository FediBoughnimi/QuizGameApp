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

	@OneToMany(mappedBy = "Categorie", cascade = CascadeType.ALL)/*One is the 'Categorie'(name of class) and Many is 'Partie'
    Cela signifie qu'une instance de cette classe peut avoir plusieurs instances associées d'une autre classe.*/
	public Collection<Partie> F ; //the Many

	@OneToMany(mappedBy = "Categorie", cascade = CascadeType.ALL)/*One is the 'Categorie'(name of class) and Many is 'Question'
    Cela signifie qu'une instance de cette classe peut avoir plusieurs instances associées d'une autre classe.*/
	public Collection <Question> G ; //the Many

	@ManyToMany(mappedBy = "categories")
	private Set<Level> levels;
	// we annotate the levels field with @ManyToMany(mappedBy = "categories").
	// This tells JPA that the relationship is mapped by the categories field in the Level class.

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
