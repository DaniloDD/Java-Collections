package com.practices.exam.Rahulshetty;

import java.util.Scanner;

public class SumDigits {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inster the number:");
		int num = scan.nextInt();
		int singleDigit = 0;
		int sum = 0; 
		
		while(num != 0) {
			singleDigit = num%10;
			sum = sum + singleDigit;
			num = num/10;
		}
		
		System.out.println("The sum of the single digits is: " + sum);
		scan.close();
	}

}
