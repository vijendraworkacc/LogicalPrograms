package com.te.javacode.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class ElementFrequency {

	private static Map<Integer, Integer> frequencyMap(int[] arr) {
		Map<Integer, Integer> intFrequencyMap = new LinkedHashMap<Integer, Integer>();
		for (int i : arr) {
			if (intFrequencyMap.containsKey(i)) {
				intFrequencyMap.put(i, intFrequencyMap.get(i) + 1);
			} else {
				intFrequencyMap.put(i, 1);
			}
		}
		return intFrequencyMap;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 3, 4, 1, 6, 7, 9, 0, 9, 7, 9 };
		System.out.println(frequencyMap(arr));
		
	}
}
