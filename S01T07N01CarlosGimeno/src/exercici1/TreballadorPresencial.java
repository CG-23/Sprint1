package exercici1;

public class TreballadorPresencial extends Treballador {
	public TreballadorPresencial(String nom, String cognom, float preuHora) {
		super(nom, cognom, preuHora);
	}

	private static float gasolina = 50;
	
	@Override
	public float calcularSou(float horas) {
		return(horas*preuHora+gasolina);
	}
}
