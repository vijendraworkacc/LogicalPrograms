package com.te.javacode.arrays;

import java.util.Arrays;

public class SortByBits {
	private static Integer sort(Integer[] arr) {
		Arrays.stream(arr)
		.sorted((a, b) -> Integer.bitCount(a) - Integer.bitCount(b))
		.forEach(e -> System.out.print(e + " "));
		
		return Arrays.stream(arr)
				.sorted((a, b) -> Integer.bitCount(a) - Integer.bitCount(b))
				.findFirst()
				.get();
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 34, 2, 5, 78, 9, 6 };
		System.out.println(sort(arr));
	}
}
