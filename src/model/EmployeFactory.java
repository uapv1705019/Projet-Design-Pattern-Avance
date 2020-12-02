package model;

import java.util.Date;

public interface EmployeFactory 
{
	public Employe creerEmploye(String nom, String prenom, String adresse, Compte compte, String type_employe, double salaire);
	public Employe creerEmploye(String nom, String prenom, String adresse, Compte compte, String type_employe, double salaire, Date dateEmbauche);
}
