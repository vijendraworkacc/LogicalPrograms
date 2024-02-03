package com.te.javacode.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SmallestSubarraySum {
	private static int findSum(int[] arr, int target) {
		List<Integer> integers = new ArrayList<Integer>();
		int smallest = Integer.MAX_VALUE;		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				count++;
				sum += arr[j];
				if (sum >= target) {
					if (count < smallest) {
						smallest = count;
						integers.add(smallest);
						break;
					}
				}
			}
		}
		return integers.stream().min(Comparator.naturalOrder()).get();
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 2, 4, 3 };
		System.out.println("Smallest subarray length: " + findSum(arr, 7));
	}
}
