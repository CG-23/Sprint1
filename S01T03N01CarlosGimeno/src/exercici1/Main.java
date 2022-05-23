package exercici1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Month>MesosAny = new ArrayList<Month>();
		
		MesosAny.add(new Month("Gener"));
		MesosAny.add(new Month("Febrer"));
		MesosAny.add(new Month("Març"));
		MesosAny.add(new Month("Abril"));
		MesosAny.add(new Month("Maig"));
		MesosAny.add(new Month("Juny"));
		MesosAny.add(new Month("Juliol"));
		MesosAny.add(new Month("Septembre"));
		MesosAny.add(new Month("Octubre"));
		MesosAny.add(new Month("Novembre"));
		MesosAny.add(new Month("Decembre"));
		
		
		for(int  i= 0; i < MesosAny.size(); i++ ) {
		    System.out.println(MesosAny.get(i).getName());
		}
		
		MesosAny.add(7,new Month("Agost"));
		
		for(int  i= 0; i < MesosAny.size(); i++ ) {
		    System.out.println(MesosAny.get(i).getName());
		}
	}

}
