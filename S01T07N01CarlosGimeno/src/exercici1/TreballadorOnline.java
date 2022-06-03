package exercici1;

public class TreballadorOnline extends Treballador {
	public TreballadorOnline(String nom, String cognom, float preuHora) {
		super(nom, cognom, preuHora);
	}

	private static final float internet = 100;
	
	@Override
	public float calcularSou(float horas) {
		return(horas*preuHora+internet);
	}

}
