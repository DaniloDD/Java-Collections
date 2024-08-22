package com.practices.exam.Medium_Java_Programs;

import java.util.Scanner;

public class InsertionSort {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the number in the array:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		insertionSort(array);
		System.out.println("The sorted array is:");
		for (int num: array) {
			System.out.print(num + " ");
		}
		scan.close();
	}
	
	public static void insertionSort(int[] array) {
		for(int i = 1; i< array.length; i++) {
			int index = i;
			while (index > 0 && array[index-1]>array[index]) {
				int temp = array[index-1];
				array[index-1]= array[index];
				array[index]= temp;
				index--;
			}
		}
	}

}
