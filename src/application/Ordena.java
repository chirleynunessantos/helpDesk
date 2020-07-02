package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ordena {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\nome\\entrada.txt");

		 FileReader arq = new FileReader(f);
	     BufferedReader lerArq = new BufferedReader(arq); 
	     BufferedReader ler2= new BufferedReader(arq); 

	     String linha = lerArq.readLine(); // lê a primeira linha
	     String valor = linha;
	     
	     
	     while (linha != null) {
	         
	    
	  			
	  			
	  		}
	//	-----------------------------------
		int[] st = {1,2,3};
		
		
		quickSort(st,0,st.length-1);
		 
		System.out.println(Arrays.toString(st));
	}
		public static void ordenacaoTroca(int[] v) {
			for(int ultimo =  v.length -1; ultimo > 0; ultimo--) {
				for(int i = 0; i< ultimo; i++) {
					if(v[i] > v[i +1] ) {
						trocar(v,i, i+1);
					}
				}
			}
			
			
			
		}
		
		
		private static void trocar(int[] v, int i, int j) {
			int aux = v[i];
			v[i] = v[j];
			v[j]= aux;
		}
		
		public static void teste() {
			
		}
		
		
		public static void quickSort(int[] v, int esq, int dir) {
			if(esq < dir) {
				int j = separar(v,esq,dir);
				quickSort(v,esq,j-1);
				quickSort(v, j+1,dir);
			}
		}
		private static int separar(int[] v, int esq, int dir) {
			int i = esq + 1;
			int j = dir;
			int pivo = v [esq];
			while(i <= j) {
				if((v[i] <= pivo)  && j <= dir && i > j)i++;
				else if(v[j]> pivo)j--;
				else if (i<=j) {
					trocar(v,i,j);
					i++;
					j--;
				}
					
				}
			trocar(v,esq,j);
			
			return j;
		}

	}

