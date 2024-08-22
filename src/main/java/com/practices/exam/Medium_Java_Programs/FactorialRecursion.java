package com.practices.exam.Medium_Java_Programs;

import java.util.Scanner;

public class FactorialRecursion {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the number: ");
		int num = scan.nextInt();
		System.out.println("The fattorial is: " + fattorial(num));
		scan.close();
	}
	
	public static int fattorial(int number) {
		if (number == 0) return 1;		// base case
		
		return number * fattorial(number-1);	// recursion
	}

}
