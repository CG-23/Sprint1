package exercici1;

public class NoGenericMethods<T> {
	T obejeto1;
	T obejeto2;
	T obejeto3;
	
	public NoGenericMethods(T objeto1, T objeto2, T objeto3){
		this.obejeto1 = objeto1;
		this.obejeto2 = objeto2;
		this.obejeto3 = objeto3;
	}
	public T getObejeto1() {
		return obejeto1;
	}
	public void setObejeto1(T obejeto1) {
		this.obejeto1 = obejeto1;
	}
	public T getObejeto2() {
		return obejeto2;
	}
	public void setObejeto2(T obejeto2) {
		this.obejeto2 = obejeto2;
	}
	public T getObejeto3() {
		return obejeto3;
	}
	public void setObejeto3(T obejeto3) {
		this.obejeto3 = obejeto3;
	}
	

}
