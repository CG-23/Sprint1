package exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();

        lst.add("carlos");
        lst.add("joan");
        lst.add("pere");
        lst.add("david");

        lst.stream().forEach(
            (x) -> {
                if( x.contains("o") )
                    System.out.println(x);
            } );
	}

}
