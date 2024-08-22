package com.practices.exam.Medium_Java_Programs;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the size of the array:");
		int size = scan.nextInt();
		int[] array = new int[size];
		
		System.out.println("Insert the numbers in the array:");
		for (int i =0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		bubbleSort(array);
		
		System.out.println("The sorted array is: ");
		for (int num: array) {
			System.out.print(num +  " " );
		}
		scan.close();
	}
	
	public static void bubbleSort(int[] array) {
		for (int i = 0; i< array.length-1; i++) {
			for (int j = 0; j< array.length-1-i; j++) {
				if (array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
