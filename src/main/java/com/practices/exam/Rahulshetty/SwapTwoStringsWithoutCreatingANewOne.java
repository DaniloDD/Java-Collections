package com.practices.exam.Rahulshetty;

import java.util.Scanner;

public class SwapTwoStringsWithoutCreatingANewOne {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert first string:");
		String s1 = scan.nextLine();
		System.out.println("Insert second string:");
		String s2 = scan.nextLine();
		
		s1 = s1+ s2;
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());		
		System.out.println("Inverted strings are: " + s1 + " " + s2);
		scan.close();
	}

}
