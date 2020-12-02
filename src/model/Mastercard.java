package model;

public class Mastercard implements Reseau{
	
	private static Mastercard instance = null;
	
	private Mastercard() {
		super();
	}
	
	public final static Mastercard getInstance() {
		if (Mastercard.instance == null) {
			Mastercard.instance = new Mastercard();
		}
		return Mastercard.instance;
	}

	@Override
	public float calculMontantTransaction(Transaction t) {
		float montantFinal = (float) ((t.getMontant() * 0.5 / 100) + t.getMontant());
		t.setMontant(montantFinal);
		return montantFinal;
	}

}
