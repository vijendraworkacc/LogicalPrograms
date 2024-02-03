package com.te.javacode.arrays;

public class LeftRotate {

	private static void leftRotateByK(Integer[] arr, int K) {
		int n = arr.length;
		K = K % n;
		for (int i = 0; i < n; i++) {
			int newIndex = (i + n - K) % n;
			int temp = arr[i];
			arr[i] = arr[newIndex];
			arr[newIndex] = temp;
		}
	}

	private static void leftRotateByK_(Integer[] arr, int K) {
		int length = arr.length;
		for (int i = 0; i < K; i++) {
			int first = arr[0];
			for (int j = 0; j < length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[length - 1] = first;
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		leftRotateByK_(arr, 2);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
