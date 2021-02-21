/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Applying Encapsulation Principles to a class
*/

package com.entity;

public class PersonTester {
    public static void main(String[] args) {

        // Create some local variables
        StringBuilder address =
                new StringBuilder("2234 Maple Ave, Ralphtown, PA, 19000");
        int age = 45;
        String name = "Ralph";

        // Create instance of person with local variable references
        Person p = new Person(name, address, age);

        // Change the local variable's data
        address.append("-0005");
        name = "Ralph's Wife";
        age = 40;

        // Create another instance of person with local variable references
        Person p2 = new Person(name, address, age);
        System.out.println(p);
        System.out.println(p2);
    }//public static void main(String[] args) {
}//public class com.entity.PersonTester { 