package model;

public abstract class Employe implements Personne
{
	private String type_employe;
	private double salaire;
	
	public abstract double calculSalaire();
}
