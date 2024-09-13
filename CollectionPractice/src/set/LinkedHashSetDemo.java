package set;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		
		LinkedHashSet<Object> l = new LinkedHashSet<>();

		l.add("Good");
		l.add("Bad");
		l.add('#');
		l.add(56);
		l.add(26);
		l.add("Good");
		l.add("Venkat");
		l.add(null);
		
		System.out.println(l);
		
		System.out.println("Iterating using Enhanced for loop");
		
		for(Object k : l)
		{
			System.out.println(k);
		}
		
		System.out.println("Iterting using Lambda Expresion");
		
		l.forEach(k->System.out.println(k));
		
		System.out.println("Itreting using Iterator");
		
		Iterator<Object> lr = l.iterator();
		while(lr.hasNext())
		{
			System.out.println(lr.next());
		}
		
	}
	

	


}
