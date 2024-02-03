package com.te.javacode.numbers;

public class FibonachiSeries {
	
	private static void printSeries(int n) {
		int t1 = 0;
		int t2 = 1;
		System.out.print(t1 + " " + t2 + " ");
		for (int i = 3; i <= n; i++) {
			int t3 = t1 + t2;
			System.out.print(t3 + " ");
			t1 = t2;
			t2 = t3;
		}
	}
	
	public static void main(String[] args) {
		printSeries(10);
	}
}	
