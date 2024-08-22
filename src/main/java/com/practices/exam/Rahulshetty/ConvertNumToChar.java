package com.practices.exam.Rahulshetty;

public class ConvertNumToChar {
	
	public static void main (String[] args) {
		String s = "a2b3c5";
		System.out.println("Give the string a2b3c5:");
		System.out.println("The printed alphabetic string is:");
		String toPrint = "";
		for (int i =0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				toPrint = toPrint+s.charAt(i);
			}
			else {
				int a = Character.getNumericValue(s.charAt(i));
				for (int j =0; j<a-1; j++) {
					toPrint = toPrint+s.charAt(i-1);
				}
			}
		}
		System.out.println(toPrint);
	}

}
