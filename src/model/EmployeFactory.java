package model;

public interface EmployeFactory 
{
	public Employe creerEmploye(String nom, String prenom, String adresse, Compte compte, String type_employe, double salaire);
}
