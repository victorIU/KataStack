package cl.ubb.agil;

public class Stack {
	private int numeros[];
	private int tamanio=0;
	private int maximo;
	public Stack(int maximo){
		numeros=new int[maximo];
		this.maximo=maximo;
	}
	public boolean isEmpty(){
		if(tamanio==0){
			return true;
		}
		else{
			return false;
		}
	}
	public void push(int numero)/*throws ExcepcionStackLleno*/{
		//if(tamanio==maximo){
			//throw new ExcepcionStackLleno();
		//}else{
			numeros[tamanio]=numero;
			tamanio++;
		//}
		
	}
	public int getTamanio(){
		return tamanio;
	}
	public int pop()throws ExcepcionPilaVacia{
		if(tamanio>0){
			tamanio--;
			return numeros[tamanio];
		}else{
			throw new ExcepcionPilaVacia();
		}
		
	}
}
