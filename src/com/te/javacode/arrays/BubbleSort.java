package com.te.javacode.arrays;

public class BubbleSort {
	private static void bubbleSort(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 4, 1, 3, 2, 6, 8, 7, 9 };
		bubbleSort(arr);
		for (Integer integer : arr) {
			System.out.print(integer + " ");
		}
	}
}
