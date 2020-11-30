package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import model.EmployeFactory;
import model.EmployePharmacienDiplomeFactory;
import model.EmployePreparateurCommandeFactory;
import model.PharmacieFactory;
import model.PharmacieFranchiseeFactory;
import model.PharmacieIndependanteFactory;

public class AjoutPersonnelController  implements Initializable
{
	private static AjoutPersonnelController CONTROLLER;
	
	/* 
	 * Bouton permettant la validation de l'ajout d'une nouvelle pharmacie
	 */
	@FXML
	private Button validateurCreationPersonnel;
	
	/* 
	 * Bouton permettant l'annulation de l'ajout d'une nouvelle pharmacie
	 */
	@FXML
	private Button annulateurCreationPersonnel;
	
	/* 
	 * Radio permettant de sélectionner comme type "franchisée"
	 */
	@FXML
	private RadioButton radioPharmacienDiplome;
	
	/* 
	 * Radio permettant de sélectionner comme type "indépendante"
	 */
	@FXML
	private RadioButton radioCommandeSelectionne;
	
	/* 
	 * Champ contenant le nom de la pharmacie
	 */
	@FXML
	private TextField nomEmploye;
	
	/* 
	 * Champ contenant le siret de la pharmacie
	 */
	@FXML
	private TextField prenomEmploye;
	
	/* 
	 * Champ contenant la surface commerciale de la pharmacie
	 */
	@FXML
	private TextField adresseEmploye;
	
	/* 
	 * Champ contenant la surface commerciale de la pharmacie
	 */
	@FXML
	private TextField typeEmploye;
	
	/* 
	 * Champ contenant la surface commerciale de la pharmacie
	 */
	@FXML
	private TextField salaire;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ToggleGroup radioSymbolGroup = new ToggleGroup();
		this.radioPharmacienDiplome.setToggleGroup(radioSymbolGroup);
		this.radioCommandeSelectionne.setToggleGroup(radioSymbolGroup);
	}

	public void annulerCreationPersonnel(ActionEvent event) {
		Stage stage = (Stage) annulateurCreationPersonnel.getScene().getWindow();
	    stage.close();
	}
	
	public void validerCreationPersonnel(ActionEvent event) {
		EmployeFactory ef;
		if (radioPharmacienDiplome.isSelected() == true) {
			ef = new EmployePharmacienDiplomeFactory();
		}
		else if (radioCommandeSelectionne.isSelected() == true) {
			ef = new EmployePreparateurCommandeFactory();
		}
		// Récupérer les valeurs pour créer une pharmacie 
		
		//pf.creerPharmacie(NomPharmacie.getText(), SurfacePharmacie.getText(), SiretPharmacie.getText());
		//Tab tab = new Tab();
		
		//tabPane.getTabs().add(tab);
		
		
	}

}
