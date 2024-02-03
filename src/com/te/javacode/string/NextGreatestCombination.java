package com.te.javacode.string;

import java.util.Set;
import java.util.TreeSet;

public class NextGreatestCombination {

	private static Set<Integer> numbers = new TreeSet<Integer>();

	private static void combination(String prefix, String remaining) {
		if (prefix != "")
			numbers.add(Integer.parseInt(prefix));
		int length = remaining.length();
		for (int i = 0; i < length; i++) {
			combination(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
		}
	}

	public static void main(String[] args) {
		int num = 123;
		String str = String.valueOf(num);
		combination("", str);
		for (Integer integer : numbers) {
			if (integer > num) {
				System.out.println("Next greatest: " + integer);
				break;
			}
		}
	}
}
