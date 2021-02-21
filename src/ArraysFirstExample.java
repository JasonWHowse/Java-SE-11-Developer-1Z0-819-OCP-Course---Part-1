/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 5: Working with Java Arrays
Topic:  Single Dimensional Array
 
*/

import java.util.Arrays;

public class ArraysFirstExample {
    public static void main(String[] args) {
        // Create two arrays, one of Integer, one of int

        // elements initialized to null
        Integer[] integerArray = new Integer[5];

        // elements initialized to 0
        int[] intArray = new int[5];

        // Arrays.toString() prints elements as comma delimited String
        System.out.println("---------- Default Values -----------");
        System.out.println("intArray = "
                + Arrays.toString(intArray));
        System.out.println("integerArray ="
                + Arrays.toString(integerArray));

        // loop condition uses length attribute of one of the arrays.
        for (int i = 0; i < intArray.length; i++) {

            // Set data on arrays, autoboxing occurs for integerArray
            integerArray[i] = intArray[i] = (i + 1);
        }//for (int i = 0; i < intArray.length; i++) {
        System.out.println("\n--------- Values after the Loop ----------");
        System.out.println("intArray = "
                + Arrays.toString(intArray));
        System.out.println("integerArray ="
                + Arrays.toString(integerArray));

        // Access a single element in array
        intArray[2] = 10;
        integerArray[0] = 99;

        System.out.println("\n---------- Final Values -----------");

        // Arrays.toString() prints elements as comma delimited String
        System.out.println("intArray = "
                + Arrays.toString(intArray));
        System.out.println("integerArray ="
                + Arrays.toString(integerArray));

        // Create new int[] variable reference and assign it intArray
        int[] intArray2 = intArray;

        // Create new Integer[] variable reference and assign it intArray
        Integer[] integerArray2 = integerArray;

        System.out.println("\n---------- Final Values -----------");

        // Arrays.toString() prints elements as comma delimited String
        System.out.println("intArray = "
                + Arrays.toString(intArray));
        System.out.println("integerArray ="
                + Arrays.toString(integerArray));

        System.out.println("\n---------- Print Arrays -----------");

        // Printing the array references confirm that these variables
        // reference the same set of elements
        System.out.println("intArray = " + intArray);
        System.out.println("intArray2 = " + intArray2);
        System.out.println("integerArray = " + integerArray);
        System.out.println("integerArray2 = " + integerArray2);

        // Make a change to data on first array references
        integerArray[0] = 55;
        intArray[0] = 66;

        // Make a change to data on second array references
        integerArray2[1] = 77;
        intArray2[1] = 88;

        System.out.println("\n-------- Print Array Values ---------");

        // You can see both references show the data changes
        System.out.println("integerArray = " +
                Arrays.toString(integerArray));
        System.out.println("integerArray2 = " +
                Arrays.toString(integerArray2));
        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("intArray2 = " + Arrays.toString(intArray2));
    }//public static void main(String[] args) {
}//public class ArraysFirstExample { 