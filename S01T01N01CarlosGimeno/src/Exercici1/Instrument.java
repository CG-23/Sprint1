package Exercici1;

public abstract class Instrument {
	
	private String nom;
	private int preu;
	
	static {
		System.out.println("Bloc inicializació de classe");
	}
	
	{
		System.out.println("Inicialització de blocs d'instància");
	}
	
	public Instrument (String nom, int preu) {
		this.nom  = nom;
		this.preu = preu;
	}
	
	public abstract void tocar();

}
