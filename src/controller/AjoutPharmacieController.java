package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Pharmacie;
import model.PharmacieFactory;
import model.PharmacieFranchisee;
import model.PharmacieFranchiseeFactory;
import model.PharmacieIndependanteFactory;

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
	
	/* 
	 * Champ contenant le nom de la pharmacie
	 */
	@FXML
	private TextField NomPharmacie;
	
	/* 
	 * Champ contenant le siret de la pharmacie
	 */
	@FXML
	private TextField SiretPharmacie;
	
	/* 
	 * Champ contenant la surface commerciale de la pharmacie
	 */
	@FXML
	private TextField SurfacePharmacie;
	
	private AnchorPane panneauPrincipal;


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
	
	public void validerCreationPharmacie(ActionEvent event) throws IOException {
		PharmacieFactory pf = null;
		if (radioFranchisee.isSelected() == true) {
			pf = new PharmacieFranchiseeFactory();
		}
		else if (radioIndependante.isSelected() == true) {
			pf = new PharmacieIndependanteFactory();
		}
		// Récupérer les valeurs pour créer une pharmacie 
		
		Pharmacie p;
		
		p = pf.creerPharmacie(NomPharmacie.getText(), SurfacePharmacie.getText(), SiretPharmacie.getText());
		Main.listeDesPharmacies.add(p);
		// eterereterer

		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("../view/MenuPrincipalLayout.fxml"));
		MenuPrincipalController controller = loader.getController();
		
	
    	panneauPrincipal = (AnchorPane) loader.load();
    	// Show the scene containing the root layout.
        Scene scene = new Scene(panneauPrincipal);
        Main.primaryStage.setScene(scene);
        Main.primaryStage.show();



		Stage stage = (Stage) annulateurCreationPharmacie.getScene().getWindow();
	    stage.close();
		
		
	}

}
