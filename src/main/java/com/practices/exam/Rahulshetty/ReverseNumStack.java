package com.practices.exam.Rahulshetty;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumStack {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inseret the number to reverse:");
		int num = scan.nextInt();
		Stack<Integer> nums = new Stack<>();
		while (num != 0) {
			nums.push(num%10);
			num = num / 10;
		}
		int k = 1;
		int result = 0;
		 while (nums.size() != 0) {
			 result = result + (nums.pop()*k);
			 k = k*10;
		 }
		 System.out.println("The reversed number is:" + result);
		 scan.close();
	}
}
