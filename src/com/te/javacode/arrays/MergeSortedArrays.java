package com.te.javacode.arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {
	private static List<Integer> getMergeSortedArray(Integer[] arr1, Integer[] arr2) {
		List<Integer> merged = new ArrayList<Integer>();
		int i = 0, j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				merged.add(arr1[i++]);
			} else {
				merged.add(arr2[j++]);
			}
		}
		while (i < arr1.length) {
			merged.add(arr1[i++]);
		}
		while (j < arr2.length) {
			merged.add(arr2[j++]);
		}
		return merged;
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 5, 8, 13, 19, 27, 32 };
		Integer[] arr2 = { 2, 9, 23, 25, 29, 27, 33, 42 };
		List<Integer> merged = getMergeSortedArray(arr1, arr2);
		System.out.println(merged);
	}
}
