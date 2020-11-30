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

public class AjoutTransactionController  implements Initializable
{
	private static AjoutTransactionController CONTROLLER;
	
	/* 
	 * Bouton permettant la validation de l'ajout d'une nouvelle pharmacie
	 */
	@FXML
	private Button validateurCreationTransaction;
	
	/* 
	 * Bouton permettant l'annulation de l'ajout d'une nouvelle pharmacie
	 */
	@FXML
	private Button annulateurCreationTransaction;
	
	/* 
	 * Champ contenant la surface commerciale de la pharmacie
	 */
	@FXML
	private TextField salaire;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

	public void annulerCreationTransaction(ActionEvent event) {
		Stage stage = (Stage) annulateurCreationTransaction.getScene().getWindow();
	    stage.close();
	}
	
	public void validerCreationTransaction(ActionEvent event) {
		EmployeFactory ef;
		
		// Récupérer les valeurs pour créer une pharmacie 
		
		//pf.creerPharmacie(NomPharmacie.getText(), SurfacePharmacie.getText(), SiretPharmacie.getText());
		//Tab tab = new Tab();
		
		//tabPane.getTabs().add(tab);
		
		
	}

}
