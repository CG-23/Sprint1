package exercici1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JavaTest extends Java {

	@Test
	public void testPosicio() {
		int posicions = Java.afegirMesos().size();
		int esperado = 12;
		assertEquals(esperado, posicions);
	}
	@Test
	public void testNull() {	
		boolean resultado = true;
		if(Java.afegirMesos()!= null) {
		 resultado = true;
		}
		boolean esperado = true;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAgost() {
		String resultado = Java.afegirMesos().get(8-1).toLowerCase();
		String esperado = "agost";		
		assertEquals(esperado, resultado);
	}

}
