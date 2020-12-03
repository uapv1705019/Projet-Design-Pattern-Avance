package model;

public abstract class Compte {
	String type;
	String IBAN;
	float credit;
	
	public boolean autoriser(Transaction t) {
		if (t.getMontant() < this.credit) {
			return true;
		}
		return false;
	}

	public String getType() {
		return this.type;
	}
}
