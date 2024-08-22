package com.practices.exam.Rahulshetty;

import java.util.Scanner;

public class SwapTwoGivenStrings {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inseter the first string:");
		String s1 = scan.nextLine();
		System.out.println("Inster the second string:");
		String s2 = scan.nextLine();
		System.out.println("The two strings are: " + s1 + " " + s2);
		String s3 = s2;
		s2 = s1;
		s1 = s3;
		System.out.println("The two swapped strings are: " + s1 + " " + s2);
	}
	
}
