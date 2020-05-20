package com.stackoute.nongenericmethod;

public class ArrayPrinter {

    public static void printArray(int[] intArray) {
        for (int element : intArray) {
            System.out.println("Array of Integer: " + element);
        }
    }

    public static void printArrayOne(String[] stringArray) {
        for (String element : stringArray) {
            System.out.println("Array of String: " + element);
        }
    }
}
