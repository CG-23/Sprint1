package Exercici1;

public abstract class Instrument {
	
	private String nom;
	private int preu;
	
	static {
		System.out.println("Bloc inicializaci├│ de classe");
	}
	
	{
		System.out.println("Inicialitzaci├│ de blocs d'inst├áncia");
	}
	
	public Instrument (String nom, int preu) {
		this.nom  = nom;
		this.preu = preu;
	}
	
	public abstract void tocar();

}
