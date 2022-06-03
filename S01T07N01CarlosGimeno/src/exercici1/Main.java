package exercici1;

public class Main {

	public static void main(String[] args) {
		Treballador treballador1 = new Treballador("Carlos", "Gimeno", 1f);
		TreballadorOnline treballador2 = new TreballadorOnline("Pedro", "Gimeno", 1f);
		TreballadorPresencial treballador3 = new TreballadorPresencial("Joan", "Gimeno", 1f);
		
		float souTreballador = treballador1.calcularSou(10f);
		float souTreballadorOnline = treballador2.calcularSou(10f);
		float souTreballadorPresencial = treballador3.calcularSou(10f);
		
		System.out.println("Calcul treballador: "+souTreballador );
		System.out.println("Calcul treballador online: "+souTreballadorOnline );
		System.out.println("Calcul treballador presencial: "+souTreballadorPresencial );

	}

}
