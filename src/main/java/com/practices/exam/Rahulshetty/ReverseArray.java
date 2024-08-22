package com.practices.exam.Rahulshetty;

import java.util.Scanner;

public class ReverseArray {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert size of array:");
		int size = scan.nextInt();
		System.out.println("Insert values of the array:");
		
		int[] array = new int[size];
		
		for (int i = 0; i< size; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("The array is:");
		for (int num : array) {
			System.out.println(num);
		}
		
		reverseArrayWithTheSameArray(array);
	
		scan.close();
	}
	
	public static void reverseArrayWithAnotherArray(int[] array) {
		int[] reversed = new int[array.length];
		for (int i =0; i< array.length; i++) {
			reversed[array.length-1-i] = array[i];
		}
		
		System.out.println("The reversed array is:");
		for (int num : reversed) {
			System.out.println(num);
		}
	}
	
	public static void reverseArrayWithTheSameArray(int[] array) {
		int left = 0;
		int right = array.length-1;
		
		int temp = 0;
		while (left < right) {
			temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			
			left++;
			right--;
		}
		
		System.out.println("The reversed array is:");
		for (int num : array) {
			System.out.println(num);
		}
	}

}
