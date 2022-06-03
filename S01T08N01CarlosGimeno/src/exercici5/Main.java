package exercici5;

public class Main {

	public static void main(String[] args) {
		
		InterfazFuncional f = () -> 3.1415;    
        
        System.out.println( f.getPiValue() );
	}

}
