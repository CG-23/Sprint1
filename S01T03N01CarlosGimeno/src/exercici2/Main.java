package exercici2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import exercici1.Month;

public class Main {

	public static void main(String[] args) {
		List<Integer> lista1 = new ArrayList <Integer>();
		List<Integer> lista2 = new ArrayList <Integer>();
		
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		
		Iterator<Integer> it = lista1.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    System.out.println("\n");
//	    for(int i=lista1.size()-1; i>=0 ;i--){
//	    lista2.add(lista1.get(i));
//		}
	    ListIterator<Integer> inverso = lista1.listIterator(lista1.size());
	    while(inverso.hasPrevious()){
	    	lista2.add(inverso.previous());
	    }
	    for(Integer in : lista2) {
	    	System.out.println(in);
	    }	    
	}
}
