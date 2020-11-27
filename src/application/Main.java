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
	private AnchorPane configLayout;
	BorderPane jeuLayout;
	AnchorPane joueurLayout;
	AnchorPane partieLayout;
	

	
	/**
     * Initializes the root layout.
     */
    public void initRootLayout() 
    {
    	FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MenuPrincipalLayout.fxml"));
        try 
        {
			configLayout = (AnchorPane) loader.load();
		} 
        catch (IOException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // Show the scene containing the root layout.
        Scene scene = new Scene(configLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    
	public static void main(String[] args) 
	{
		launch(args);
	}

    
    public static Stage getPrimaryStage() {
		return primaryStage;
	}



	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
