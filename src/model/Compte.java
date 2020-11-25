package model;

public interface Compte {
	private String IBAN;
	private float credit;
	
	public boolean autoriser(Transaction t);
}
