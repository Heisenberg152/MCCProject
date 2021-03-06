package model;

import java.math.BigDecimal;
import java.util.List;

public class Depense {

	private int idDepense;
	private String libelleDepense;
	private BigDecimal montant;
	private Personne depenseur;
	private List<Personne> creanciers;
	
	public Depense() {
		super();
	}
	
	public Depense(int idDepense, BigDecimal montant, Personne depenseur, List<Personne> creanciers) {
		super();
		this.idDepense = idDepense;
		this.montant = montant;
		this.depenseur = depenseur;
		this.creanciers = creanciers;
	}

	public int getIdDepense() {
		return idDepense;
	}

	public void setIdDepense(int idDepense) {
		this.idDepense = idDepense;
	}

	public BigDecimal getMontant() {
		return montant;
	}

	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}

	public Personne getDepenseur() {
		return depenseur;
	}

	public void setDepenseur(Personne depenseur) {
		this.depenseur = depenseur;
	}

	public List<Personne> getCreanciers() {
		return creanciers;
	}

	public void setCreanciers(List<Personne> creanciers) {
		this.creanciers = creanciers;
	}
	
	
}
