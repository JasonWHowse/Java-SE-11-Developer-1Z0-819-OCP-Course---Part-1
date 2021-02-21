/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 5: Working with Java arrays
Topic: Arrays
Sub-Topic: Transformation Methods
*/

import java.util.Arrays;

public class ArrayTransformation {
    public static void main(String[] args) {

        System.out.println("-----------Using Arrays.copyOf ----------");

        // Create an array of Integer
        Integer[] originalArray = new Integer[10];

        // Initialize values to 1 - 10
        Arrays.setAll(originalArray, (index) -> index + 1);
        System.out.println("integerArray values = "
                + Arrays.toString(originalArray));

        // Create Copy of array, same size
        Integer[] copiedArray =
                Arrays.copyOf(originalArray, originalArray.length);

        System.out.println("copiedArray values = "
                + Arrays.toString(copiedArray));

        // Create Copy of of an array, trimmed to specified size
        Integer[] trimmedArray = Arrays.copyOf(originalArray, 7);

        // Copy array to larger array, extra elements get default values
        Integer[] widenedArray = Arrays.copyOf(originalArray, 15);

        System.out.println("trimmedArray values = "
                + Arrays.toString(trimmedArray));

        System.out.println("widenedArray values = "
                + Arrays.toString(widenedArray));

        // Create Copy of defined portion of Array
        Integer[] croppedArray = Arrays.copyOfRange(originalArray, 2, 6);
        System.out.println("croppedArray values = "
                + Arrays.toString(croppedArray));

        croppedArray[0] = 5;
        System.out.println("croppedArray values after a change = "
                + Arrays.toString(croppedArray));

    }//public static void main(String[] args) {
}//public class ArrayTransformation { 