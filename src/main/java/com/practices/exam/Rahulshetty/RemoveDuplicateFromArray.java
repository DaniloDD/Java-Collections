package com.practices.exam.Rahulshetty;

import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7, 7, 9 };
		HashSet<Integer> setNoDupl = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			setNoDupl.add(nums[i]);
		}
		System.out.println(setNoDupl);
	}

}
