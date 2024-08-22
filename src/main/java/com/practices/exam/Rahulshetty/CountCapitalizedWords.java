package com.practices.exam.Rahulshetty;

import java.util.Scanner;

public class CountCapitalizedWords {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the string: ");
		String s = scan.nextLine();

		int counter =0;
		
		for (int i =0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i)<= 'Z') {
				counter++;
			}
		}
		
		System.out.println("The number of capital letters is: " + counter);
		
		scan.close();
	}

}
