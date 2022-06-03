package exercici2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();

        lst.add("a1");
        lst.add("3ob");
        lst.add("4oasdasd");
        lst.add("93asdasdas");

        
        List<String> ejercicio2 =  lst.stream().filter( x-> x.contains("o")&&x.length()>5 ).toList();
        ejercicio2.stream().forEach( x -> System.out.println(x) );
	}

}
