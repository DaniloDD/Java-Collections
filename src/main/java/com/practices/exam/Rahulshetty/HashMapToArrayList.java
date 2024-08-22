package com.practices.exam.Rahulshetty;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapToArrayList {
	
	public static void main (String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Anna", 461177);
		map.put("Dani", 461179);
		map.put("Courtney", 461181);
		map.put("Tony", 461183);
		map.put("Florence", 461187);
		
		ArrayList<String> keys = new ArrayList<>(map.keySet());
		System.out.println("The keys are:");
		System.out.println(keys);
		
		ArrayList<Integer> values = new ArrayList<>(map.values());
		System.out.println("The values are:");
		System.out.println(values);
	}
}
