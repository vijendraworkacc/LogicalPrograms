package com.te.javacode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestNonRepeatingSequence {
	private static String longestNonRepeatingSequence(String string) {
		Set<Character> characters = new HashSet<Character>();
		List<String> results = new ArrayList<String>();
		int length = string.length();
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				if (!characters.add(string.charAt(j))) {
					characters = new HashSet<Character>();
					results.add(string.substring(i, j));
					break;
				}
			}
		}
		return results.stream().max((s1, s2) -> s1.length() - s2.length()).get();
	}

	public static void main(String[] args) {
		String string = "drfghiijjkkkaxcrfghkiop";
		System.out.println(longestNonRepeatingSequence(string));
	}
}
