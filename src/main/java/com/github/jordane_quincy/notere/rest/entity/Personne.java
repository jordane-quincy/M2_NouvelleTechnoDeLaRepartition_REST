package main.java.com.github.jordane_quincy.notere.rest.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Personne {

	private int id;

	private String nom;
	private String prenom;
	private int age;

	public Personne() {
		super();
		this.id = 0;
		this.nom = "Quincy";
		this.prenom = "Jordane";
		this.age = 26;
	}

	public int getAge() {
		return this.age;
	}

	public int getId() {
		return this.id;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
