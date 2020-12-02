package model;

public class PreparateurCommande extends Employe
{
	
	private double nb_heures_mensuelles;
	private double cout_heure;
	private int anciennete;
	private int anciennete_bonus;

	
	
	public PreparateurCommande() {
		super();
		this.setType_employe("Preparateur de commande");
	}

	@Override
	public void calculSalaire() 
	{
		ancienneteBonus();
		double salaire = (this.nb_heures_mensuelles*this.cout_heure);
		if(this.anciennete_bonus != 0) //pour éviter une multiplication/division par zéro
		{
			salaire += (salaire*this.anciennete_bonus)/100;
		}
		this.setSalaire(salaire);
	}

	public void ancienneteBonus()
	{
		if(this.anciennete < 3)
		{
			this.anciennete_bonus = 0;
		}
		else if((this.anciennete >=3) && (this.anciennete <=6))
		{
			this.anciennete_bonus = 10;
		}
		else if(this.anciennete > 6)
		{
			this.anciennete_bonus = 15;
		}
		
	}
	
	
	public double getNb_heures_mensuelles() {
		return nb_heures_mensuelles;
	}

	public void setNb_heures_mensuelles(double nb_heures_mensuelles) {
		this.nb_heures_mensuelles = nb_heures_mensuelles;
	}

	public double getCout_heure() {
		return cout_heure;
	}

	public void setCout_heure(double cout_heure) {
		this.cout_heure = cout_heure;
	}

	public int getAnciennete() {
		return anciennete;
	}

	public void setAnciennete(int anciennete) {
		this.anciennete = anciennete;
	}

	public int getAnciennete_bonus() {
		return anciennete_bonus;
	}

	public void setAnciennete_bonus(int anciennete_bonus) {
		this.anciennete_bonus = anciennete_bonus;
	}
	
	

}
