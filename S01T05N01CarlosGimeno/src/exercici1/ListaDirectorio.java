package exercici1;

import java.io.File;
import java.util.Arrays;

public class ListaDirectorio {
	
	public static void main(String[] args){
		ImprimirDirectorio("./");
	}
	
	public static void ImprimirDirectorio(String ruta) {
		File directorio = new File(ruta);
		String[] ListaArchivos = directorio.list();
		//Para ordenar alfabeticamente
		Arrays.sort(ListaArchivos);
		for(String value : ListaArchivos) {
			System.out.println(value);
		}
	}
}
