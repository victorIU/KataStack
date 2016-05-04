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
	
}
