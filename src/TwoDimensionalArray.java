/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 5: Working with Java Arrays
Topic: Arrays
SubTopic: TwoDimensional Array
 */

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void printArray(String arrayName, int[][] inputArray) {
        System.out.println("------------------------------------------");
        System.out.println(arrayName + " Reference: " + inputArray);
        for (int row = 0; row < inputArray.length; row++) {
            printRow(arrayName, inputArray[row], row);
        }//for (int row = 0; row < inputArray.length; row++) {
    }//public static void printArray(String arrayName, int[][] inputArray) {

    public static void printRow(String arrayName, int[] inputArray, int row) {
        System.out.println(arrayName + " : " + inputArray + " : Row "
                + (row + 1) + " :  " + Arrays.toString(inputArray));

    }//public static void printRow(String arrayName, int[] inputArray, int row) {

    public static void main(String[] args) {

        // Create a 2-d array
        int[][] intArray = new int[2][10];

        // Let's see what this looks like using the method we created
        printArray("intArray", intArray);

        // You can also print the 2-d array Using Arrays.deepToString()
        System.out.println("Printing a multi-dimensional array using " +
                "Arrays.deepToString()");
        System.out.println(Arrays.deepToString(intArray));

        // If you use an array initializer, formatting this way
        // helps readability
        int[][] variableCols = {
                {1, 2, 3},
                {5, 6, 7, 8},
                {0, 3, 4, 6},
                {1}
        };
        printArray("variableCols", variableCols);

        // Clone a copy of your 2-d array, but it is a shallow clone.
        int[][] clonedArray = variableCols.clone();
        printArray("clonedArray", (int[][]) clonedArray);

        // Arrays.copyOf works here, but need to cast back to 2-d array
        int[][] copiedCopy = (int[][]) Arrays.copyOf(variableCols,
                variableCols.length);
        printArray("copiedCopy", copiedCopy);

        System.out.println("-------------------------------------------");
        // Comparing our arrays, row 3....
        printRow("variableCols", variableCols[2], 2);
        printRow("copiedCopy", ((int[][]) copiedCopy)[2], 2);
        printRow("clonedArray", ((int[][]) clonedArray)[2], 2);
        System.out.println("-------------------------------------------");
        // We can take our shallow copy and make it 'deep' manually.
        for (int i = 0; i < clonedArray.length; i++) {
            clonedArray[i] = clonedArray[i].clone();  // clone each element
        }
        // Change data on one of our original data points.
        variableCols[2][3] = 10000;

        // Comparing our arrays, row 3....
        printRow("variableCols", variableCols[2], 2);
        printRow("clonedArray", clonedArray[2], 2);
        System.out.println("-------------------------------------------");
    }//public static void main(String[] args) {
}//public class TwoDimensionalArray { 