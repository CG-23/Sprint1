package exercici3;

public class ExcepcioTesting {
	
	private int [] Arreglo = {1,2,3,4,5};
	public ExcepcioTesting(){		
	}
	
	public int PosicionArreglo(int posicion)throws ArrayIndexOutOfBoundsException {
		if (posicion >= Arreglo.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return Arreglo[posicion];
	} 
}
