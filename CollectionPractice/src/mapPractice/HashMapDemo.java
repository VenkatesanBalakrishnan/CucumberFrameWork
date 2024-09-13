package mapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;


public class HashMapDemo {
	
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		h.put("English", 60);
		h.put("Tamil", 100);
		h.put("English", 50);
		h.put("Bio", 50);
		h.put("Maths", null);
		h.put("HTML", 88);
		h.put(null, 40);
		h.put(null, 30);
		
		System.out.println(h);
		
		Set<String> ks = h.keySet();
		
		for(Object k:ks)
		{
			System.out.println(k);
		}
		
		Collection<Integer> v = h.values();
		
		for(Object k:v)
		{
			System.out.println(k);
		}
		
		Set<Entry<String, Integer>> E = h.entrySet();
		
		for(Entry<String,Integer> K :E)
		{
			System.out.println(K.getKey()+ "--" + K.getValue());
		}
		
	}

}
