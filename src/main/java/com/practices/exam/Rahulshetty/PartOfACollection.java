package com.practices.exam.Rahulshetty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// check if a specific value is present in a collection like HashMap or ArrayList
public class PartOfACollection {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Anna", 461177);
		map.put("Dani", 461179);
		map.put("Courtney", 461181);
		map.put("Tony", 461183);
		map.put("Florence", 461187);
		String name = "Dani";
		if (!map.containsKey(name)) {
			System.out.println("The name " + name + " is not present in the HashMap");
		}
		else {
			System.out.println("The name " + name + " is present in the HashMap");
		}
		
		List<String> list = new ArrayList<>(map.keySet());
		if (!list.contains(name)) {
			System.out.println("The name " + name + " is not present in the ArrayList");
		}
		else {
			System.out.println("The name " + name + " is present in the ArrayList");
		}
		

	}

}
