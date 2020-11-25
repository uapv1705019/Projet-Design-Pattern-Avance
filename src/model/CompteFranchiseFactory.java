package model;

public class CompteFranchiseFactory implements CompteFactory {

	@Override
	public Compte créerCompte(Utilisateur propriétaire, String IBAN, float crédit) {
		Compte c = new CompteFranchise();
		return c;
	}

}
