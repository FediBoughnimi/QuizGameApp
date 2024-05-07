package com.game.quiz.entities;

import java.util.Collection;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Level {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int levelNumber;
	private String difficulty;
	private String description;

///////////////////////////// this is the new coulumn
	private int Number_level;



	@OneToMany(mappedBy = "Level", cascade = CascadeType.ALL)/*One is the 'Level'(name of class) and Many is 'Question'
    Cela signifie qu'une instance de cette classe peut avoir plusieurs instances associées d'une autre classe.*/
	public Collection <Question> x ; //the Many


	@ManyToMany
	@JoinTable(
			name = "Level_Categorie",
			joinColumns = @JoinColumn(name = "levelNumber"),
			inverseJoinColumns = @JoinColumn(name = "idCategorie")
	)
	private Set<Categorie> categories;

	/**name = "Level_Categorie": This specifies the name of the join table that will be created in the
	 database to manage the many-to-many relationship between Level and Categorie entities. In this case,
	 the join table will be named Level_Categorie.*/

	/** we annotate the categories field with @ManyToMany.
	This establishes the many-to-many relationship between Level and Categorie.*/

	/**We use the @JoinTable annotation to specify the name of the join table (Level_Categorie) and the
	 foreign key columns (levelNumber and idCategorie).*/

	/**With these annotations, JPA will create the necessary join table (Level_Categorie) to manage the
	 many-to-many relationship between Level and Categorie entities.*/


	public Level() {
		super();
	}
	public Level(String difficulty, String description) {
		super();
		this.difficulty = difficulty;
		this.description = description;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Level [difficulty=" + difficulty + ", description=" + description + "]";
	}
	
}
