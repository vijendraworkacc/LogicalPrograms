package com.te.javacode.arrays;

import java.util.Arrays;

public class TrappingRainwater {
	private static int trappedRainwater(int[] arr) {
		int length = arr.length;
		int currentMax = -1;
		int[] fromLeft = new int[length];
		int[] fromRight = new int[length];
		for (int i = 0; i < length; i++) {
			if (currentMax < arr[i]) {
				currentMax = arr[i];
				fromLeft[i] = currentMax;
			} else {
				fromLeft[i] = currentMax;
			}
		}
		currentMax = -1;
		for (int i = length - 1; i >= 0; i--) {
			if (currentMax < arr[i]) {
				currentMax = arr[i];
				fromRight[i] = currentMax;
			} else {
				fromRight[i] = currentMax;
			}
		}
		Arrays.stream(fromLeft).forEach(System.out::print);
		System.out.println();
		Arrays.stream(fromRight).forEach(System.out::print);
		System.out.println();
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += Math.min(fromLeft[i], fromRight[i]) - arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 4, 0, 1, 3, 2 };
		System.out.println("Trapped Rainwater: " + trappedRainwater(arr));
	}
}
