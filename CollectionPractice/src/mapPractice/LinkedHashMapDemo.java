package mapPractice;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> l = new LinkedHashMap<String, Integer>();
		
		l.put("English", 60);
		l.put("Tamil", 100);
		l.put("English", 50);
		l.put("Bio", 80);
		l.put("Maths", null);
		l.put("HTML", 88);
		l.put(null, 40);
		l.put(null, 30);
		
		System.out.println(l);
		
		Set<String> ks = l.keySet();
		
		for(String k : ks)
			
		{
			System.out.println(k);
		}
		
		Collection<Integer> v = l.values();
		for(Integer k:v)
		{
			System.out.println(k);
		}
		
		Set<Entry<String, Integer>> E = l.entrySet();
		
		for(Entry<String, Integer> k: E)
		{
			System.out.println(k.getKey()+ "-- " + k.getValue());
		}
		
	}

}
