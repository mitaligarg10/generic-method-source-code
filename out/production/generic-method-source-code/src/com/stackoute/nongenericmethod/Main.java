package com.stackoute.nongenericmethod;

import static com.stackoute.nongenericmethod.ArrayPrinter.printArray;
import static com.stackoute.nongenericmethod.ArrayPrinter.printArrayOne;

public class Main {
    public static void main(String[] args) {
        int intArray[] = {50, 51, 52, 53, 54};
        printArray(intArray);

        String stringArray[] = {"NetBeans", "IntelliJ", "Eclipse"};
        printArrayOne(stringArray);
    }

}
