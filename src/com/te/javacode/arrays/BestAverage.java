package com.te.javacode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BestAverage {
	public static void main(String[] args) {
		String[][] arr = { { "Rachel", "100" }, { "Rachel", "50" }, { "Monica", "95" }, { "Phoebe", "60" },
				{ "Phoebe", "80" } };
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		for (String[] strings : arr) {
			if (!map.containsKey(strings[0])) {
				List<Integer> integers = new ArrayList<Integer>();
				integers.add(Integer.parseInt(strings[1]));
				map.put(strings[0], integers);
			} else {
				map.get(strings[0]).add(Integer.parseInt(strings[1]));
			}
		}
		System.out.println(map);
		int best = 0;
		for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
			int value_ = entry.getValue().stream().collect(Collectors.averagingInt(value -> value)).intValue();
			if (best < value_) {
				best = value_;
			}
		}
		System.out.println("Best Average: " + best);
		
		
		
	}
}
