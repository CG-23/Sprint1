package exercici2;

import java.io.File;
import java.sql.Date;
import java.util.Arrays;

public class ListaDirectorio {
	
	public static void main(String[] args){
//		ImprimirDirectorio("./");
		RecorrerDirectorio("./", 0);
	}
	
	public static void ImprimirDirectorio(String ruta) {
		File directorio = new File(ruta);
		String[] ListaArchivos = directorio.list();
		for(String value : ListaArchivos) {
			System.out.println(value);
		}
	}
	public static void RecorrerDirectorio(String ruta, int profundidad) {
		File directorio = new File(ruta);
		String[] ListaArchivos = directorio.list();
		//Para ordenar alfabeticamente
		Arrays.sort(ListaArchivos);
		
		for (int i=0; i<ListaArchivos.length; i++) {
			File direct = new File (directorio.getAbsolutePath(), ListaArchivos[i]);
			long modifiedValue = direct.lastModified();
	        Date modifiedDate = new Date(modifiedValue);
			for(int j=0; j<profundidad;j++) {
				System.out.print("\t");
			}
			if(direct.isDirectory()) {
				System.out.println("(D) "+ListaArchivos[i]+"   "+modifiedDate);
				// Aquí utilizo Recursividad 
				RecorrerDirectorio(direct.getAbsolutePath(), profundidad+1);

			}else {
				System.out.println("(F) "+ListaArchivos[i]+"   "+modifiedDate);
			}
		}
	}
}

