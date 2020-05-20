
package com.stackoute.genericmethod;

import static com.stackoute.genericmethod.GenericArrayPrinter.printArray;

public class Main {
    public static void main(String[] args) {

        Integer[] numbers = {50, 51, 52, 53, 54};
        System.out.println("Array of Integer");
        printArray(numbers);

        String[] fruits = {"NetBeans", "IntelliJ", "Eclipse"};
        System.out.println("Array of String");
        printArray(fruits);

        Float[] floats = {1.1f, 3.5f};
        System.out.println("Array of Float");
        printArray(floats);
    }

}

