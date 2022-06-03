package exercici1;

public class Main {

	public static void main(String[] args) {
		NoGenericMethods<Integer> obj1 = new NoGenericMethods<Integer>(1, 2, 3);
		NoGenericMethods<Integer> obj2 = new NoGenericMethods<Integer>(2, 3, 1);
		NoGenericMethods<Integer> obj3 = new NoGenericMethods<Integer>(3, 1, 2);
	}

}
