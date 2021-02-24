/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Declare and Use List and ArrayList instances;
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExamples {
    public static void main(String[] args) {

        ArrayList<String> firstArray = new ArrayList(List.of("ABC", "DEF", "GHI", "JKL", "MNO"));
        ArrayList<String> secondArray = new ArrayList(List.of("ABC", "DEF", "GHI", "JKL", "MNO"));
        ArrayList<String> thirdArray = new ArrayList<>();

        System.out.println("firstArray = "+firstArray.toString());
        System.out.println("secondArray = "+secondArray.toString());
        System.out.println("thirdArray = "+thirdArray.toString());
        // isEmpty() returns true if there are no elements in array
        System.out.println("thirdArray.isEmpty() = " + thirdArray.isEmpty());

        // .equals() returns true if element values are equal
        System.out.println("firstArray.equals(secondArray)) = "
                + (firstArray.equals(secondArray)));
        System.out.println("firstArray.equals(thirdArray)) = "
                + (firstArray.equals(thirdArray)));

        // .contains() returns true if element values are equal
        System.out.println("firstArray.contains(\"DEF\")) = "
                + (firstArray.contains("DEF")));
        System.out.println("firstArray.contains(\"ZZZ\")) = "
                + (firstArray.contains("ZZZ")));

        // .containsAll() must find all elements in the list,
        // order does not matter
        System.out.println("firstArray.containsAll(\"ABC,DEF\")) = "
                + (firstArray.containsAll(List.of("ABC", "DEF"))));

        System.out.println("firstArray.containsAll(\"DEF,ABC\")) = "
                + (firstArray.containsAll(List.of("DEF", "ABC"))));

        System.out.println("firstArray.containsAll(\"ZZZ,ABC\")) = "
                + (firstArray.containsAll(List.of("ZZZ", "ABC"))));

        // .indexOf returns -1 if element not found or the
        // index of element if found
        System.out.println("firstArray.indexOf(\"DEF\")) = "
                + (firstArray.indexOf("DEF")));
        System.out.println("firstArray.indexOf(\"ZZZ\")) = "
                + (firstArray.indexOf("ZZZ")));

        // .lastIndexOf returns -1 if element not found or the
        // index of element if found
        System.out.println("firstArray.lastIndexOf(\"DEF\")) = "
                + (firstArray.lastIndexOf("DEF")));
        System.out.println("firstArray.lastIndexOf(\"ZZZ\")) = "
                + (firstArray.lastIndexOf("ZZZ")));

        // sublist returns a reduced list, using starting index,
        // and ending index
        System.out.println("firstArray.subList(2,4)) = "
                + (firstArray.subList(2, 4)));

        Iterator forwardIt = firstArray.iterator();
        while (forwardIt.hasNext()) {
            System.out.print(forwardIt.next() + " ");
        }//while (forwardIt.hasNext()) {

        // The ListIterator allows you to specify a starting index
        ListIterator traverseIt = firstArray.listIterator(2);
        if (traverseIt.hasNext())
            System.out.println("\ntraverseIt.next() = " + traverseIt.next());

        // Reset ListIterator for example
        traverseIt = firstArray.listIterator(2);
        if (traverseIt.hasPrevious()) {
            System.out.println("traverseIt.previous() = " + traverseIt.previous());
        }//if (traverseIt.hasPrevious()) {
    }//public static void main(String[] args) {
}//public class ArrayListExamples {