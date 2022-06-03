package exercici1;

public class Treballador {
	private String nom;
	private String cognom;
	protected float preuHora;


	public Treballador(String nom, String cognom, float preuHora){
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;		
	}
	
	public float calcularSou(float horas) {
		return (horas*preuHora);
	}
}