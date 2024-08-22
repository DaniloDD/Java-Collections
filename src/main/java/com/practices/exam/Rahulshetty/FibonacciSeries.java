package com.practices.exam.Rahulshetty;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int length = scan.nextInt();

		if(length < 0) {
			System.out.println("Invalid request");
		}
		if (length == 1) {
			System.out.println("The series is " + " 0 ");
			return;
		}
		if (length == 2) {
			System.out.println("The series is " + "0, 1 ");
			return;
		}
		int[] series = new int[length];
		series[0] = 0;
		series[1] = 1;
		for (int i = 2; i< series.length; i++) {
			series[i] = series[i-1] + series[i-2]; 
		}
		System.out.println("The series is:");
		for (int num : series) {
			System.out.print(num + ", " );
		}
		scan.close();
	}

}
