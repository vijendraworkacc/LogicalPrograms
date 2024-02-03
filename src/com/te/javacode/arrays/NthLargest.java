package com.te.javacode.arrays;

import java.util.Arrays;
import java.util.Collections;

public class NthLargest {

	private static Integer thirdLargest(Integer[] integers) {
		return Arrays.stream(integers).sorted(Collections.reverseOrder()).skip(2).findFirst().get();
	}
	
	private static Integer secoundLargest(Integer[] integers) {
		return Arrays.stream(integers).sorted(Collections.reverseOrder()).skip(1).findFirst().get();
	}
	
	private static Integer largest(Integer[] integers) {
		return Arrays.stream(integers).max((a, b) -> a - b).get();
	}

	public static void main(String[] args) {
		Integer[] integers = { 8, 12, 3, 4, 13, 88, 90, 56 };
		System.out.println("Largest: " + largest(integers));
		System.out.println("Secound Largest: " + secoundLargest(integers));
		System.out.println("Third Largest: " + thirdLargest(integers));
	}
}
