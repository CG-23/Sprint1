package exercici2;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		TreballadorOnline treballador2 = new TreballadorOnline("Pedro", "Gimeno", 1f);
		TreballadorPresencial treballador3 = new TreballadorPresencial("Joan", "Gimeno", 1f);
		
		treballador2.welcome();
		treballador3.welcome();
		
		treballador2.adios();
		treballador3.adios();
		
	}

}
