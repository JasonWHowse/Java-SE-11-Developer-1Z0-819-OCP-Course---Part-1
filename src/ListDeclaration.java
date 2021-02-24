/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Declare and Use List and ArrayList instances;
Sub-Topic:  Declaration Examples
*/

import java.util.ArrayList;
import java.util.List;

public class ListDeclaration {
    public static void main(String[] args) {

        // List variable declarations
        List l;
        List<Integer> intList;
        List<ArrayList> arrayList;

        // ArrayList variable declarations
        ArrayList a;
        ArrayList<String> stringArray;
        ArrayList<Integer> integerArray;

        // Instantiation of ArrayList objects
        // Initialize a non-typed ArrayList using no args constructor
        a = new ArrayList();

        // Initialize the String-typed ArrayList using the int argument
        // which sets the initial capacity of the ArrayList
        stringArray = new ArrayList<String>(10);

        // Initialize the Integer-typed ArrayList using the Collections
        // parameter which passes values to the ArrayList
        integerArray = new ArrayList<Integer>(List.of(10, 20, 30));

        // You can leave the type out of the right hand set of <>
        ArrayList<String> abc = new ArrayList<>();

        // This generates a warning but compiles
        ArrayList<String> def = new ArrayList();

        // You cannot create List object but you can set objects that
        // implement List to a List variable
        l = a;
        intList = integerArray;

        // add some data
        for (int i = 0; i < 5; i++) {
            // adds data at end of list...
            stringArray.add("String_" + (i + 1));
            integerArray.add(i + 1);
        }//for (int i = 0; i < 5; i++) {
        System.out.println(stringArray);
        System.out.println(integerArray);

        // add some data at certain index
        for (int i = 0; i < 5; i++) {
            // adds data at end of list...
            stringArray.add(1, "String_" + (i + 1));
            integerArray.add(1, i + 1);
        }//for (int i = 0; i < 5; i++) {
        System.out.println(stringArray);
        System.out.println(integerArray);

        // addAll adds a collection of data, this call appends data to
        // end of list
        integerArray.addAll(List.of(15, 25, 30));
        System.out.println(integerArray);

        // addAll adds a collection of data, this call inserts all
        // elements of the list starting at the index, moving existing
        // elements to a higher index location
        integerArray.addAll(1, List.of(150, 250, 300));
        System.out.println(integerArray);

        // Remove a single element, and only the first match, using
        // remove method
        stringArray.remove("String_5");
        System.out.println("stringArray after removing one element, String_5 "
                + stringArray.toString());

        // Remove a matching element
        stringArray.removeIf(s -> s.contains("_2"));
        System.out.println("stringArray after removing any elements that contain '_2' "
                + stringArray.toString());

        // Replaces values in the array using a lambda expression
        stringArray.replaceAll((s) -> s.replace("String_", "Test_"));
        System.out.println("stringArray after replaceAll  "
                + stringArray.toString());

        // Put them back the way they were...
        stringArray.replaceAll((s) -> s.replace("Test_", "String_"));

        // Remove a set of elements using removeAll method
        // Note that the list you pass removeAll may contain elements
        // that are not in stringArray.  It will remove matched elements
        stringArray.removeAll(
                List.of("String_1", "String_3", "String_10"));
        System.out.println("stringArray after removing several elements "
                + stringArray.toString());

        // Keep only a defined set of elements using ArrayList.retainAll
        stringArray.retainAll(List.of("String_4"));
        System.out.println("stringArray after retaining only String_4 "
                + stringArray.toString());

        // Print String objects in the list using forEach
        stringArray.forEach((s) -> System.out.println(s));
    }//public static void main(String[] args) {
}//public class ListDeclaration {