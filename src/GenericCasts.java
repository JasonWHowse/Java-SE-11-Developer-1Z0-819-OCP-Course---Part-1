/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Utilize polymorphism to cast and call methods
Sub-Topic: Generics and casting
*/

import java.util.ArrayList;
import java.util.List;

public class GenericCasts {

    // Just want a few classes to play with

    static class BaseClass {
        String name = "Base Case";

        public String toString() {
            return getClass().getName();
        }//public String toString() {
    }//static class BaseClass {

    static class NextClass extends BaseClass {
        String name = "Next Best Case";

        public String toString() {
            return getClass().getName() + ": " + name;
        }//public String toString() {

        public static void testIt(List<BaseClass> baseListParameter) {
            System.out.println(baseListParameter);
        }//public static void testIt(List<BaseClass> baseListParameter) {
    }//static class NextClass extends BaseClass {

    public static void main(String[] args) {
        // Raw types

        //  Create ArrayList and assign to ArrayList variable
        ArrayList rawList = new ArrayList();
        // Declare a List variable
        List aList;
        // Assign ArrayList object to List variable:
        aList = rawList;

        // Typed generic lists

        //  Create a typed ArrayList using BaseClass and assign to
        //  ArrayList variable
        ArrayList<BaseClass> baseList = new ArrayList<>();
        // Declare a typed List variable using BaseClass as type
        List<BaseClass> bList;
        // Assign typed ArrayList object to typed List variable
        bList = baseList;

        // Add a NextClass object to the raw ArrayList
        rawList.add(new NextClass());

        // Add a NextClass object to the typed ArrayList
        baseList.add(new NextClass());

        // Print ArrayList and List variables.
        System.out.println("We can use either variable to print the raw ArrayList");
        System.out.println("-- aList = " + aList);
        System.out.println("-- rawList = " + rawList);
        System.out.println("We can use either variable to print the typed ArrayList");
        System.out.println("-- bList = " + bList);
        System.out.println("-- baseList = " + baseList);

//        // Let's add the StringBuilder object to raw list
//        rawList.add(new StringBuilder("Hello"));
//
//        // Let's add the StringBuilder object to typed list
//        baseList.add(new StringBuilder("Hello"));

        // We create variable of NextClass and assign it a new instance
        // NextClass
        NextClass nextClass = new NextClass();

        // We create variable of BaseClass and assign it the nextClass
        // variable - this is a good assignment as we know.  You can
        // assign a more specific typed object to a less specifically
        // typed variable.
        BaseClass baseClass = nextClass;

        // We now create an ArrayList of NextClass and assign it to a
        // variable of ArrayList typed to NextClass.
        ArrayList<NextClass> nextList = new ArrayList<>();
        nextList.add(nextClass);

        // We assign nextList to the raw ArrayList variable
        rawList = nextList;
        // We assign nextList to the raw List variable
        aList = nextList;

//        // We assign nextList to the typed ArrayList of BaseClass variable
//        baseList = nextList;
//        // We assign nextList to the typed List of BaseClass variable
//        bList = nextList;

        // Execute testIt method with List<BaseClass>
        NextClass.testIt(bList);

        // Execute testIt method with ArrayList<BaseClass>
        NextClass.testIt(baseList);

        // Execute testIt method with ArrayList<NextClass>
//        testIt(nextList);

//        // Casting doesn't fix it
//        baseList = ( ArrayList<BaseClass> )  nextList;
//
//        ArrayList<NextClass> anotherTest = ( ArrayList<NextClass> ) rawList;
//
//        ArrayList<NextClass> anotherTest = ( ArrayList<NextClass> ) baseList;


        // No cast required, retrieving data from ArrayList, typed with
        // NextClass
        NextClass next = nextList.get(0);
        System.out.println("next here is " + next);

        // No cast required, retrieving data from ArrayList, typed with
        // BaseClass
        BaseClass base = baseList.get(0);
        System.out.println("base here is " + base);
        // need a cast still if retrieving more specifically typed object
        next = (NextClass) baseList.get(0);
        System.out.println("next here is " + next);

        // Cast required, retrieving data from raw ArrayList
        next = (NextClass) rawList.get(0);
        System.out.println("next here is " + next);
    }//public static void main(String[] args) {
}//public class GenericCasts {