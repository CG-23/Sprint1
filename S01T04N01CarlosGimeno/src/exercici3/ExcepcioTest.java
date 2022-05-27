package exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExcepcioTest {

	@Test
	void testExcepcio() {
		try {
			Excepcio.Excepcion();
			fail("Not yet implemented");
		}catch(ArrayIndexOutOfBoundsException e) {}
		
	}

}
