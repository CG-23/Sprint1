package exercici1;

import java.io.File;

public class ListaDirectorio {
	
	public static void main(String[] args){
		ImprimirDirectorio("./");
	}
	
	public static void ImprimirDirectorio(String ruta) {
		File directorio = new File(ruta);
		String[] ListaArchivos = directorio.list();
		for(String value : ListaArchivos) {
			System.out.println(value);
		}
	}
}
