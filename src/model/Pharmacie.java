package model;

import java.util.ArrayList;

public abstract class Pharmacie 
{
	private String nom;
	private int nb_employes;
	private ArrayList<Employe> liste_employes;
	private ArrayList<Produit> liste_produits;
	private double surface_commerciale;
	private String type_pharmacie;
	private String SIRET;
	
	public Pharmacie(String nom, double surface_commerciale, String type_pharmacie, String sIRET) 
	{
		super();
		this.nom = nom;
		this.surface_commerciale = surface_commerciale;
		this.type_pharmacie = type_pharmacie;
		SIRET = sIRET;
	}
	
	public void ajouterEmploye(Employe employe)
	{
		this.liste_employes.add(employe);
	}
	
	public void supprimerEmploye(String nom, String prenom, String adresse)
	{
		for(int i = 0; i< this.liste_employes.size(); i++)
		{
			Employe tmp = this.liste_employes.get(i);
			if(tmp.getNom() == nom && tmp.getPrenom() == prenom && tmp.getAdresse() == adresse)
			{
				this.liste_employes.remove(i);
				break;
			}
		}
	}
	
	public void ajouterProduit(Produit produit, double prix_vente) // le prix de vente étant fixé par la pharmacie, j'ai décidé de le faire ici
	{
		produit.setPrix_vente(prix_vente);
		this.liste_produits.add(produit);
	}
	
	public void supprimerProduit(String id, String nom)
	{
		for(int i = 0; i< this.liste_produits.size(); i++)
		{
			Produit tmp = this.liste_produits.get(i);
			if(tmp.getId() == id && tmp.getNom() == nom)
			{
				this.liste_produits.remove(i);
				break;
			}
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNb_employes() {
		return nb_employes;
	}

	public void setNb_employes(int nb_employes) {
		this.nb_employes = nb_employes;
	}

	public double getSurface_commerciale() {
		return surface_commerciale;
	}

	public void setSurface_commerciale(double surface_commerciale) {
		this.surface_commerciale = surface_commerciale;
	}

	public String getType_pharmacie() {
		return type_pharmacie;
	}

	public void setType_pharmacie(String type_pharmacie) {
		this.type_pharmacie = type_pharmacie;
	}

	public String getSIRET() {
		return SIRET;
	}

	public void setSIRET(String sIRET) {
		SIRET = sIRET;
	}
	
	
	
	
};
