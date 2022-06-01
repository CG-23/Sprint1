package exercici3;

import static org.junit.Assert.assertThrows;
import org.junit.jupiter.api.Test;

class TestException extends ExcepcioTesting{

	@Test
	void test() {
		assertThrows(ArrayIndexOutOfBoundsException.class,() ->PosicionArreglo(8));

	}

}
