package model;

public interface CompteFactory {
	public Compte cr�erCompte(Utilisateur propri�taire, String IBAN, float cr�dit);
}
