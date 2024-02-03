package com.te.javacode.string;

public class CountCharacterInSequesnce {
	
	private static void countCharacterInSequesnce(String str) {
		char[] arr = (str + " ").toCharArray();
		char currentChar = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (currentChar == arr[i]) {
				count++;
			} else {
				System.out.print(String.valueOf(currentChar) + count);
				currentChar = arr[i];
				count = 1;
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "abcddd";
		countCharacterInSequesnce(str);
	}
}
