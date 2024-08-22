package com.practices.exam.Medium_Java_Programs;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the size of the array:");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Entee the numbers in the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("Which element do you wanna find?");
		int target = scan.nextInt();
		int targetIndex = binarySearch(array, target);
		if (targetIndex < 0) {
			System.out.println("The element is not present in the array");
		} else {
			System.out.println("The element is present at the index position: " + targetIndex);
		}
	}

	public static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length-1;
		
		while(left<=right) {
			int mid = left + (right - left) /2;
			
			if (array[mid]== target) {	
				return mid;
			}
			
			else if (array[mid] > target) {				
				right = mid -1;
			}
			else if (array[mid] < target) {
				left = mid +1;
			}
		}
		return -1;
	}
}
