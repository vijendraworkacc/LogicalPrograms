package com.te.javacode.numbers;

import java.util.Arrays;

public class MistoryOfRepeatingDecimal {

	private static double getResult(double a, double b) {
		if (a < 0 || b < 0 || a == 0 || b == 0 || (a / b) == 0) {
			return 0;
		}
		return a / b;
	}

	private static void printResult(double a, double b) {
		double result = getResult(a, b);
		String[] split = String.valueOf(result + " ").split("\\.");
		System.out.print(split[0] + ".");
		char[] arr = split[1].toCharArray();
		char current = arr[0];
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (current == arr[i]) {
				count++;
				if (count > 2) {
					System.out.println("(" + current + ")");
					return;
				}
			} else {
				System.out.print(current);
				current = arr[i];
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printResult(1, 3);
		printResult(1, 4);
		printResult(1, 6);
		printResult(1, 7);
		printResult(1, 8);
		printResult(1, 9);
	}
}
