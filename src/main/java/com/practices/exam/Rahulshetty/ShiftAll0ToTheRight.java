package com.practices.exam.Rahulshetty;

public class ShiftAll0ToTheRight {
	
	public static void main (String[] args) {
		int[] nums = {1, 2, 0, 3, 4, 0, 5, 0, 0, 6, 7};
		int[] numsShifted = new int[nums.length];
		int count = 0;
		for (int i = 0; i< nums.length; i++) {
			if (nums[i] != 0) {
				numsShifted[count] = nums[i];
				count++;
			}
		}
		for (int num : numsShifted) {
			System.out.print(num + " ");
		}
	}
}
