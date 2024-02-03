package com.te.javacode.arrays;

public class BinarySearch {

	private static int binarySearch(int[] arr, int target, int left, int right) {
		if (left <= right) {
			int mid = left + (right - left) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (target < arr[mid]) {
				return binarySearch(arr, target, left, mid - 1);
			} else {
				return binarySearch(arr, target, mid + 1, right);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(binarySearch(arr, 8, 0, arr.length - 1));
	}
}
