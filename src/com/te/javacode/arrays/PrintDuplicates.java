package com.te.javacode.arrays;

import java.util.HashSet;

public class PrintDuplicates {

	private static void printDuplicates(Integer[] arr) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		HashSet<Integer> onlyDuplicates = new HashSet<Integer>();
		for (Integer integer : arr) {
			if (!hashSet.add(integer)) {
				onlyDuplicates.add(integer);
			}
		}
		System.out.println(onlyDuplicates.toString());
		
	}

	public static void main(String[] args) {
		Integer[] arr = { 2, 1, 3, 3, 4, 1, 6, 7, 9, 0, 9, 7, 9 };
		printDuplicates(arr);
	}
}
