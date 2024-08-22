package com.practices.exam.Easy_Java_Programs;

import java.util.Scanner;

// a number is prime if:
// 1. it is divisible only for 1 and itself

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert number: ");
		int num = scan.nextInt();
		
		if (num>0 && num< 4) {
			System.out.println("The number is prime");
			scan.close();
			return;
		}
		
		int mid = num/2;
		for (int i =2; i <= mid; i++) {
			if (num%i ==0) {
				System.out.println("The number is not prime");
				scan.close();
				return;
			}
		}
		System.out.println("The number is prime");
		
		scan.close();
		
	}

}
