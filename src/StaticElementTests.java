/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 7: Creating and Using Methods
Topic: Create Methods and Constructors
Sub-Topic: static keyword
*/

// This class demonstrates static fields, a static initializer, and
// a static method
class StaticStuff {
    static final String appName = "A Good App";

    // static initializer
    static {
        System.out.println("Initializing StaticStuff class");
        StaticStuff.counter++;
    }//static {

    static void printAppName() {
        System.out.println("Application Name:  " + appName +
                " : counter  = " + counter);
    }//static void printAppName() {

    static int counter;
}//class StaticStuff {

public class StaticElementTests {
    public static void main(String[] args) {
        //    // on start-up
        for (int i = 0; i < 3; i++) {
            System.out.println("Printing " + (i));
        }//for (int i = 0; i < 3; i++) {
        //** Create an object of type StaticStuff.
//        StaticStuff s = null;
        // We access static member of the StaticStuff class// Add some 'work' first to prove StaticStuff not initialized
//        System.out.println("Application Name: " + s.appName);
//
//        int myCounter=StaticStuff.counter;
//        System.out.println("myCounter = " + myCounter);
//        s.printAppName();

        //** Create an object of type StaticStuff.
        StaticStuff s = new StaticStuff();
        System.out.println("Created first instance of StaticStuff");
        s.printAppName();

        System.out.println("Created second instance of StaticStuff");
        StaticStuff s0 = new StaticStuff();
        s0.printAppName();

        System.out.println("Created third instance of StaticStuff");
        StaticStuff s1 = new StaticStuff();
        s1.printAppName();
    }//public static void main(String[] args) {
}//public class StaticElementTests { 