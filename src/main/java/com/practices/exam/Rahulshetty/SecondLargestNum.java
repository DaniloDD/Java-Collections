package com.practices.exam.Rahulshetty;

import java.util.Scanner;

public class SecondLargestNum {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the size of the array:");
		int size = scan.nextInt();
		int[] array = new int[size];
		
		System.out.println("Insert the numbers in the array: ");
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		int secondHighest = findSecondHighest(array);
		System.out.println("The second higest number in the array is: " + secondHighest);
		scan.close();
	}
	
	public static int findSecondHighest(int[] array) {
		
		int highest = array[0];
		int secondHighest= 0;
		
		for (int i=1; i< array.length; i++) {
			if (array[i] > highest) {
				secondHighest = highest;
				highest = array[i];
			}
			else if(secondHighest<array[i]) {
				secondHighest=array[i];
			}
		}
		return secondHighest;
	}
}
