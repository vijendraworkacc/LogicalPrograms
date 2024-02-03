package com.te.javacode.arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatingCharacter {

	private static int firstNonRepeatingCharacter(int[] arr) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i : arr) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 5, 6, 7, 4, 0, 9, 7, 9, 1, 10, 11};
		System.out.println(firstNonRepeatingCharacter(arr));
	}
}
