package model;

import java.util.Date;

public abstract class Employe extends Personne
{
	private String type_employe;
	private double salaire;
	private Date dateEmbauche;
	
	public abstract void calculSalaire();

	public String getType_employe() {
		return type_employe;
	}

	public void setType_employe(String type_employe) {
		this.type_employe = type_employe;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	
	
}
