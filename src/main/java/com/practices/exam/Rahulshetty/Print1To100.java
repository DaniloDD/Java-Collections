package com.practices.exam.Rahulshetty;

public class Print1To100 {
	
	public static void main (String[] args) {
		print100Nums(100);
	}
	
	public static int print100Nums(int num)
	{
		if (num == -1) {
			System.out.println("");
		}
		if(num>0) {
			System.out.println(num);
			return print100Nums(num-1);
		}
		return -1;
	}
}