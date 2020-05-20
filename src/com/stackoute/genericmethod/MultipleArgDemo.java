package com.stackoute.genericmethod;

public class MultipleArgDemo {
    public static <T extends Comparable<T>> T findLowestObject(T x, T y, T z) {
        T lowest = x;

        if (y.compareTo(lowest) < 0) {
            lowest = y;
        }

        if (z.compareTo(lowest) < 0) {
            lowest = z;
        }
        return lowest;
    }

    public static void main(String args[]) {
        System.out.println("Among 3, 4, 5 Lowest integer value is: " + findLowestObject(3, 4, 5));

        System.out.println("Among 6.6, 8.8, 7.7 Lowest double value is: " + findLowestObject(6.6, 8.8, 7.7));

        System.out.printf("Among NetBeans, IntelliJ, Eclipse Lowest string value is: " + findLowestObject("NetBeans", "IntelliJ", "Eclipse"));
    }
}
