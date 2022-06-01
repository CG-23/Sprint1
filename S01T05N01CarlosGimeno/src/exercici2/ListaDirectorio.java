package exercici2;

import java.io.File;
import java.sql.Date;

public class ListaDirectorio {
	
	public static void main(String[] args){
//		ImprimirDirectorio("./");
		RecorrerDirectorio("./");
	}
	
	public static void ImprimirDirectorio(String ruta) {
		File directorio = new File(ruta);
		String[] ListaArchivos = directorio.list();
		for(String value : ListaArchivos) {
			System.out.println(value);
		}
	}
	public static void RecorrerDirectorio(String ruta) {
		File directorio = new File(ruta);
		String[] ListaArchivos = directorio.list();
		
		for (int i=0; i<ListaArchivos.length; i++) {
			File direct = new File (directorio.getAbsolutePath(), ListaArchivos[i]);
			long modifiedValue = direct.lastModified();
	        Date modifiedDate = new Date(modifiedValue);
			System.out.println(ListaArchivos[i]+"   "+modifiedDate);
			
			if(direct.isDirectory()) {
				String [] subcarpetas = direct.list();
				for(String result : subcarpetas) {
					System.out.println("         "+result);
				}
			}
		}
	}
}

