package model;

public class PharmacienDiplome extends Employe
{
	private double salaire_fixe;
	private double prime;
	
	
	
	
	public PharmacienDiplome() {
		super();
		this.setType_employe("Pharmacien diplome");
	}

	@Override
	public void calculSalaire() // je ne suis pas s�r d'avori bien compris cette histoire de prime, 1% du nb total de ventes en prime c'est pas �norme. Ex : 500 produits ont �t� vendus, la prime s'�l�ve � 5�
	{
		//double salaire = this.salaire_fixe;

	}
	
	public void calculPrime()
	{
		//TODO
	}

	
	
	
	public double getSalaire_fixe() {
		return salaire_fixe;
	}

	public void setSalaire_fixe(double salaire_fixe) {
		this.salaire_fixe = salaire_fixe;
	}

	public double getPrime() {
		return prime;
	}

	public void setPrime(double prime) {
		this.prime = prime;
	}
	
	

}
