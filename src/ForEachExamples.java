/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10:  Section 10: Programming Abstractly Through Interfaces
Topic: Lambda Expressions
Sub-Topic: Using ArrayLists with Lambda Expressions
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ForEachExamples {
    // We create a method that will be used to set values
    // in a String array.  The parameter is the array index.
    // A_TEST_1, B_TEST_2 etc.
    public static String setValue(int indx) {

        int intA = 65;
        int multiplier = indx / 26;
        int cntr = indx - (multiplier * 26);
        return (char) (cntr + intA) + "_TEST_" + (indx + 1);
    }//public static String setValue(int indx) {

    // Main method creates array, calls setValue method with
    // Arrays.setAll method
    public static void main(String[] args) {

        // Initialize a String array
        String[] stringArray = new String[50];

        // We use a lambda expression method reference to set the data
        // in the array.
        // The method reference replaced an expression that would have been:
        //   (s) -> setValue(s)    was replaced with   ForEachExamples::setValue
        Arrays.<String>setAll(stringArray, ForEachExamples::setValue);

        // Make an ArrayList out of the array
        ArrayList<String> alist = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(alist + "\n");

        // We'll use the stream() method to manipulate the list
        alist.stream()
                .filter(  //Only want values that start with A or B
                        (Predicate<String>)
                                (s) -> s.startsWith("A") || s.startsWith("B"))

                // method reference used in place of a lambda expression that
                // would look like (s) -> System.out.println(s);
                .forEach(System.out::println);

        // Let's sort by the suffix number descending, using a Comparable interface
        alist.sort((a, b) -> {
            return Integer.valueOf(b.split("_")[2]).compareTo(
                    Integer.valueOf(a.split("_")[2]));
        });//alist.sort((a, b) -> {
        System.out.println("\n" + alist);

        // Let's sort reverse order
        // Code below is same as:
        // alist.sort(Comparator.reverseOrder());
        alist.sort((a, b) -> b.compareTo(a));
        System.out.println("\n" + alist);
    }//public static void main(String[] args) {
}//public class ForEachExamples {