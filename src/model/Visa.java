package model;

public class Visa implements Reseau{

	private static Visa instance = null;
	
	private Visa() {
		super();
	}
	
	public final static Visa getInstance() {
		if (Visa.instance == null) {
			Visa.instance = new Visa();
		}
		return Visa.instance;
	}
	
	@Override
	public float calculMontantTransaction(Transaction t) {
		float montantFinal = 0;
		switch(t.getPays()) {
			case "Espagne":
				montantFinal = (float) ((t.getMontant() * 0.1 / 100) + t.getMontant());
				break;
			case "Etats-Unis":
				montantFinal = (float) ((t.getMontant() * 0.2 / 100) + t.getMontant());
				break;
			case "Portugal":
				montantFinal = (float) ((t.getMontant() * 0.15 / 100) + t.getMontant());
				break;
			case "Royaume-Uni":
				montantFinal = (float) ((t.getMontant() * 0.25 / 100) + t.getMontant());
				break;
			default:
				montantFinal = (float) ((t.getMontant() * 0.30 / 100) + t.getMontant());
				break;
		}
		t.setMontant(montantFinal);
		return montantFinal;
	}

}
