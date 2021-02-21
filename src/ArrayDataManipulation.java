/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 5: Working with Java arrays
Topic: Arrays
Sub-Topic: Data Manipulation
*/

import java.util.Arrays;
import java.util.Collections;

public class ArrayDataManipulation {
    public static void main(String[] args) {
        System.out.println("--- Manipulating data with Arrays static methods");

        // Create array of Integer
        Integer[] intArray = new Integer[10];
        System.out.println("Array values initially: "
                + Arrays.toString(intArray));

        // Fill array with a single value
        Arrays.fill(intArray, 5);
        System.out.println("Array values after fill: "
                + Arrays.toString(intArray));

        // You can fill a partial range with Arrays.fill overloaded method
        int partialFillValue = 9;
        Arrays.fill(intArray, 5, 10, partialFillValue);
        System.out.println("Array values after partial fill: "
                + Arrays.toString(intArray));

        // setAll was introduced in Java 8
        // It uses lambda expressions, but demonstrates sample here
        Arrays.setAll(intArray, (index) -> index + 1);
        System.out.println("Array values after setAll: "
                + Arrays.toString(intArray));

        // You can sort non primitive data type arrays in reverse this way
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println("Array values after reverse sort: "
                + Arrays.toString(intArray));

        // Similar to setAll and parallelSetAll, except this method
        // supports binary operations.
        Arrays.parallelPrefix(intArray, (left, right) -> left + right);
        System.out.println("Array values after parallelPrefix: "
                + Arrays.toString(intArray));

    }//public static void main(String[] args) {
}//public class ArrayDataManipulation { 