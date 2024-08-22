package com.practices.exam.Medium_Java_Programs;

import java.util.Scanner;

public class SelectionSort {
	
	public static void main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the number in the array:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		selectionSort(array);
		System.out.println("The sorted array is:");
		for (int num: array) {
			System.out.print(num + " ");
		}
		
		scan.close();
		
	}
	
	public static void selectionSort(int[] array) {
		for(int i=0; i< array.length; i++) {
			int indexMin =i;
			for(int j =i+1; j<array.length; j++) {
				if (array[j] < array[indexMin]) {
					indexMin = j;
				}
			}
			int temp = array[i];
			array[i] = array[indexMin];
			array[indexMin] = temp;
		}
	}

}
