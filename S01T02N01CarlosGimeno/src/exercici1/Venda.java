package exercici1;

import java.util.ArrayList;
import java.util.Scanner;
public class Venda {

	private  int PreuTotal;
	private  ArrayList <Producte> LlistaProductes;
	
	public Venda() {
		this.PreuTotal = 0;
		this.LlistaProductes = new ArrayList<>();
	}
	
	public void IntroducirProducto() {
		String continuar, confirmacio = "si";
		do {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nombre del producto: ");
			String nom = sc.nextLine();
			System.out.println("Preu del producto: ");
			int preu = sc.nextInt();
			sc.nextLine();
			System.out.println("Vols afegir un altre producte ? ");
			continuar = sc.nextLine();
			LlistaProductes.add(new Producte(nom,preu));
		}
		}while(confirmacio.equalsIgnoreCase(continuar));		
	}
	
	public int CalcularTotal()throws VendaBuidaException{
			if(LlistaProductes.size()==0) {
				throw new VendaBuidaException();
			}
			PreuTotal=0;
			for(int i=0; i<LlistaProductes.size(); i++) {
				
				PreuTotal +=(LlistaProductes.get(i).getPreu());
		  	}	
			return PreuTotal;
	}
	//Correció, llançament  del IndexOutBoundException.
	public Producte getProducte(int index)throws ArrayIndexOutOfBoundsException{
		if(index>=LlistaProductes.size() || index<0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return LlistaProductes.get(index);
	}

	public int getPreuTotal() {
		return PreuTotal;
	}

	public void setPreuTotal(int preuTotal) {
		PreuTotal = preuTotal;
	}
	
}
