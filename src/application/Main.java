package application;
	
import java.io.IOException;

import controller.MenuPrincipalController;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application 
{
	
	private static Stage primaryStage;
	private AnchorPane panneauPrincipal;
	


	@Override
	public void start(Stage primaryStage) throws Exception {
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
