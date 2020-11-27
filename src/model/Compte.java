package model;

public abstract class Compte {
	String IBAN;
	float credit;
	
	public boolean autoriser(Transaction t) {
		return true;
	}
}
