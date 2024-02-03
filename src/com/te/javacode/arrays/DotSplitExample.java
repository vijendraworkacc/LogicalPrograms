package com.te.javacode.arrays;

public class DotSplitExample {
    public static void main(String[] args) {
        String doubleString = "123.456";
        char delimiter = '.'; // Splitting based on dot

        String[] result = doubleString.split(String.valueOf(delimiter));

        for (String part : result) {
            System.out.println(part);
        }
    }
}

