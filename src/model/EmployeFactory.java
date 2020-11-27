package model;

public interface EmployeFactory 
{
	public void creerEmploye(String nom, String prenom, String adresse, Compte compte, String type_employe, double salaire);
}
