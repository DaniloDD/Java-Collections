package com.practices.exam.Rahulshetty;

import java.util.Scanner;

public class LongestSequenceOf1 {
	
	public static void main (String[] agrs) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the size of the array:");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Inser the sequence of 1 and 0");
		
		for (int i =0; i < size; i++) {
			array[i]= scan.nextInt();
		}
		
		int longestSequence = 0;
		int tempLongestSequence =0;
		for (int i =0; i < size; i++) {
			if (array[i]==1) {
				tempLongestSequence = tempLongestSequence +1;
			}
			else if (tempLongestSequence> longestSequence) {
				
				longestSequence = tempLongestSequence;
				tempLongestSequence =0;
			}
		}
		
		System.out.println(longestSequence);
		scan.close();
	}
}
