package com.practices.exam.Medium_Java_Programs;

import java.util.Scanner;

public class WordsInAString {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inster the string");
		String st = scan.nextLine();
		String[] words = st.split("\\s+");
		System.out.println("The number of words is: " + words.length);
		scan.close();
	}

}
