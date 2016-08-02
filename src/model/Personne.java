package model;

import java.util.Date;

public class Personne {

	private int idPersonne;
	private String nom;
	private String prenom;
	private int nombreChromosome;
	private float montant;
	
	public Personne() {
		super();
	}


	public Personne(int idPersonne, String nom, String prenom, int nombreChromosome, Date dateNaissance,
			float montant) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
		this.nombreChromosome = nombreChromosome;
		this.montant = montant;
	}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNombreChromosome() {
		return nombreChromosome;
	}

	public void setNombreChromosome(int nombreChromosome) {
		this.nombreChromosome = nombreChromosome;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public int getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	
}
