package application;



import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

//public class ControlaTela implements Initializable {

	
public class ControlaTela {

    @FXML
    private TextField nome;

    @FXML
    private TextField telefone;

    @FXML
    private TextField email;

    @FXML
    private TextArea ocorrencia;
	
	@FXML
	private void acaoDoBotao(ActionEvent event) {
		Cadastro c = new Cadastro();
	

		try {
			c.start(new Stage());
			System.out.println("start cad");
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}
	@FXML
	private void botaoSalvar(ActionEvent event) {
	
	
		
	ArrayList<DadosCadastrais> dc = new ArrayList<DadosCadastrais>();
/*
		for(DadosCadastrais da : dc ) {	
			
			da.setNome(nome.getText());
			da.setTelefone(telefone.getText());
			da.setEmail(email.getText());
			da.setOcorrencia(ocorrencia.getText());
		
			
		}
		System.out.println(nome.getText());
		*/
	
		String nomea = "";
		nomea = ("Nome : " +nome.getText() +" -  Telefone :  "+ telefone.getText() +" -  E-mail : "+ email.getText() +" - Ocorrencia"+ ocorrencia.getText());
		Fila fila = new Fila();
	//System.out.println(nomea);
		fila.inserir(nomea);
			

	}
	
	@FXML
	private void acaoDoBuscar(ActionEvent event) {
		
	
		Buscar b = new Buscar();
		
		try {
		
			b.start(new Stage());
				
		} catch (IOException e) {
			
			System.out.println();
		}
		

	}
	
	@FXML
	private void doExcluir(ActionEvent event) throws IOException {
		
	Fila fila =  new Fila();
	fila.ler();

	}
	
	
	
	
	

	

}
