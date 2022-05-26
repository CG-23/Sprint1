package exercici1;

import java.util.ArrayList;

public class VendaBuidaException extends Exception {
	
	public VendaBuidaException() {
		super("Per fer una venda primer has d’afegir productes");
	}
}
