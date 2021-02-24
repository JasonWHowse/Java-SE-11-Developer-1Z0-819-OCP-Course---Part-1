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
    }//public static void main(String[] args) {
}//public class ListDeclaration {