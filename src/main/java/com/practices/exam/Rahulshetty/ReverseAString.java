package com.practices.exam.Rahulshetty;

import java.util.Scanner;

public class ReverseAString {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the string:");
		String s = scan.nextLine();
		String reversed = reverseString(s);
		System.out.println("The revesed string is: " + reversed);
		scan.close();
	}
	
	public static String reverseString(String s) {
		String returnedSt = "";
		for (int i = s.length()-1; i>=0; i--) {
			returnedSt = returnedSt + s.charAt(i);
		}
		return returnedSt;
	}
}