package com.practices.exam.Rahulshetty;

import java.util.Scanner;

// a number is prime only if it s divisible for itself or for 1

public class Prime {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the number");
		int num = scan.nextInt();
		int middle = num/2;
		for (int i = 2; i<=middle; i++) {
			if (num%i == 0) {
				System.out.println("The number is not prime");
				return;
			}
		}
		
		System.out.println("The number is prime");
		scan.close();
		
	}

}
