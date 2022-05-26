package exercici1;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercici1Main {

	public static void main(String[] args) {	
		Venda ven1 = new Venda();
		try {
			ven1.CalcularTotal();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		ven1.IntroducirProducto();
		try {
			ven1.CalcularTotal();
			System.out.println(ven1.getPreuTotal());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
