package model;

public class EmployePharmacienDiplomeFactory implements EmployeFactory
{

	@Override
	public Employe creerEmploye(String nom, String prenom, String adresse, Compte compte, String type_employe,
			double salaire) {
		Employe e = new PharmacienDiplome();

		e.setNom(nom);
		e.setPrenom(prenom);
		e.setAdresse(adresse);

		return e;
		
	}

}
