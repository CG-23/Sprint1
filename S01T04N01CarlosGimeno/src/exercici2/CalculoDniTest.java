package exercici2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CalculoDniTest extends CalculoDni{
	
	@Test
	void TestLletres() {
		ArrayList<String>lista= CalculoDni.AfegirLlistaDni();
			for(int i=0;i<lista.size()-1;i++) {
				char esperado = lista.get(i).charAt(8);
				String resultado = lista.get(i).substring(0,lista.get(i).length()-1);
				int result = Integer.parseInt(resultado);
				char res = CalculoDni.CalculoLletraDni(result);
				assertEquals(esperado, res);
			}
	}

}


