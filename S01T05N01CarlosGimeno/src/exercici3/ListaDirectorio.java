package exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ListaDirectorio {
	
	public static void main(String[] args) throws IOException{
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
	public static void RecorrerDirectorio(String ruta) throws IOException {
		File directorio = new File(ruta);
		String[] ListaArchivos = directorio.list();
		FileWriter fw = new FileWriter("hola.txt");
		
		for (int i=0; i<ListaArchivos.length; i++) {
			File direct = new File (directorio.getAbsolutePath(), ListaArchivos[i]);
//			System.out.println(ListaArchivos[i]);
			fw.write(ListaArchivos[i]+"\n");
			
			if(direct.isDirectory()) {
				String [] subcarpetas = direct.list();
				for(String result : subcarpetas) {
//					System.out.println("         "+result);
					fw.write("      "+result+"\n");
				}
			}
		}
		fw.close();
	}
}

