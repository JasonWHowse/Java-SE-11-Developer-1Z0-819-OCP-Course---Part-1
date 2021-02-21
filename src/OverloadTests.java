/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 7: Creating and Using Methods
Topic: Create Methods and Constructors
Sub-Topic: Overload out of the ordinary
*/

// The Calculator class demonstrates overloading
// static methods.  Each method prints a unique message so we can
// understand which method was picked by the JVM
class Calculator {
    public static long add(int a, Double f) {
        System.out.println("int + Double");
        long result = (long) (a + f);
        return result;
    }//public static long add(int a, Double f) {

    public static long add(int a, long b) {
        System.out.println("int + long");
        return a + b;
    }//public static long add(int a, long b) {

    public static long add(long... a) {
        System.out.println("Var args int");

        int total = 0;
        for (long val : a) {
            total += val;
        }//for (int val : a) {
        return total;
    }//public static long add(int... a) {

    public static long add(int a, long... b) {
        System.out.println("int a, Var args int b");
        int total = a;
        for (long val : b) {
            total += val;
        }//for (int val : b) {
        return total;
    }//public static long add(int a, int... b) {
}//class Calculator {

public class OverloadTests {
    public static void main(String[] args) {

        // Testing Calculator with multiple primitive data types
        var result = Calculator.add(1, 2);
        System.out.println("result = " + result);

        result = Calculator.add(1, 2, 3);
        System.out.println("result = " + result);

        result = Calculator.add(1, 10l);
        System.out.println("result = " + result);

        result = Calculator.add(1, 12.3);
        System.out.println("result = " + result);
    }//public static void main(String[] args) {
}//public class OverloadTests { 