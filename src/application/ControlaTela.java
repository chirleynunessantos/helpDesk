package application;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


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
    private TextField nomeB;
	
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

	
		String nomea = "";
		nomea = (nome.getText() +" -  Telefone :  "+ telefone.getText() +" -  E-mail : "+ email.getText() +" - Ocorrencia"+ ocorrencia.getText());
		Fila fila = new Fila();
		fila.inserir(nomea);
			

	}
	
	
	
	
	
	@FXML
	private void read(ActionEvent event) throws IOException {
		
		//Mostrar dados do arquivo
	
		Ordena ordenar = new Ordena();
		File f = new File("C:\\nome\\entrada.txt");

		FileReader arq = new FileReader(f);
	     BufferedReader lerArq = new BufferedReader(arq); 

	     String linha = lerArq.readLine(); // lê a primeira linha
	     System.out.println(linha);
	     String[] vt = null;
	
	     while (linha != null) {
	      
	    	 
				
	    	 linha = lerArq.readLine(); // lê da segunda até a última linha
	    	
			   System.out.println(linha);

			}
	    

	   lerArq.close();
		
	

	}
	
	@FXML
	private void doExcluir(ActionEvent event) throws IOException {
		
	Fila fila =  new Fila();
	fila.ler();

	}
	
	@FXML
	private void chamaFiltro(ActionEvent event) throws IOException {
		
		InformarValor c =  new InformarValor();
		c.start(new Stage());

	}
	
	
	@FXML
	private void chamaArray(ActionEvent event) throws IOException {
		
		String[] nomees = bubleSort();
		
		for(int i = 0; i < nomees.length; i++) {
			System.out.println(nomees[i]);
			
		}
		
		int tam = nomees.length;
	
		for (int i = 0; i < tam -1; i++) {
			for (int j = 0; j < tam -1 -i; j++) {

			
			
				
				char car =  nomees[j].charAt(0);
				char car2 = nomees[j + 1].charAt(0);
				
				if(car >  car2 ){
				String aux = nomees[j];
				nomees[j] = nomees[j+1];
				nomees[j+1] = new String().valueOf(aux);
	}}}
		
		System.out.println("---------Ordenado pelo bubble------");
		for(int i = 0; i < nomees.length; i++) {
			System.out.println(nomees[i]);
			
		}
		
		
	 	File f = new File("C:\\nome\\bublesort.txt");
		
		BufferedWriter w = new BufferedWriter(new FileWriter(f,true));
		for(int i = 0; i < nomees.length; i++) {
	
		w.write(nomees[i]);
			
		w.newLine();
		}
	//	}
		w.close();
	

	}
	


	private String[] bubleSort() throws IOException{
		
		String[] array = new String[5];		
		File f = new File("C:\\nome\\entrada.txt");
		FileReader arq = new FileReader(f);
	
	    BufferedReader lerArq = new BufferedReader(arq); 
	    String[] valor= null;
	    String linha ;
	    int pos = 0;
	    
	    while((linha = lerArq.readLine()) != null){
	    		array[pos] = linha;
	    		pos++;
	    }

	
		return array;
	
	}
	
	
	
	
	//-------------------- quicksort
@FXML
private void arrayparaQuik() throws IOException{
	
	File f = new File("C:\\nome\\entrada.txt");
    BufferedReader lerArq = new BufferedReader(new FileReader(f)); 
    
    String[] vetor = bubleSort();
	
    quickSort(vetor, 0, vetor.length -1);
	

	
	File f2 = new File("C:\\nome\\quicksort.txt");
	
	BufferedWriter w = new BufferedWriter(new FileWriter(f2,true));
	for(int i = 0; i < vetor.length; i++) {

	w.write(vetor[i]);
		
	w.newLine();
	}

	w.close();
	
	System.out.println("---------Ordenado pelo qui------");
	for(int i = 0; i < vetor.length; i++) {
		System.out.println(vetor[i]);
		
	}
	
	}
	
	
public static void quickSort(String[] v, int esq, int dir) {
	if(esq < dir) {
		int j = separar(v,esq,dir);
		quickSort(v,esq,j-1);
		quickSort(v, j+1,dir);
	}
}
private static int separar(String[] v, int esq, int dir) {
	int i = esq +1 ;
	int j = dir;
	String pivo = v [esq];
	while(i <= j  ) {
		if((v[i].compareTo(pivo) <= 0))i++;
		else if(v[j ].compareTo( pivo) >0)j--;
		else if (i<=j) {
			trocar(v,i-1,j);
			i++;
			j--;
		}
			
		}
	trocar(v,esq,j);
	
	return j;
}
	
	
	private static void trocar(String[] v, int i, int j) {
		String aux = v[i ];
		v[i ] = v[j ];
		v[j ]=  new String().valueOf(aux);
		
	}
	}
	


