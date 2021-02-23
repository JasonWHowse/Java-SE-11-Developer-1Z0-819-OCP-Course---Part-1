/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Utilize polymorphism to cast and call methods
Sub-Topic: Array casting and generics
*/

import java.util.Arrays;

public class CastExtras {
    // Just want a few classes to play with

    static class BaseClass {
        String name = "Base Case";

        public String toString() {
            return getClass().getName();
        }//public String toString() {
    }//static class BaseClass {

    static class NextClass extends BaseClass {
        String name = "Next Best Case";
    }//static class NextClass extends BaseClass {

    // main method, we'll test out some more casting examples
    public static void main(String[] args) {

        // Let's create the most generic of arrays
        Object[] myObjectArray = new Object[10];

        // This fills an Object array with Objects that are NextClass
        // It does not change the type of array to NextClass[]
        Arrays.fill(myObjectArray, new NextClass());

        // You can put any type of Object in there
        myObjectArray[5] = new StringBuilder("test");

        System.out.println(myObjectArray.getClass().getTypeName());
        System.out.println(Arrays.toString(myObjectArray));
        // We are going to loop through `our array and cast each
        // object first to a NextClass to print the name attribute on
        // NextClass, and then we cast to BaseClass to print the
        // name attribute on the Base`Class

        try {
            for (Object o : myObjectArray) {
                // We can cast to most specific class
                NextClass n = (NextClass) o;
                System.out.println(n.name);

                // We can cast to less specific class if we prefer more
                // generic name
                BaseClass b = (BaseClass) o;
                System.out.println(b.name);
            }//for (Object o : myObjectArray) {
        } catch (Exception e) {//try {
            // Not to mention any object might be in your array...
            e.printStackTrace(System.out);
        }//catch (Exception e) {
        // Next we'll create an array of mixed types, using the common
        // denominator BaseClass
        BaseClass mixedArray[] = new BaseClass[6];
        // Fill half with NextClass
        Arrays.fill(mixedArray,0, 3, new NextClass());
        // Fill half with BaseClass
        Arrays.fill(mixedArray,3, 6, new BaseClass());

        System.out.println(Arrays.toString(mixedArray));
        for (BaseClass n : mixedArray) {
            // We cast if we want NextClass's more specific name...
            System.out.println(n + ":" +
                    // ternary conditional operator uses instanceof
                    ((n instanceof NextClass) ? ((NextClass) n).name : n.name)
            );
        }//for (BaseClass n : mixedArray) {

        // Compiler let's you get away with it, it's feasible that
        // that mixedArray could be populated with objects of its subtype only
        // but JVM won't allow it
//        NextClass[] nextArray = (NextClass[]) mixedArray;

        // Let's actually fill it with just NextClass objects .
//        Arrays.fill(mixedArray, new NextClass());
//        // JVM still doesn't allow it
//        NextClass[] nextArray2 = (NextClass[]) mixedArray;

    }//public static void main(String[] args) {
}//public class CastExtras {