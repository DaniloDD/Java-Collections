package com.practices.exam.Rahulshetty;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Anna", 461177);
		map.put("Dani", 461179);
		map.put("Courtney", 461181);
		map.put("Tony", 461183);
		map.put("Florence", 461187);
		
		// METHOD 1 - Using only Iterator
		System.out.println("----------------");
		Iterator<String>  it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println("The key is: " + key + "  ||   the value is: " + value);
					
		}
		
		
		// METHOD 2 - Using Map.Entry subinterface
		System.out.println("----------------");
		Iterator<Map.Entry<String, Integer>> itEntry = map.entrySet().iterator();
		while(itEntry.hasNext()) {
			Map.Entry<String, Integer> entr = itEntry.next();
			System.out.println("The key is: " + entr.getKey() + " ||  " + entr.getValue());
		}
		
		// METHOD 3
		System.out.println("----------------");
		for (Map.Entry<String, Integer> entr : map.entrySet()) {
			System.out.println("The key is: " + entr.getKey() + " ||  " + entr.getValue());
		}
		
		// METHOD 4
		System.out.println("----------------");
		// map.forEach((k, v) --> System.out.println(k + "||" + v));
		
		// METHOD 5
		System.out.println("----------------");
		for (String key : map.keySet()) {
			System.out.println(key);
		}
		for (int value : map.values()) {
			System.out.println(value);
		}
	}
}
