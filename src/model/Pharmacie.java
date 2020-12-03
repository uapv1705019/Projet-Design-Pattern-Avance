package model;

import java.util.ArrayList;

public abstract class Pharmacie //TODO gérer les stocks des produits
{
	private String nom;
	private int nb_employes;
	private ArrayList<Employe> liste_employes = new ArrayList<Employe>();
	private ArrayList<Produit> liste_produits = new ArrayList<Produit>();
	private double surface_commerciale;
	private String type_pharmacie;
	private String SIRET;
	private int nb_produits_vendus;
	private Compte compteFranchise;
	private Compte compteClassique;
	
	public Pharmacie(String nom, double surface_commerciale, String type_pharmacie, String SIRET) 
	{
		super();
		this.nom = nom;
		this.surface_commerciale = surface_commerciale;
		this.type_pharmacie = type_pharmacie;
		this.SIRET = SIRET;
	}
	
	public void ajouterCompte(Compte c) {
		if(c.getType() == "franchise" && this.compteFranchise == null && this.type_pharmacie == "franchisee") {
			this.compteFranchise = c;
		}
		else if(c.getType() == "classique" && this.compteClassique == null) {
			this.compteClassique = c;
		}
		return;
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
	
	public void ajouterProduit(Produit produit, double prix_vente, int stock) // le prix de vente étant fixé par la pharmacie, j'ai décidé de le faire ici
	{
		produit.setPrix_vente(prix_vente);
		produit.setStock(stock);
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

	public void primePharmaciens() // Ici je veux donner une prime à chaque PharmacienDiplome. Or, dans la liste_employes, ce sont des Employe, qui peuvent être soit PharmacienDiplome, soit PreparateurCommande. Créer une ArrayList contenant plusieurs types n'est pas une bonne idée. Je ne vois pas comment faire 
	{
		/*for(int i = 0; i< this.liste_employes.size(); i++)
		{
			Employe tmp = this.liste_employes.get(i);
			if(tmp.getType_employe() == "Pharmacien diplome")
			{
				PharmacienDiplome tmp1 = (PharmacienDiplome) this.liste_employes.get(i);
				tmp1.setPrime(this.nb_produits_vendus/100);
				//TODO réinsérer l'élément dans la liste_employes
			}
		}*/
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

	public int getNb_produits_vendus() {
		return nb_produits_vendus;
	}

	public void setNb_produits_vendus(int nb_produits_vendus) {
		this.nb_produits_vendus = nb_produits_vendus;
	}

	public ArrayList<Employe> getListeEmploye() {
		return this.liste_employes;
	}

	
	
	

};
