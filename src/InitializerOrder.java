/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 6: Describing and Using Objects and Classes
Topic: Declare and Instantiate Objects
Sub-Topic: Initializers
*/

class OrderedClass {
    static int statementOrder;

    int a = clarify("assigning a");

    // initializer 1
    {
        clarify("initializer 1");
    }

    int b = clarify("assigning b");

    // initializer 2
    {
        clarify("initializer 2");
    }

    // Constructor
    OrderedClass() {
        clarify("constructor");
    }//OrderedClass() {

    int c = clarify("assigning c");

    //  initializer 3
    {
        clarify("initializer 3");
    }

    // method called from initializers which should help us understand
    // the order of execution
    int clarify(String message) {
        statementOrder++;
        System.out.println(statementOrder + " " + message);
        return statementOrder;
    }//int clarify(String message) {
}//class OrderedClass {

public class InitializerOrder {
    public static void main(String[] args) {
        // Instantiating the object should set off initialization code.
        OrderedClass o = new OrderedClass();
    }//public static void main(String[] args) {
}//public class InitializerOrder { 