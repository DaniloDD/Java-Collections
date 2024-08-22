package com.practices.exam.Easy_Java_Programs;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Inster string:");
		String s= scan.nextLine();
		
		StringBuilder st = new StringBuilder(s);
		System.out.println("The reversed string is: " + st.reverse());
		scan.close();
	}

}
