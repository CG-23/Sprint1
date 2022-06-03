package exercic3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		HashMap<String,String> listaPaises = new HashMap<>();
		
		try {
			Scanner sc = new Scanner(new File("./countries.txt"));
			String linea;
			while (sc.hasNextLine()) {
				linea = sc.nextLine();
				if(linea.split(" ").length>1) {
				listaPaises.put(linea.split(" ")[0],linea.split(" ")[1]);
				}
			}
			sc.close();
	        } catch (FileNotFoundException e) {
			e.printStackTrace();
	        }
//		for(String pais : listaPaises.keySet()) {
//			System.out.println(pais+"  "+listaPaises.get(pais));
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre del usuario: ");
	    String nombre= sc.nextLine();
	    int puntuacion=0;
	    String capital, key;
	    Object[] cdr = listaPaises.keySet().toArray();
	    for(int i=0;i<10;i++) {
		key = (String) cdr[new Random().nextInt(listaPaises.size())];
//		System.out.println("************ Random Value ************ \n" + key);
		
		System.out.println("Escribe la càpital del paìs: "+key);
		capital = sc.nextLine();
		
			if(listaPaises.get(key).equalsIgnoreCase(capital)) {
				puntuacion += 1;
			}
	    }
	    // Aqui guardo en calificaciones.text el resultado del usuario
	    try {
			FileWriter myWriter = new FileWriter("calificaciones.txt");
			myWriter.write("La puntuacion del usuario: "+nombre+" es "+puntuacion);
			myWriter.close();
			} catch (IOException e) {
			e.printStackTrace();
		}
	    System.out.println("La puntuacion del usuario "+nombre+" es "+puntuacion);
	}

}
