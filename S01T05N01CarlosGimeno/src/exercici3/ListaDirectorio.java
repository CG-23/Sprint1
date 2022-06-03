package exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

public class ListaDirectorio {
	
	public static void main(String[] args) throws IOException{
//		ImprimirDirectorio("./");
		FileWriter fw = new FileWriter("hola.txt");
		RecorrerDirectorio("./",0, fw);
		fw.close();
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
	public static void RecorrerDirectorio(String ruta, int profundidad, FileWriter fw)throws IOException {
		File directorio = new File(ruta);
		String[] ListaArchivos = directorio.list();
		//Para ordenar alfabeticamente
		Arrays.sort(ListaArchivos);
		
		for (int i=0; i<ListaArchivos.length; i++) {
			File direct = new File (directorio.getAbsolutePath(), ListaArchivos[i]);
			long modifiedValue = direct.lastModified();
	        Date modifiedDate = new Date(modifiedValue);
			for(int j=0; j<profundidad;j++) {
				fw.write("\t");
			}
			if(direct.isDirectory()) {
				fw.write("(D) "+ListaArchivos[i]+"   "+modifiedDate+"\n");
				// Aquí utilizo Recursividad 
				RecorrerDirectorio(direct.getAbsolutePath(), profundidad+1,fw);

			}else {
				fw.write("(F) "+ListaArchivos[i]+"   "+modifiedDate+"\n");
			}
		}
	}
}

