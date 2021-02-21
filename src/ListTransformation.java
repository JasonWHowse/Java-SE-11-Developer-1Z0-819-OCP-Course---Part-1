/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 5: Working with Java arrays
Topic: Arrays
Sub-Topic: Using List transformation methods
*/

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTransformation {
    public static void main(String[] args) {

        // Create a new Integer array
        Integer[] integerArray = new Integer[10];

        // Set values to 1 - 10
        Arrays.setAll(integerArray, (index) -> index + 1);

        System.out.println("integerArray values = " +
                Arrays.toString(integerArray));

        List anotherList = List.of(integerArray);

        // Create a subList of a list
        List shortList = anotherList.subList(3, 7);
        System.out.println("shortList values : " + shortList.toString());

        // And now go from list to array...
        Integer[] repeatedArray = new Integer[10];
        anotherList.toArray(repeatedArray);
        System.out.println("array created from toArray method : " +
                Arrays.toString(repeatedArray));

        System.out.println("------  iterator tests --------");
        // Iterator allows forward processing of list elements
        System.out.println("loop through anotherList.iterator() values...");
        for (Iterator it = anotherList.iterator(); it.hasNext(); ) {
            System.out.print(it.next());
        }

        // ListIterator allows backwards and forwards processing
        // of list elements
        System.out.println("\nloop through anotherList.listIterator() values...");
        ListIterator lit = anotherList.listIterator();

        for (int i = 0; lit.hasNext(); i++) {
            System.out.print(lit.next());
            if (i == 4) {
                System.out.println("\nreverse direction");
                for (; lit.hasPrevious(); ) {
                    System.out.print(lit.previous());
                }
                break;
            }
        }
    }//public static void main(String[] args) {
}//public class ListTransformation { 