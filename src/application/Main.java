package application;
	
import java.io.IOException;
import java.util.ArrayList;

import controller.MenuPrincipalController;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application 
{
	public static ArrayList<Pharmacie> listeDesPharmacies = new ArrayList<Pharmacie>();
	
	public static Stage primaryStage;
	private AnchorPane panneauPrincipal;
	


	@Override
	public void start(Stage primaryStage) throws Exception {
		// Initialisation des valeurs de test:
		
		Employe e, e1, e2, e3, e4;
		
		EmployeFactory ef = new EmployePharmacienDiplomeFactory();
		e = ef.creerEmploye("Scott", "Micheal", "11 rue Scranton", null, "boss", 4000.0);
		e1 = ef.creerEmploye("Schrute K.", "Dwight", "12 rue de Scranton", null, "assistant", 3200.0);
		
		ef = new EmployePreparateurCommandeFactory();
		e2 = ef.creerEmploye("Stanley", "Hudson", "14 rue de Scranton", null, "assistant", 3200.0);
		e3 = ef.creerEmploye("Alex", "Meyson", "1 rue Union", null, "assistant", 3200.0);
		e4 = ef.creerEmploye("Frank", "Woods", "4 avenue Vorkuta", null, "assistant", 3200.0);
		
		
		Pharmacie p;
		PharmacieFactory pf = new PharmacieIndependanteFactory();
		p = pf.creerPharmacie("Saint-Ruf", 10, e, null, 60, "Franchisée", "152304456337010");
		
		
		p.ajouterEmploye(e1);
		p.ajouterEmploye(e2);
		p.ajouterEmploye(e3);
		p.ajouterEmploye(e4);
		
		listeDesPharmacies.add(p);
		
		Main.primaryStage = primaryStage;
        primaryStage.setTitle("Gestionnaire");
		initRootLayout();
	}
	
	/**
     * Initializes the root layout.
     */
    public void initRootLayout() 
    {
    	FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("../view/MenuPrincipalLayout.fxml"));
        try 
        {
        	panneauPrincipal = (AnchorPane) loader.load();
        	// Show the scene containing the root layout.
            Scene scene = new Scene(panneauPrincipal);
            primaryStage.setScene(scene);
            primaryStage.show();
        	
		} 
        catch (IOException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }
    
    
    
	public static void main(String[] args) 
	{
		launch(args);
	}

    
    public static Stage getPrimaryStage() {
		return primaryStage;
	}



}
