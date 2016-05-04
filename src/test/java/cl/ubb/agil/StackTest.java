package cl.ubb.agil;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StackTest {
	@Test
	public void StackParteVacia(){
		Stack stack=new Stack();
		
		boolean b=stack.isEmpty();
		
		assertTrue(b);
	}
	@Test
	public void agregarNumeroUnoYStackNoVacio(){
		Stack stack=new Stack();
		
		stack.push(1);
		boolean b=stack.isEmpty();
		
		assertTrue(!b);
	}
	@Test
	public void agregarNumeroUnoYDosYStackNoVacio(){
		Stack stack=new Stack();
		
		stack.push(1);
		stack.push(2);
		boolean b=stack.isEmpty();
		
		assertTrue(!b);
	}
	@Test
	public void agregarNumeroUnoYDosYtamanioEsDos(){
		Stack stack=new Stack();
		
		stack.push(1);
		stack.push(2);
		int tamanio=stack.getTamanio();
		
		assertThat(tamanio, is(2));
		
	}
	@Test
	public void agregarNumeroUnoYHacerPopStackDevuelveUno(){
		Stack stack=new Stack();
		
		stack.push(1);
		int dato=stack.pop();
		
		assertThat(dato,is(1));
	}
	@Test
	public void agregarNumeroUnoYDosYHacerPopStackDevuelveDos(){
Stack stack=new Stack();
		
		stack.push(1);
		stack.push(2);
		int dato=stack.pop();
		
		assertThat(dato, is(2));
	}
}
