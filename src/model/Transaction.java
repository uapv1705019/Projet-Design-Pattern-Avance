package model;

public class Transaction {
	
	private String pays;
	private float montant;
	private String reference;
	private Compte acheteur;
	private CarteBancaire cbAcheteur;
	private String etat;
	
	
	public Transaction(String pays, float montant, String reference, Compte acheteur, String etat) {
		super();
		this.pays = pays;
		this.montant = montant;
		this.reference = reference;
		this.acheteur = acheteur;
		this.etat = etat;
	}
	
	public Transaction(String pays, float montant, String reference, CarteBancaire cbAcheteur, String etat) {
		super();
		this.pays = pays;
		this.montant = montant;
		this.reference = reference;
		this.cbAcheteur = cbAcheteur;
		this.etat = etat;
	}
	
	
	public CarteBancaire getCb() {
		return cbAcheteur;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Compte getAcheteur() {
		return acheteur;
	}
	public void setAcheteur(Compte acheteur) {
		this.acheteur = acheteur;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	public void demanderAutorisation(Compte c) {
	
		if(c.autoriser(this) == true) {
			this.setEtat("En cours");
		}
		this.setEtat("Echec");
	}
	
	public void createMemento() {
		
	}
	
	public void restore(MementoTransaction m) {
		
	}
	
}
