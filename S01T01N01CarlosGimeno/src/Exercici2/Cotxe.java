package Exercici2;

public class Cotxe {
	
	private static final String MARCA = "BMW";
	private static String model;
	private final int POTENCIA;
	
	public Cotxe(String MARCA, String model, int POTENCIA){
		this.POTENCIA = POTENCIA;
		this.model = model;
		final int CV = 400;
//		STATIC FINAL, Es una constant que afecta a tot els objectes de la classe
//		nomes es guarda un cop a memoria.
//		STATIC El mateix pero es una variable i no una constant.
//      FINAL Es una constant y es l'unica que podem inicialitazar al constructor.
	}
	
	public static void accelerar() {
		System.out.println("El vehicle està accelerant");
		}
	public void frenar() {
		System.out.println("El vehicle està frenant");
	}

	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Cotxe.model = model;
	}

	public static String getMarca() {
		return MARCA;
	}

	public int getPOTENCIA() {
		return POTENCIA;
	}

	

	

	
	

}
		
	