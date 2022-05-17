package Exercici2;

public class Exercici2 {

	public static void main(String[] args) {
		
		Cotxe.accelerar();
//		No cal crear un objecte, es crida dsd la classe.		
		Cotxe cotxe1 = new Cotxe("Volvo", "FR", 500);
		
		cotxe1.frenar();
//		Cal crear un objecte per cridar al metode.
		
		
		System.out.println(cotxe1.getMarca());
		System.out.println(cotxe1.getPOTENCIA());
		System.out.println(cotxe1.getModel());
		Cotxe.setModel("RS");
		System.out.println(cotxe1.getModel());
	}

}
