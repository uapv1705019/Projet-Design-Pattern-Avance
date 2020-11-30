package controller;


import java.awt.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Pharmacie;

public class MenuPrincipalController implements Initializable
{
	private static MenuPrincipalController CONTROLLER;
	
	/* 
	 * Fenetre contenant les onglets
	 */
	@FXML TabPane fenetrePrincipale;
	
	/* 
	 * Bouton permettant l'ajout de nouvelles pharmacies
	 */
	@FXML
	private Button AjouteurPharmacie;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	
	public void ajouterPharmacieLayout(Pharmacie p) {
		Tab tab = new Tab();
		
		AnchorPane ap = new AnchorPane();
		//ap.getChildren().addAll();
		tab.setContent(ap);
		//tab.setText(p.getNom());
		this.fenetrePrincipale.getTabs().add(tab);
	}
	
	
	public void ajouterPharmacie(ActionEvent event) throws IOException {
		Parent info = FXMLLoader.load(getClass().getResource("../view/AjoutPharmacieLayout.fxml"));
        Scene scene = new Scene(info);
        // Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage appStage = new Stage();
        appStage.setTitle("Ajout en cours");
        appStage.setScene(scene);
        appStage.show();
	}
	
	
	public void ajouterPersonnel(ActionEvent event) throws IOException {
		Parent info = FXMLLoader.load(getClass().getResource("../view/AjoutPersonnelLayout.fxml"));
        Scene scene = new Scene(info);
        // Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage appStage = new Stage();
        appStage.setTitle("Ajout en cours");
        appStage.setScene(scene);
        appStage.show();
	}
	
	public void ajouterTransaction(ActionEvent event) throws IOException {
		Parent info = FXMLLoader.load(getClass().getResource("../view/AjoutTransactionLayout.fxml"));
        Scene scene = new Scene(info);
        // Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage appStage = new Stage();
        appStage.setTitle("Ajout en cours");
        appStage.setScene(scene);
        appStage.show();
	}

}
