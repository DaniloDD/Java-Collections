package com.practices.exam.Rahulshetty;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingChar {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the string");
		String s = scan.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();
		char[] chars = s.toCharArray();
		boolean isPresent = false;
		
		for (int i =0; i < chars.length; i++) {
			if (map.get(chars[i]) != null) {
				String c = String.valueOf(chars[i]);
				if (!c.equals(" ")) {
					System.out.println("The first charcater repeated is: " + chars[i]);
					isPresent = true;
					scan.close();
					return;
				}
				
			}
			else {
				map.put(chars[i], 1);
			}
		}
		
		if(!isPresent) {
			System.out.println("There are no repeated charcaters");
		}
		scan.close();
	}

}
