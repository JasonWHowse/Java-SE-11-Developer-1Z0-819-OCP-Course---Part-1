/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 12: Understanding Modules
Topic: Declare modules and enable access between modules
*/

package org.pkg.appglobals;

// Set up a public class with some global static fields
public class ApplicationConstants {

    // APP_NAME is a constant
    public static final String APP_NAME = "Module Test";

    // counter will be a global counter
    private static int counter;

    // increment counter
    public static void addCounter() {
        counter += 1;
    }//public static void addCounter() {

    // retrieve value of the counter
    public static int getCounter() {
        return counter;
    }//public static int getCounter() {
}//public class ApplicationConstants {