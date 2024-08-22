package com.practices.exam.Rahulshetty;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(4);
		System.out.println("The array is: " + array);
		
		Collections.reverse(array);
		
		System.out.println("The reversed array is: " + array);
		
	}

}
