package model;

public abstract class Personne 
{
	private String nom;
	private String prenom ;
	private String adresse;
	public Compte compte;
	public CarteBancaire carte;
	
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public CarteBancaire getCarte() {
		return carte;
	}
	public void setCarte(CarteBancaire carte) {
		this.carte = carte;
	}
	
}
