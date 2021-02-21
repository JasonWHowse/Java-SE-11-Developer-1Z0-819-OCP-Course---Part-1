/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 6: Describing and Using Objects and Classes
Topic: Declare and Instantiate Objects
Sub-Topic: Static Initializer
*/

class staticInitExample {
    static int statementOrder;
    static int firstVariable = clarifyOrder("assigning firstVariable");

    // Static initializer 1
    static {
        clarifyOrder("executing initializer 1");
    }//static {

    static int secondVariable = clarifyOrder("assigning secondVariable");

    // Static initializer 2
    static {
        clarifyOrder("executing initializer 2");
    }//static {

    static int clarifyOrder(String message) {
        statementOrder++;
        System.out.println(statementOrder + " " + message);
        return statementOrder;
    }//static int clarifyOrder(String message) {
}//class staticInitExample {

public class StaticInitializer {
    public static void main(String[] args) {
        System.out.println("statements made so far = " + staticInitExample.statementOrder);
    }//public static void main(String[] args) {
}//public class StaticInitializer { 