package model;

public class CompteFranchiseFactory implements CompteFactory {

	@Override
	public Compte cr�erCompte(Utilisateur propri�taire, String IBAN, float cr�dit) {
		Compte c = new CompteFranchise();
		return c;
	}

}
