/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 5: Working with Java arrays
Topic: Arrays
Sub-Topic: Search methods
*/

import java.util.Arrays;
import java.util.List;

public class ArraySearch {
    public static void main(String[] args) {
        // Set up some array data we want to compare.
        String[] firstString = {
                "abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz"
        };
        String[] firstStringUnsortedDuplicates = {
                "jkl", "mno", "pqr", "stu", "vwx",
                "yz", "jkl", "abc", "def", "ghi"
        };
        String[] partialFirstString = {"abc", "def", "ghi", "jkl", "mno"};

        // Create Lists from the arrays to test List search methods
        List firstList = List.of(firstString);
        List secondList = Arrays.asList(firstStringUnsortedDuplicates);

        System.out.println("---------- Arrays binarySearch  ----------");
        // binary search on array, look for "jkl" which is in array
        String searchString = "jkl";
        System.out.println("Arrays.binarySearch(firstString,\"jkl\") = "
                + Arrays.binarySearch(firstString, "jkl"));

        // binary search, look for "aaa",  which is not in array
        System.out.println("Arrays.binarySearch(firstString,\"aaa\") = "
                + Arrays.binarySearch(firstString, "aaa"));

        //  binary search, look for "jkl" of which there are two elements
        System.out.println("Arrays.binarySearch(firstStringUnsortedDuplicates,\"jkl\") = "
                + Arrays.binarySearch(firstStringUnsortedDuplicates, "jkl"));

        //  binary search on unsorted array, for "abc" which is in array
        System.out.println("Arrays.binarySearch(firstStringUnsortedDuplicates,\"abc\") = "
                + Arrays.binarySearch(firstStringUnsortedDuplicates, "abc"));

        System.out.println("\n---------- Arrays mismatch  ----------");
        // mismatch returns the non-matching index where the prefix ends
        System.out.println("Arrays.mismatch(firstString,partialFirstString) = "
                + Arrays.mismatch(firstString, partialFirstString));

        // Try another example...
        System.out.println("Arrays.mismatch(firstStringUnsortedDuplicates," +
                " new String[]{\"jkl\",\"mno\"}) = "
                + Arrays.mismatch(firstStringUnsortedDuplicates, new String[]{"jkl", "mno"}));

        System.out.println("\n-------------- List methods  -------------------");
        // Does array contain "def"?
        System.out.println("firstList.contains(\"def\") =  "
                + firstList.contains("def"));

        // Does array contain elements in partialString?
        System.out.println("firstList.containsAll(Arrays.asList(partialFirstString)) =  "
                + firstList.containsAll(Arrays.asList(partialFirstString)));

        // create a second list not in same order
        String[] anotherUnsortedSet = {"jkl", "def", "abc", "ghi", "mno"};
        System.out.println("firstList.containsAll(Arrays.asList(anotherUnsortedSet)) =  "
                + firstList.containsAll(Arrays.asList(anotherUnsortedSet)));

        // Use indexOf to get first matching element
        System.out.println("secondList.indexOf(\"jkl\") =  "
                + secondList.indexOf("jkl"));

        // Use lastIndexOf to to get last matching element
        System.out.println("secondList.lastIndexOf(\"jkl\") =  "
                + secondList.lastIndexOf("jkl"));
    }//public static void main(String[] args) {
}//public class ArraySearch { 