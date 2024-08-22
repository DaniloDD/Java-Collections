package com.practices.exam.Rahulshetty;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inser the number:");
		int num = scan.nextInt();
		
		int actualNum = num;
		double result =0;
		
		while (actualNum!= 0) {
			int singleNum = actualNum % 10;
			result = result + Math.pow(singleNum, 3);
			actualNum = actualNum/10;
		}
		
		if (num == result) {
			System.out.println("The number is Amstrong");
		}
		
		else {
			System.out.println("The number is not Amstrong");
		}
		scan.close();
	}
}
