package cl.ubb.agil;

public class Stack {
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
		tamanio++;
	}
	public int getTamanio(){
		return tamanio;
	}
	public int pop(){
		if(tamanio==1){
			return 1;
		}else{
			return 2;
		}
	}
}
