package com.practices.exam.Rahulshetty;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfChar {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inster the string:");
		
		String s1 = scan.nextLine();
		charcaterCount(s1);
		scan.close();
	}	
	
	public static void charcaterCount(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		char[] arrayChar = s.toCharArray();
		
		for (char c : arrayChar) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c,  1);
			}
		}
		
		System.out.println(map);
	}
}
