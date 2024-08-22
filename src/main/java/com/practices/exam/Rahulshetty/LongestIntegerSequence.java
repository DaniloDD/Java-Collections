package com.practices.exam.Rahulshetty;

import java.util.Scanner;

public class LongestIntegerSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many elements the array has:");
		int size = scan.nextInt();
		System.out.println("Enter the elements:");

		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}

		int count = 0;
		int max = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] + 1 == array[i + 1]) {
				count++;
			} else {
				count = 0;
			}

			max = Math.max(max, count + 1);
		}
		System.out.println(max);
		scan.close();
	}

}
