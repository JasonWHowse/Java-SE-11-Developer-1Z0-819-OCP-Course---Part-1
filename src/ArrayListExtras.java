/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Declare and Use List and ArrayList instances;
Sub-Topic:  ArrayList review
*/

import java.util.ArrayList;
import java.util.List;

public class ArrayListExtras {
    public static class BaseClass {
        private String name;

        BaseClass(String name) {
            this.name = name;
        }//BaseClass(String name) {

        public String toString() {
            return name;
        }//public String toString() {
        public void setName(String name) {
            this.name = name;
        }//public void setName(String name) {
    }//public static class BaseClass {

    public static void main(String[] args) {
        ArrayList<BaseClass> typedList = new ArrayList<>();

        ArrayList rawList = new ArrayList();

        // add without an index, adds element to end of list
        typedList.add(new BaseClass("abc"));

        // add with an index, adds element at the index
        typedList.add(0, new BaseClass("bcd"));
        typedList.add(0, new BaseClass("cde"));

        // Add elements to rawList, note that we can access all
        // elements in typedList as a BaseClass
        for (BaseClass b : typedList) {
            // We'll make copies of the BaseClass objects and add
            rawList.add(0, new BaseClass(b.toString()));
        }//for (BaseClass b : typedList) {
        System.out.println("typedList = " + typedList);
        System.out.println("rawList = " + rawList);

        // Can do this in a typed list without casting.
        // setName() is method on BaseClass
        typedList.get(2).setName("ccc");

        // Trying same thing on object from raw ArrayList is a bit uglier
        ((BaseClass) (rawList.get(0))).setName("aaa");

        // You can add an element at an index that is one larger than
        // the # of elements
        typedList.add(typedList.size(), new BaseClass("def"));

        System.out.println("typedList = " + typedList);
        System.out.println("rawList = " + rawList);

        // You can add an element at an index that is one larger than
        // the # of elements
        typedList.add(typedList.size(), new BaseClass("def"));

        // You cannot set an element at an index that is one larger than
        // the # of elements
//        typedList.set(typedList.size(), new BaseClass("def"));
//        typedList.add(typedList.size()+1, new BaseClass("def"));

        System.out.println("typedList = " + typedList);
        System.out.println("rawList = " + rawList);
        // Next, we create a typed List which we'll try to add to our
        // ArrayLists
        List<BaseClass> typedSubList = List.of(new BaseClass("efg"),
                new BaseClass("fgh"),
                new BaseClass("hij"));

        // You can add a collection at an index that is one larger than
        // the # of elements
        typedList.addAll(typedList.size(), typedSubList);

        // Typed ArrayList catches mistakes at compile time.. Maybe you
        // forgot that set does not mean setAll....
//        typedList.set(0, typedSubList);
        rawList.set(0, typedSubList);

        System.out.println("typedList = " + typedList);
        System.out.println("rawList = " + rawList);

        ArrayList<BaseClass> newBaseList = new ArrayList<>();
        newBaseList.add(0, new BaseClass("one"));

        ArrayList<BaseClass> newBaseListWithCapacity = new ArrayList<>(10);
        newBaseListWithCapacity.add(0, new BaseClass("one"));

        ArrayList<BaseClass> newBaseListWithSomeElements = new ArrayList<>(
                List.of(new BaseClass("one"), new BaseClass("two")));
        newBaseListWithSomeElements.add(2, new BaseClass("three"));

        // sublist can return a typed List if you specify it.
        List<BaseClass> typedSublist = typedList.subList(0, 2);
        typedSublist.get(0).setName("ABC");

        // or alternatively sublist returns a rawlist
        List rawSublist = typedList.subList(0, 2);
        // Is it really a raw list?  Test it...
//        rawSublist.get(0).setName("ABC");
    }//public static void main(String[] args) {
}//public class ArrayListExtras {