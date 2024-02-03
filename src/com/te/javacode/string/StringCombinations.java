package com.te.javacode.string;

public class StringCombinations {
	public static void main(String[] args) {
        String input = "abcedfg";
        generateCombinations("", input);
    }

    private static void generateCombinations(String prefix, String remaining) {
        System.out.println(prefix);

        for (int i = 0; i < remaining.length(); i++) {
            generateCombinations(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
        }
    }
}
