package model;

import java.util.Date;

public class EmployePharmacienDiplomeFactory implements EmployeFactory
{

	@Override
	public Employe creerEmploye(String nom, String prenom, String adresse, Compte compte, String type_employe,
			double salaire) 
	{
		Employe e = new PharmacienDiplome();

		e.setNom(nom);
		e.setPrenom(prenom);
		e.setAdresse(adresse);

		return e;
		
	}

	@Override
	public Employe creerEmploye(String nom, String prenom, String adresse, Compte compte, String type_employe,
			double salaire, Date dateEmbauche) 
	{
		Employe e = new PharmacienDiplome();

		e.setNom(nom);
		e.setPrenom(prenom);
		e.setAdresse(adresse);
		e.setDateEmbauche(dateEmbauche);

		return e;
	}

}
