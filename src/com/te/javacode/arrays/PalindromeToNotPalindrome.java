package com.te.javacode.arrays;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class PalindromeToNotPalindrome {
	private static String palindromeToNotPalindrome(String str) {
		if (str.length() > 2) {
			Set<Character> characters = new TreeSet<Character>();
			char[] arr = str.toCharArray();
			for (char c : arr) {
				characters.add(c);
			}
			Character first = characters.stream().findFirst().get();
			Character character = characters.stream().sorted(Collections.reverseOrder()).findFirst().get();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == character) {
					arr[i] = first;
					return String.copyValueOf(arr);
				}
			}
		}
		return "Impossible";
	}

	public static void main(String[] args) {
		String str = "aa";
		System.out.println(str + " -> " + palindromeToNotPalindrome(str));
	}
}
