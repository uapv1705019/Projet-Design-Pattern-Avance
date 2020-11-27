package model;

public abstract class Pharmacie 
{
	private String nom;
	private int nb_employes;
	private Employe list_employes[];
	private Produit List_produits[];
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
	
	
};
