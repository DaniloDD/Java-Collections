package com.practices.exam.Rahulshetty;

public class PrintMissingNumber {
	
	public static void main (String[] args) {
		
		int[] nums = {1, 2, 3, 4, 5, 7, 8, 10};
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i+1] != nums[i] + 1) {
			System.out.println("The missing number is " + (nums[i] + 1));
			}
		}
	}
}
