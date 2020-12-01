package model;

public class PharmacieFranchiseeFactory implements PharmacieFactory
{

	@Override
	public Pharmacie creerPharmacie(String nom, int nb_employes, Employe liste_employes, Produit liste_produits,
			double surface_commerciale, String type_pharmacie, String SIRET) {
		Pharmacie p = new PharmacieFranchisee(nom, surface_commerciale, type_pharmacie, SIRET);
		return p;
		
	}

	@Override
	public Pharmacie creerPharmacie(String nom, String surfaceCommerciale, String SIRET) {
		double surfaceCommercialeDouble = Double.parseDouble(surfaceCommerciale);
		Pharmacie p = new PharmacieIndependante(nom, surfaceCommercialeDouble, "pharmacie franchis�e", SIRET);
		return p;
	}

}
