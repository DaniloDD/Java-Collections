package com.practices.exam.Easy_Java_Programs;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("The random number is: " + random.nextInt(1, 100));
	}

}
