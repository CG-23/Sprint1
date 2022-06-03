package exercici2;

public class Main {

	public static void main(String[] args) {
		
		String str1 = "Hola";
		String str2 = "Carlos";
		String str3 = "Adios";
		
		GenericMethods<String> gen = new GenericMethods<>();
		gen.metodo(str1, str2, str3);
		
		Persona persona1 = new Persona("Carlos", "Gimeno", 26);
		Persona persona2 = new Persona("Pablo", "Gimeno", 28);
		Persona persona3 = new Persona("Luis", "Gimeno", 56);
		
		GenericMethods<Persona> gen_persona = new GenericMethods<>();
		gen_persona.metodo(persona1, persona2, persona3);
		
		int in1 = 2;
		int in2 = 4;
		int in3 = 6;
		
		GenericMethods<Integer> gen_numero = new GenericMethods<>();
		gen_numero.metodo(in1, in2, in3);

		
		
		
		

	}

}
