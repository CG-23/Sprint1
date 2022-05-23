package exercici1;

import java.util.ArrayList;

public class VendaBuidaException extends Exception {
	String mensaje = "rwhfkjwhfqowefjlawdjf";
	public VendaBuidaException(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getMensaje() {
		return mensaje;
	}
}
