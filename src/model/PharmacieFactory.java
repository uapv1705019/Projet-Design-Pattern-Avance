package model;

public interface PharmacieFactory 
{
	public void creerPharmacie(String nom, int nb_employes, Employe liste_employes, Produit liste_produits, double surface_commerciale, String type_pharmacie, String SIRET);

}
