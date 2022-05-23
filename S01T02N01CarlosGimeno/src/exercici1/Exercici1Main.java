package exercici1;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercici1Main {

	public static void main(String[] args) {	
		//XK HAY QUE CREAR ARRAYLIST EN EL MAIN ?????
		ArrayList<Producte>LlistaProductes = new ArrayList<Producte>();
	//	Venda.IntroducirProducto(LlistaProductes);
		System.out.println(LlistaProductes);
		System.out.println(Venda.CalcularTotal(LlistaProductes));
	}
}
