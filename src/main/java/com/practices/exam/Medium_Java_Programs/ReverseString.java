package com.practices.exam.Medium_Java_Programs;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inster the string: ");
		String st = scan.nextLine();
		String reveredString = "";
		for (int i= st.length()-1; i >=0; i--) {
			reveredString = reveredString + st.charAt(i);
		}
		System.out.println("The revered string is: " + reveredString);
		
		scan.close();
	}

}
