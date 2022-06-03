package exercici8;

public class Main {

	public static void main(String[] args) {
		InterfazFuncionalReverse r = (str) -> {
            String ans = "";
            for(int i = str.length()-1; i>=0;i--)
                ans += str.charAt(i);
            return ans;
        };

        System.out.println( r.reverse("12345") );

	}

}
