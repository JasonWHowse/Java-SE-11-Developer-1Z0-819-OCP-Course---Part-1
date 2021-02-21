/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 6: Describing and Using Objects and Classes
Topic: Declare and Instantiate Objects
Sub-Topic: Final Fields
*/

class Constants {
    // Final static class variables are considered constants.
    // There is one reference to them (static)
    // they cannot be altered (final)
    final static String ONE = "final static field ONE = one";
    final static String TWO = "final static field TWO = two";

    // Compile error if static intitializer removed
    final static String THREE;

    static {
        THREE = "final static field THREE = three";
    }//static {
}//class Constants {

public class FinalFields {
    // You can create final instance variables that are not static.

    final String FOUR;

    // initializer sets final field four
    {
        FOUR = "final field FOUR = four";
    }

    final String FIVE;

    // constructor sets final field five
    FinalFields() {
        FIVE = "final field FIVE =  five";
    }//FinalFields() {

    // new constructor takes an argument
    FinalFields(String value) {
        FIVE = "final field FIVE =  " +value;
    }//FinalFields(String value) {

    public static void main(String[] args) {

        // Access and print the constants.
        System.out.println(Constants.ONE);
        System.out.println(Constants.TWO);
        System.out.println(Constants.THREE);

        System.out.println((new FinalFields()));
        System.out.println("----------------------------");
        System.out.println((new FinalFields("six")));

    }//public static void main(String[] args) {

    public String toString() {
        return FOUR + "\n" + FIVE;
    }//public String toString() {
}//public class FinalFields { 