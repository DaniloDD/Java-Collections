package com.practices.exam.Medium_Java_Programs;

import java.util.Scanner;

public class SecondHighestNumArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scan.nextInt();
		int[] array = new int[size];
		
		System.out.println("Insert the numbers in the array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		int secondHighest = findSecondHighest(array);
		
		if (secondHighest >= 0) {
			System.out.println("The second highest number is: " + secondHighest);
		}
		else {
			System.out.println("There is no second highest number");
		}
	}
	
	public static int findSecondHighest(int[] arrayNum) {
		
		if (arrayNum.length< 3) return -1;
		
		int highest = arrayNum[0];
		int secondHighest =arrayNum[1];
		
		for (int i=1; i< arrayNum.length -1; i++) {
			if(highest<arrayNum[i]) {
				highest = arrayNum[i];
				secondHighest = highest;
			}
			else if (secondHighest<arrayNum[i]) {
				secondHighest = arrayNum[i];
			}
		}
		return secondHighest;
	}
}
