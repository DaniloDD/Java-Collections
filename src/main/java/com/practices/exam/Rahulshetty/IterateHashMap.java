package com.practices.exam.Rahulshetty;

import java.util.HashMap;
import java.util.Iterator;

public class IterateHashMap {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Anna", 461177);
		map.put("Dani", 461179);
		map.put("Courtney", 461181);
		map.put("Tony", 461183);
		map.put("Florence", 461187);
		
		// METHOD 1
		Iterator<String>  it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println("The key is: " + key + "  ||   the value is: " + value);
					
		}
		
		// METHOD 2
		
		// METHOD
		
		// METHOD
		
		// METHOD
		
	}

}
