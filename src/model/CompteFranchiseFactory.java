package model;

public class CompteFranchiseFactory implements CompteFactory {

	@Override
	public Compte créerCompte(Personne propriétaire, String IBAN, float crédit) {
		Compte c = new CompteFranchise();
		return c;
	}

}
