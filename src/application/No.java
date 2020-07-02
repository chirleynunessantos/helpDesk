package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class No {

	private No prox;
	private Object item;
	
	
	public No(Object item) {
		this.item = item;
		prox =null;
	}


	public No getProx() {
		return prox;
	}


	public void setProx(No prox) {
		this.prox = prox;
	}


	public Object getItem() {
		return item;
	}


	public void setItem(Object item) {
		this.item = item;
	}
	
	
	
	
}
