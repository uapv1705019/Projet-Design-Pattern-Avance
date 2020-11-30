package model;

public class PharmacieFranchisee extends Pharmacie
{
	
	private int nb_pharmacies_gerees;
	private PharmacieFranchisee list_pharmacies_gerees[];
	private double pourcentage_vente;
	private double reduction_prix_achat;
	
	public PharmacieFranchisee(String nom, double surface_commerciale, String type_pharmacie, String sIRET) {
		super(nom, surface_commerciale, type_pharmacie, sIRET);
		// TODO Auto-generated constructor stub
	}
	
	
}
