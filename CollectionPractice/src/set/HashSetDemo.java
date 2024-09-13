package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<Object> h = new HashSet<>();
		
		h.add("Good");
		h.add("Bad");
		h.add('#');
		h.add(56);
		h.add(26);
		h.add("Good");
		h.add("Venkat");
		h.add(null);
		
		System.out.println(h);
		
		System.out.println("Iterating using Enhanced for loop");
		
		for(Object k : h)
		{
			System.out.println(k);
		}
		
		System.out.println("Iterating using Lambda Expresion");
		
		h.forEach(k->System.out.println(k));
		
		System.out.println("Iterating using Iterator");
		
		Iterator<Object> arr = h.iterator();
		
		while(arr.hasNext())
		{
			System.out.println(arr.next());
		}
	}
	
	

}
