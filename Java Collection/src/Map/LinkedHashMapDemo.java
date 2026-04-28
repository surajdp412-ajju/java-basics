package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
		
		lmap.put("Suraj", 27);
		lmap.put("John", 47);
		lmap.put("Amit", 26);
		lmap.put("Nikitha", 23);
		lmap.put("Julia", 32);
		lmap.putIfAbsent("Suraj1", 29);
		
		System.out.println(lmap);
		System.out.println("Size of map : " + lmap.size());
		System.out.println("Is map Empty : " + lmap.isEmpty());
		System.out.println("Does it contains Nikitha  : " + lmap.containsKey("Nikitha"));
		System.out.println("Does it contains 23 : " + lmap.containsValue(23));
		
		
		
		
		
		
	}
	
	
}
