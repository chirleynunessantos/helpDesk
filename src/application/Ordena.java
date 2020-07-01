package application;

import java.util.Arrays;

public class Ordena {

	public static void main(String[] args) {
		
		
	//	-----------------------------------
		int[] st = {5,10,7,8,9};
		
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
				if(v[i] <= pivo) i++;
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

