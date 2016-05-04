package cl.ubb.agil;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

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
}
