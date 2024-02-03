package com.te.javacode.arrays;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	private static double medianOfTwoSortedArrays(int[] arr1, int[] arr2) {
		int[] arr = mergeSortedArrays(arr1, arr2);
		int len = arr.length;
		if (len % 2 == 0) {
			double mid1 = arr[(len / 2) - 1];
			double mid2 = arr[len / 2];
			return (double) ((mid1 + mid2) / (double) 2);
		}
		return (double) arr[len / 2];
	}

	private static int medianElementOfTwoSortedArrays(int[] arr1, int[] arr2) {
		int[] arr = mergeSortedArrays(arr1, arr2);
		int slow = 0;
		int fast = 0;
		while (fast < arr.length) {
			slow++;
			fast += 2;
		}
		return arr[slow];
	}

	private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		int i = 0, j = 0, k = 0;
		int l1 = arr1.length, l2 = arr2.length;
		int[] mergedArray = new int[l1 + l2];
		while (i < l1 && j < l2) {
			if (arr1[i] < arr2[j]) {
				mergedArray[k++] = arr1[i++];
			} else {
				mergedArray[k++] = arr2[j++];
			}
		}
		while (i < l1) {
			mergedArray[k++] = arr1[i++];
		}
		while (j < l2) {
			mergedArray[k++] = arr2[j++];
		}
		System.out.println(Arrays.toString(mergedArray));
		return mergedArray;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 9, 13, 17, 19, 25, 35, 48 };
		int[] arr2 = { 3, 7, 15, 23, 27, 29, 58 };

		System.out.println(medianElementOfTwoSortedArrays(arr1, arr2));
	}
}
