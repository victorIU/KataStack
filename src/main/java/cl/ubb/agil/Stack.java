package cl.ubb.agil;

public class Stack {
	private int numeros[];
	private int tamanio=0;
	public Stack(){
		numeros=new int[2];
	}
	public boolean isEmpty(){
		if(tamanio==0){
			return true;
		}
		else{
			return false;
		}
	}
	public void push(int numero){
		numeros[tamanio]=numero;
		tamanio++;
	}
	public int getTamanio(){
		return tamanio;
	}
	public int pop(){
		tamanio--;
		return numeros[tamanio];
	}
}
