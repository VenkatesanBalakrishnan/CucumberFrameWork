package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Object> a = new ArrayList<>();
		ArrayList<Object> b = new ArrayList<>();
		
		System.out.println(a);
		
		a.add(34);
		a.add('#');
		a.add("Oranium");
		a.add(true);
		a.add(65);
		a.add(45);
		a.add(null);
		a.add("tech");
		a.add("Oranium");
		System.out.println(a);
		
		System.out.println("ArrayList Pre defined Methods");
		
		
		a.add("Venakt");
		a.add(9, "Pavi");
		System.out.println(a.contains("Venakt"));
		System.out.println(a.indexOf("Pavi"));
		System.out.println(a.lastIndexOf("Oranium"));
		System.out.println(a.isEmpty());
		System.out.println(a.get(9));
		System.out.println(a.set(9, "Pavithra"));
		System.out.println();a.remove(10);
		System.out.println(a.remove(null));
		
		
		System.out.println("Next set of methods");
		
		System.out.println(a.size());
		System.out.println(b.addAll(a));
		System.out.println(b.removeAll(a));
		b = (ArrayList<Object>) a.clone();
		b.clear();
		
		
		System.out.println(" Diffrent type of Iteration");
		
		
		System.out.println("Covert List to Array and normal for loop");
		
		Object[] arr = a.toArray();
		
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		System.out.println("Iterating Array using enhanced for loop");
		
		
		for(Object k : arr)
		{
			System.out.println(k);
		}
		
		System.out.println("Iterating ArrayList using Noremal for loop with Size and get");
		
		for(int i =0; i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("Iterating ArrayList using Enhanced for loop");
		
		for(Object k : a)
		{
			System.out.println(k);
		}
		
		System.out.println("Iterating ArrayList using lambda expresion");
		
		a.forEach(k-> System.out.println(k));
		
		
		System.out.println("Iterating ArrayList Using Iterator");
		
	Iterator<Object> i = a.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	}
	

}
