package exercici4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();

		lst.add("gener");
        lst.add("febrer");
        lst.add("març");
        lst.add("abril");
        lst.add("maig");
        lst.add("juny");
        lst.add("juliol");
        lst.add("agost");
        lst.add("septembre");
        lst.add("octubre");
        lst.add("novembre");
        lst.add("desembre");
        
        lst.stream().forEach( System.out::println );

	}

}
