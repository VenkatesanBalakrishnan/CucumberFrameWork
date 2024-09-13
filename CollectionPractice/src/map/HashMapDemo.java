package map;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
public static void main(String[] args) {
		
		
		HashMap<Object, Object> h = new HashMap<Object, Object>();
		
		h.put("Englisg", 90);
		
		System.out.println(h);
		
		Set<Entry<Object, Object>> E = h.entrySet();
		for(Entry <Object, Object> k:E)
		{
			System.out.println(k);
		}

}}
