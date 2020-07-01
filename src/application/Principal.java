package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Principal extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
	
		System.out.println("No start");
		
		Pane root = FXMLLoader.load(getClass().getResource("Tela.fxml"));
	System.out.println("passei da tela do inicio");
		Scene scene = new Scene(root,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
