package com.te.javacode.arrays;

public class RightRotate {

	private static void rightRotateByK(Integer[] arr, int K) {
		int n = arr.length;
		K = K % n; // Ensure K is within array bounds
		for (int i = 0; i < n; i++) {
			int newIndex = (i + K) % n; // Calculate new index
			// Ensure swapping only happens for elements not yet in their final positions
			if (newIndex > i) {
				int temp = arr[i];
				arr[i] = arr[newIndex];
				arr[newIndex] = temp;
			}
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5 , 6, 7, 8, 9, 10};
		rightRotateByK(arr, 2);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
