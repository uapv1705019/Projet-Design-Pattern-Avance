package model;

import java.util.Date;

public class Produit 
{
	private String id;
	private String nom;
	private String type;
	private double prix_achat;
	private double prix_vente;
	private Date date_peremption;
	private int stock;
	
	public Produit(String id, String nom, String type, double prix_achat, Date date_peremption) // j'ai retiré du constructeur le prix de vente, car chaque pharmacie fixe son propre prix pour le produit
	{
		super();
		this.id = id;
		this.nom = nom;
		this.type = type;
		this.prix_achat = prix_achat;
		this.date_peremption = date_peremption;
	}
	
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getNom() 
	{
		return nom;
	}
	public void setNom(String nom) 
	{
		this.nom = nom;
	}
	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	public double getPrix_achat() 
	{
		return prix_achat;
	}
	public void setPrix_achat(double prix_achat) 
	{
		this.prix_achat = prix_achat;
	}
	public double getPrix_vente() 
	{
		return prix_vente;
	}
	public void setPrix_vente(double prix_vente) 
	{
		this.prix_vente = prix_vente;
	}
	public Date getDate_peremption() 
	{
		return date_peremption;
	}
	public void setDate_peremption(Date date_peremption) 
	{
		this.date_peremption = date_peremption;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
