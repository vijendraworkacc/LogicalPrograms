package com.te.javacode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDupliocates {
	private static Object[] removeDuplicates(Integer[] arr) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		HashSet<Integer> onlyDuplicates = new HashSet<Integer>();
		for (Integer integer : arr) {
			if (!hashSet.add(integer)) {
				onlyDuplicates.add(integer);
			}
		}
		List<Integer> nonDuplicates = new ArrayList<Integer>();
		for (Integer integer : arr) {
			if (!onlyDuplicates.contains(integer)) {
				nonDuplicates.add(integer);
			}
		}
		return nonDuplicates.toArray();

	}

	public static void main(String[] args) {
		Integer[] arr = { 2, 1, 3, 3, 4, 1, 6, 7, 9, 0, 9, 7, 9 };
		Object[] removeDuplicates = removeDuplicates(arr);
		for (Object integer : removeDuplicates) {
			System.out.print(integer + " ");
		}
	}
}
