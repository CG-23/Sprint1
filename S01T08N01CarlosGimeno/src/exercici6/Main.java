package exercici6;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> lst = new LinkedList<>();
        lst.add("ab");
        lst.add("a");
        lst.add("abcd");
        lst.add("abc");

        List<String> ans = lst.stream().sorted( (x,y) -> x.length()-y.length() ).toList() ;

        ans.stream().forEach(x -> System.out.println(x));
	}

}
