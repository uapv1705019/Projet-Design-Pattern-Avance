package model;

public class CompteClassique extends Compte {
	

	public CompteClassique() {
		super();
		this.type = "classique";
	}
	
	@Override
	public boolean autoriser(Transaction t) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
