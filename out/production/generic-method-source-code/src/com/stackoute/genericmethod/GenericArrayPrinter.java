package com.stackoute.genericmethod;

public class GenericArrayPrinter {
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
    }
}
