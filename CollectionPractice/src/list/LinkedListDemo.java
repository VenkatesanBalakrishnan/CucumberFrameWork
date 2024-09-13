package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		
		LinkedList<Object> l = new LinkedList<>();
		
		LinkedList<Object> m = new LinkedList<>();
		
		l.add("Venkat");
		l.add("Pavi");
		l.add(56);
		l.add('#');
		l.add("Selenium");
		l.add(25);
		
		System.out.println(l);
		
		l.add(1, "love");
		l.contains("love");
		l.indexOf(56);
		l.lastIndexOf(25);
		l.isEmpty();
		l.get(1);
		l.set(1, "Pavithra");
		l.remove(3);
	l.remove("Selenium");
		
		System.out.println(l);
		
		l.size();
		m.addAll(l);
		m.removeAll(l);
		m = (LinkedList<Object>) l.clone();
		m.clear();
		
		
		Object[] arr = l.toArray();
		
		System.out.println("Iterating Array using normal for loop");
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Iterating Array using Enhanced for loop");
		
		for(Object k : arr)
		{
			System.out.println(k);
		}
		
		System.out.println("Iterating List using normal for loop");
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println("Iterating using lambda Expresion");
		
		l.forEach(k-> System.out.println(k));
		
		
		System.out.println("Iterating using Iterator");
		
		Iterator<Object> lr = l.iterator();
		
		while(lr.hasNext())
		{
			System.out.println(lr.next());
		}
		
	}

}
