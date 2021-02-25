/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10:  Section 10: Programming Abstractly Through Interfaces
Topic: Lambda Expressions
Sub-Topic: Lambda Expression in Assignments.
*/

public class BinaryCalculator {

    // We declare a functional interface as part of the class
    // A functional interface is an interface with one and only one
    // abstract method.
    interface BinaryIntegerOperation {
        int calculate(int a, int b);
    }//interface BinaryIntegerOperation {

    // We create a 'pass thru'  method, accepting an object which
    // implements our interface as one parameter.  The other parameters
    // are the numbers used in the binary operations
    public int calculate(int a, int b, BinaryIntegerOperation op) {
        return op.calculate(a, b);
    }//public int calculate(int a, int b, BinaryIntegerOperation op) {

    public static void main(String... args) {

        BinaryCalculator myApp = new BinaryCalculator();

        // This lambda expression demonstrates a typed parameter list
        // Parentheses are always required for multiple parameters
        // - This operation will result in the values being added together.
        BinaryIntegerOperation addition = (int a, int b) -> a + b;

        // This lambda expression demonstrates an untyped parameter list
        // Parentheses are always required for multiple parameters
        // - This operation will result in the values being subtracted
        BinaryIntegerOperation subtraction = (a, b) -> a - b;

        BinaryIntegerOperation multiplication = (var a, var b) -> a * b;

        BinaryIntegerOperation division = (a, b) -> a / b;

        // Execution
        int value_a = 4;
        int value_b = 2;

        System.out.println("The numbers (" + value_a + ", " + value_b +
                ") added = " + myApp.calculate(value_a, value_b, addition));

        System.out.println("The numbers (" + value_a + ", " + value_b +
                ") subtracted = " + myApp.calculate(value_a, value_b, subtraction));

        System.out.println("The numbers (" + value_a + ", " + value_b +
                ") multiplied = " + myApp.calculate(value_a, value_b, multiplication));

        System.out.println("The numbers (" + value_a + ", " + value_b +
                ") divided = " + myApp.calculate(value_a, value_b, division));
    }//public static void main(String... args) {
}//public class BinaryCalculator {