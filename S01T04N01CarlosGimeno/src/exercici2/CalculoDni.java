package exercici2;

import java.util.ArrayList;

public class CalculoDni {
	
	public CalculoDni() {	
	}
	
	public static char CalculoLletraDni(int dni) {
		String lletres="TRWAGMYFPDXBNJZSQVHLCKE";
		int resto = dni%23;
        char lletra = lletres.charAt(resto);
        return lletra;
		
	}
	public static ArrayList<String>AfegirLlistaDni() {
		ArrayList<String>LlistaDni = new ArrayList<String>();
		LlistaDni.add("47969468R");
		LlistaDni.add("35988182J");
		LlistaDni.add("82858199D");
		LlistaDni.add("87693057Z");
		LlistaDni.add("63690080K");
		LlistaDni.add("45964353A");
		LlistaDni.add("63409190F");
		LlistaDni.add("21375139C");
		LlistaDni.add("78502161X");
		LlistaDni.add("33408405P");
		
		return LlistaDni;
	}
	
}
