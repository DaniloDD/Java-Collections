package com.practices.exam.Rahulshetty;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicates {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inster string");
		String s1 = scan.nextLine();
		findDuplicates(s1);
		scan.close();
	}
	
	public static char[] findDuplicates(String s1) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		char[] chars = s1.toCharArray();
		
		for (char c : chars) {
			if (map.containsKey(c)) {
				map.replace(c, map.get(c) + 1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		Set<Character> mapSet = map.keySet();
		
		for (char c: mapSet) {
			if (map.get(c) > 1) {
				System.out.println("The character " + c + " appears a number of times of: " + map.get(c));
			}
		}
		
		return null;
	}
}
