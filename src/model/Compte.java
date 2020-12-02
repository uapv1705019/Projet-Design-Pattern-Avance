package model;

public abstract class Compte {
	String IBAN;
	float credit;
	
	public boolean autoriser(Transaction t) {
		if (t.getMontant() < this.credit) {
			return true;
		}
		return false;
	}
}
