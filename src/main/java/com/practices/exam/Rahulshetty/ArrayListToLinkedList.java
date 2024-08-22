package com.practices.exam.Rahulshetty;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListToLinkedList {
	
	public static void main(String[] args) {
		
		List<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(9);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(4);
		List<Integer> linkedList = new LinkedList<>(array);
		System.out.println(linkedList);
		
		
		
		List<String> list = new LinkedList<>();
		list.add("Dani");
		list.add("Sara");
		list.add("Tony");
		list.add("Courtney");
		ArrayList<String> arrayNames = new ArrayList<>(list);
		System.out.println(arrayNames);
	}
}
