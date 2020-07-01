package application;

import java.io.IOException;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class Cadastro extends Application {
	
	


	@Override
	public void start(Stage stage) throws IOException {
		
		

		Pane root = FXMLLoader.load(getClass().getResource("Cadastro.fxml"));

		Scene scene = new Scene(root,500,500);
			
		stage.setScene(scene);
		stage.show();

}

	

	
}
