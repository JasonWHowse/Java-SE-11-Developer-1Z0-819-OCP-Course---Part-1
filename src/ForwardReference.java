/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 6: Describing and Using Objects and Classes
Topic: Declare and Instantiate Objects
Sub-Topic: Initializers, Forward References
*/

// For all the examples below, the initializers reference variables
// declared after the blocks.
class Thing {

    // Constructor
    Thing() {
        secondString = "b" + secondString;
    }//Thing() {

    // Initializer
    {
        firstString = this.secondString;
    }

    // Static Initializer
    static {
//        System.out.println(thirdString);
        thirdString = "c";
    }//static {

    // Two instance variables
    String firstString;
    String secondString;

    // static variable
    static String thirdString;

    public String toString() {
        return firstString + secondString + thirdString;
    }//public String toString() {
}//class Thing {

public class ForwardReference {
    public static void main(String[] args) {
        Thing one = new Thing();
        System.out.println(one);
    }//public static void main(String[] args) {
}//public class ForwardReference { 