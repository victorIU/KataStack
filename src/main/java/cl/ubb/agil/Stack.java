package cl.ubb.agil;

public class Stack {
	private int dato;
	private int tamanio;
	public Stack(){
		
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
		dato=numero;
		tamanio++;
	}
}
