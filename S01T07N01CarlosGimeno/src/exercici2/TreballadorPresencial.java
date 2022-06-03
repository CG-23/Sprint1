package exercici2;

public class TreballadorPresencial extends Treballador {
	public TreballadorPresencial(String nom, String cognom, float preuHora) {
		super(nom, cognom, preuHora);
	}

	private static float gasolina = 50;
	
	@Override
	public float calcularSou(float horas) {
		return(horas*preuHora+gasolina);
	}
	
	@Deprecated
	public void welcome() {
		System.out.println("Hola presencial");
	}
	
	@Deprecated
	public void adios() {
		System.out.println("Adios presencial");
	}
}
