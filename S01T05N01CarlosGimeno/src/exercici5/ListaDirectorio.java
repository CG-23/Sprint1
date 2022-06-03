package exercici5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ListaDirectorio implements Serializable {
	
	public static void main(String[] args) throws IOException{
		String archivoSerializable = new String("Hola mundo");
		try {
			ObjectOutputStream escribirDato = new ObjectOutputStream(new FileOutputStream("C:/Users/karlo/Desktop/ItinerariJava/S01T05N01CarlosGimeno/serializar.ser"));
			escribirDato.writeObject(archivoSerializable);
			escribirDato.close();
			
			ObjectInputStream recuperarDato = new ObjectInputStream(new FileInputStream("C:/Users/karlo/Desktop/ItinerariJava/S01T05N01CarlosGimeno/serializar.ser"));
			String datorecuperado= (String)recuperarDato.readObject();
			recuperarDato.close();
			System.out.println(datorecuperado);
		}catch (Exception e) {			
		}
	}
}



