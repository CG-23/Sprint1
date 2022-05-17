package Exercici1;

public class Exercici1 {

	public static void main(String[] args) {
		
		Corda violi = new Corda("Violi", 153);
		Vent trompeta = new Vent("Trompeta", 345);
		Percussio tambor = new Percussio("Tambor", 675);
		
		violi.tocar();
		trompeta.tocar();
		tambor.tocar();
		

	}

}
