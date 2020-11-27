package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class AjoutPharmacieController  implements Initializable
{
	private static AjoutPharmacieController CONTROLLER;
	
	/* 
	 * Bouton permettant la validation de l'ajout d'une nouvelle pharmacie
	 */
	@FXML
	private Button validateurCreationPharmacie;
	
	/* 
	 * Bouton permettant l'annulation de l'ajout d'une nouvelle pharmacie
	 */
	@FXML
	private Button annulateurCreationPharmacie;
	
	/* 
	 * Radio permettant de sélectionner comme type "franchisée"
	 */
	@FXML
	private RadioButton radioFranchisee;
	
	/* 
	 * Radio permettant de sélectionner comme type "indépendante"
	 */
	@FXML
	private RadioButton radioIndependante;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ToggleGroup radioSymbolGroup = new ToggleGroup();
		this.radioFranchisee.setToggleGroup(radioSymbolGroup);
		this.radioIndependante.setToggleGroup(radioSymbolGroup);
	}

	public void annulerCreationPharmacie(ActionEvent event) {
		Stage stage = (Stage) annulateurCreationPharmacie.getScene().getWindow();
	    stage.close();
	}
	
	public void validerCreationPharmacie(ActionEvent event) {
		if (radioFranchisee.isSelected() == true) {
			//PharmacieFactory pf = new PharmacieFranchiseFactory();
		}
		else if (radioIndependante.isSelected() == true) {
			//PharmacieFactory pf = new PharmacieIndependanteFactory();
		}
		
		
		
	}

}
