package com.practices.exam.Easy_Java_Programs;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Intert the string");
		String st = scan.nextLine();
		st = st.toLowerCase();
		
		if (st.length()==1) {
			System.out.println("The string is palindrome");
			scan.close();
			return;
		};
		
		int leftIndex = 0;
		int rightIndex = st.length()-1;
		int midIndex = (st.length())/2;
		
		boolean isPlandrome = true;
		while (leftIndex<=midIndex) {
			if (st.charAt(rightIndex) != st.charAt(leftIndex)) {
				isPlandrome = false;
			}
			leftIndex++;
			rightIndex--;			
		}
		if(isPlandrome) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("The string is not palindrome");
		}
		scan.close();
		
		
	}

}
