package model;

public class CompteClassiqueFactory implements CompteFactory{

	@Override
	public Compte créerCompte(Utilisateur propriétaire, String IBAN, float crédit) {
		Compte c = new CompteClassique();
		// TODO Auto-generated method stub
		return c;
	}

}
