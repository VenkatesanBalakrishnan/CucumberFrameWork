package mapPractice;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	
	
	public static void main(String[] args) {
		
		TreeMap<Object, Object> t = new TreeMap<Object, Object>();
		
		t.put("English", 60);
		t.put("Tamil", 100);
		t.put("English", 50);
		t.put("Bio", 80);
		t.put("Maths", null);
		t.put("HTML", 50);
		
		System.out.println(t);
		
		Set<Object> kS = t.keySet();
		
		for(Object k : kS)
		{
			System.out.println(k);
		}
		
		Collection<Object> v = t.values();
		
		for(Object k: v)
		{
			System.out.println(k);
		}
		
		Set<Entry<Object, Object>> E = t.entrySet();
		
		for(Entry <Object,Object> k: E)
		{
			System.out.println(k.getKey()+ "--"+ k.getValue());
		}
		
		
		System.out.println("Iterator");
		
		Set<Entry<Object, Object>> ES = t.entrySet();
		
	Iterator<Entry<Object, Object>> IT = ES.iterator();
	
	while(IT.hasNext())
	{
		System.out.println(IT.next());
	}
		
	}
}
