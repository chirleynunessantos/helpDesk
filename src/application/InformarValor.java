package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class InformarValor extends Application{
	
	
	@Override
	public void start(Stage stage) throws IOException {
		
		System.out.println("na classe do Informar");

		Pane root = FXMLLoader.load(getClass().getResource("InformarValor.fxml"));
		System.out.println("passei");
		Scene scene = new Scene(root,500,500);
			
		stage.setScene(scene);
		stage.show();

}


}
