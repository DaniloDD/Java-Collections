package com.practices.exam.Rahulshetty;

import java.util.Scanner;

public class FirstAndLastNumPos {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inser the size of the array");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the number in the array:");
		for (int i =0; i < size; i++) {
			array[i] = scan.nextInt();
		}

		int firstPos =-1;
		int lastPos = -1;
		
		System.out.println("Which number do you want to get the first and last position of?");
		int target = scan.nextInt();
		for (int i =0; i< size; i++) {
			if (array[i]==target) {
				firstPos = i;
				break;
			}
		}
		for (int j = size-1; j>0; j--) {
			if (array[j] == target) {
				lastPos = j;
				break;
			}
		}
		
		if (firstPos == lastPos && firstPos>0) {
			System.out.println("The number is present only one time at index: " + firstPos);
		}
		else if(firstPos<0 || lastPos<0) {
			System.out.println("The number is not present in the array");
		}
		else {
			System.out.println("The number appears first at index: " + firstPos + " and last at index: " + lastPos);
		}
		scan.close();
		
	}

}
