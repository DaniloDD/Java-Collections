package com.practices.exam.Rahulshetty;

import java.util.Scanner;

public class SwapTwoNums {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Inster the first number:");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number:");
		int num2 = scan.nextInt();
		System.out.println("The two number are: " + num1 + " " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("The two numbers swapped are: " + num1 + " " + num2);
		scan.close();
	}

}
