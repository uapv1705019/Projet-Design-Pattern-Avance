package model;

public class CompteClassiqueFactory implements CompteFactory{

	@Override
	public Compte cr�erCompte(Utilisateur propri�taire, String IBAN, float cr�dit) {
		Compte c = new CompteClassique();
		// TODO Auto-generated method stub
		return c;
	}

}
