
package application;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



	
public class Fila{
		
private String[] valores;
private int primeiro;
private int ultimo;
private int total;
private ArrayList salvar;



public Fila(){
			valores  = new String[10];
			primeiro =  0;
			ultimo = 0;
			total = 0;
		}

public void inserir(String dc){
			if(isFull()){
				
				

			throw new RuntimeException("Cheia")	;
			}
			
			try {
				//System.out.println(dc);
				File f = new File("C:\\nome\\entrada.txt");
				
				BufferedWriter w = new BufferedWriter(new FileWriter(f,true));
				valores[ultimo] = dc;
			
				w.write(valores[ultimo]);
					
				w.newLine();
				
			//	}
				w.close();
			
			ultimo = (ultimo + 1) % valores.length;
			total++;
			
			
				
	} catch (IOException e) {
				e.printStackTrace();
			}

	}



			
public void ler() throws IOException{
	try {
	File f = new File("C:\\nome\\entrada.txt");
	
	
	 FileReader arq = new FileReader(f);
     BufferedReader lerArq = new BufferedReader(arq); 
     BufferedReader ler2= new BufferedReader(arq); 

     String linha = lerArq.readLine(); // lê a primeira linha
     String valor = linha;
     ArrayList salvar = new ArrayList();
     while (linha != null) {
      
       if(linha.equals( valor) == false) {
			salvar.add(linha);
			
			
		}
       linha = lerArq.readLine(); // lê da segunda até a última linha
     }
	   System.out.println(salvar);

	
	
	System.out.println();
	
	
     arq.close();
     lerArq.close();
	FileWriter fw2 = new FileWriter(f);
	BufferedWriter w2 = new BufferedWriter(fw2);

	w2.close();
		
		
	
	
		
		//FileWriter fw = new FileWriter(f);
	BufferedWriter w = new BufferedWriter(new FileWriter(f));
	//w.write(salvar);
		for(int i = 0; i < salvar.size(); i++) {
		String nomee = 	(String) salvar.get(i);
		w.write(nomee);
		
			w.newLine();
		
		}
		
		//fw.close();
		w.close();
		/*
			valores[primeiro] = valor;
		
			String elemento  = valores[primeiro];
			primeiro = (primeiro + 1)% valores.length;
			total--;
			
		
			*/
			
	
			System.out.println("passei");
			
	 } catch (IOException e) {
	       System.err.printf("Erro na abertura do arquivo: %s.\n",
	         e.getMessage());
	   }

		//return elemento;
	}
			  
public boolean isEmpty(){
			return total ==0;
	}


public boolean isFull(){
			return total ==  valores.length;
		}	}
	

