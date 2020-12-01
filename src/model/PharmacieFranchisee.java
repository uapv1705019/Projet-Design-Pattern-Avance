package model;

import java.util.ArrayList;

public class PharmacieFranchisee extends Pharmacie
{
	
	private int nb_pharmacies_gerees;
	private ArrayList<PharmacieFranchisee> liste_pharmacies_gerees;
	private double pourcentage_vente;
	private double reduction_prix_achat;
	
	public PharmacieFranchisee(String nom, double surface_commerciale, String type_pharmacie, String sIRET) {
		super(nom, surface_commerciale, type_pharmacie, sIRET);
		// TODO Auto-generated constructor stub
	}

	public void ajouterPharmacie(PharmacieFranchisee pharmacie)
	{
		this.liste_pharmacies_gerees.add(pharmacie);
	}
	
	public void supprimerPharmacie(String siret)
	{
		for(int i = 0; i< this.liste_pharmacies_gerees.size(); i++)
		{
			PharmacieFranchisee tmp = this.liste_pharmacies_gerees.get(i);
			if(tmp.getSIRET() == siret)
			{
				this.liste_pharmacies_gerees.remove(i);
				break;
			}
		}
	}
	
	public void calculAvantages()
	{
		if (this.nb_pharmacies_gerees < 2)
		{
			this.pourcentage_vente = 0;
			this.reduction_prix_achat = 0;
		}
		else if((this.nb_pharmacies_gerees >= 2) && (this.nb_pharmacies_gerees <= 4))
		{
			this.pourcentage_vente = 1;
			this.reduction_prix_achat = 2.5;
		}
		else if((this.nb_pharmacies_gerees >= 5) && (this.nb_pharmacies_gerees <= 10))
		{
			this.pourcentage_vente = 2;
			this.reduction_prix_achat = 5;
		}
		else if(this.nb_pharmacies_gerees > 10)
		{
			this.pourcentage_vente = 3;
			this.reduction_prix_achat = 7.5;
		}
	}
	
	
	
	
	public int getNb_pharmacies_gerees() {
		return nb_pharmacies_gerees;
	}

	public void setNb_pharmacies_gerees(int nb_pharmacies_gerees) {
		this.nb_pharmacies_gerees = nb_pharmacies_gerees;
	}

	public double getPourcentage_vente() {
		return pourcentage_vente;
	}

	/*public void setPourcentage_vente(double pourcentage_vente) {
		this.pourcentage_vente = pourcentage_vente;
	}*/

	public double getReduction_prix_achat() {
		return reduction_prix_achat;
	}

	/*public void setReduction_prix_achat(double reduction_prix_achat) {
		this.reduction_prix_achat = reduction_prix_achat;
	}*/
	
	
	
	
}
