package exercici1;

import java.util.ArrayList;
import java.util.Scanner;
public class Venda {

	private static int PreuTotal;
	private static ArrayList <Producte> LlistaProductes;
	
	public Venda(String nom, int preu, int PreuTotal, ArrayList<Producte>LlistaProductes) {		
		this.PreuTotal       = PreuTotal;
		this.LlistaProductes = LlistaProductes;
	}
	
	public static void IntroducirProducto(ArrayList <Producte> LlistaProductes) {
		String continuar, confirmacio = "si";
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre del producto: ");
		String nom = sc.nextLine();
		System.out.println("Preu del producto: ");
		int preu = sc.nextInt();
		sc.nextLine();
		System.out.println("Vols afegir un altre producte ? ");
		continuar = sc.nextLine();
		LlistaProductes.add(new Producte(nom,preu));
		}while(confirmacio.equalsIgnoreCase(continuar));		
	}
	
	public static int CalcularTotal(ArrayList <Producte> LlistaProductes){
		
			for(int i=0; i<LlistaProductes.size(); i++) {
				
				PreuTotal = PreuTotal + (LlistaProductes.get(i).getPreu());
		  	}	
			return PreuTotal;
	}
	
}
