package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Object> h = new TreeSet<>();
		
		h.add("Good");
		h.add("Bad");
		h.add("Good");
		
		
		System.out.println(h);
		
		System.out.println("Iterating using Enhanced for loop");
		
		for(Object k : h)
		{
			System.out.println(k);
		}
		System.out.println("Iterating using Lambda expresion");
		
		h.forEach(k->System.out.println(k));
		
		System.out.println("Iterating using Iterator");
		
		Iterator<Object> Ar = h.iterator();
		
		while(Ar.hasNext())
		{
			System.out.println(Ar.next());
		}
		
	}
	
	
	

}
