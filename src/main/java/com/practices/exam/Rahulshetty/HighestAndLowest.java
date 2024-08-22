package com.practices.exam.Rahulshetty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestAndLowest {
	
	public static void main (String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.add(12);
		nums.add(21);
		nums.add(122);
		nums.add(1232);
		nums.add(112);
		nums.add(243);
		nums.add(25);
		Collections.sort(nums);
		int max = Collections.max(nums);
		int min = Collections.min(nums);
		
		System.out.println("The max number is: " + max + " the min number is " + min);
	}

}
