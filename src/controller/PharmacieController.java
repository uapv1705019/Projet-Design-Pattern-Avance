package controller;


import java.awt.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Employe;
import model.Pharmacie;

public class PharmacieController implements Initializable
{
	private static PharmacieController CONTROLLER;
	
	Pharmacie pharmacie;
	
	@FXML
	private ScrollPane employeListe;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		VBox conteneurEmploye = new VBox();
		Text info = new Text();
		System.out.println(pharmacie.getListeEmploye().toString());
		for( Employe e : pharmacie.getListeEmploye() ) {
			System.out.println(e.getNom());
			info.setText(e.getNom() + " ; " + e.getPrenom() + " ; " + e.getAdresse());
			conteneurEmploye.getChildren().addAll(info);
		}
		


		
		
	}
	
	public void setPharmacie(Pharmacie p) {
		this.pharmacie = p;
		return;
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
