package model;

public interface CompteFactory {
	public Compte créerCompte(Utilisateur propriétaire, String IBAN, float crédit);
}
