package com.practices.exam.Easy_Java_Programs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose Type of operation:");
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		System.out.println("What type of operation do you want to perform (1-2-3-4)?");
		int caseOp = scan.nextInt();
		System.out.println("Insert first number:");
		int firstNum = scan.nextInt();
		System.out.println("Insert second number:");
		int secondNum = scan.nextInt();

		switch (caseOp) {
			case 1: {
				System.out.println("The result is: " + (firstNum + secondNum));
				break;
				
			}
			case 2: {
				System.out.println("The result is: " + (firstNum - secondNum));
				break;
			}
			case 3: {
				System.out.println("The result is: " + (firstNum * secondNum));
				break;
			}

			case 4: {
				System.out.println("The result is: " + (firstNum / secondNum));
				break;
			}			
			
		}
		scan.close();
	}
}
