package model;

public interface CompteFactory {
	public Compte cr�erCompte(Personne propri�taire, String IBAN, float cr�dit);
}
