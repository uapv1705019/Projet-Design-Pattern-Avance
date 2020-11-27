package model;

public interface CompteFactory {
	public Compte créerCompte(Personne propriétaire, String IBAN, float crédit);
}
