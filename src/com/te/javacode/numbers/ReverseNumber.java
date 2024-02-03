package com.te.javacode.numbers;

public class ReverseNumber {
	
	private static int reverseNumber(int num) {
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		int num = 1234;
		System.out.println(num);
		System.out.println(reverseNumber(num));
	}
}
