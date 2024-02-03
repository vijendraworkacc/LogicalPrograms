package com.te.javacode.string;

public class ConsecutiveNumSumEqualsNum {
	
	private static void consecutiveNumSumEqualsNum(int num) {
		int start = 1;
		int end = 1;
		int sum = 0;
		while (start <= num/2) {
			if (sum == num) {
				System.out.println("Found");
				for (int i = start; i < end; i++) {
					System.out.print(i + " ");
				}
				return;
			} else {
				if (sum < num) {
					sum += end;
					end++;
				} else {
					sum -= start;
					start++;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int num = 50;
		consecutiveNumSumEqualsNum(num);
	}
}
