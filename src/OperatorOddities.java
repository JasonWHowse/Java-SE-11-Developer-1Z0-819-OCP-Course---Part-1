/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Operators
Sub-Topic: Out of Ordinary
*/

public class OperatorOddities {
    public static void main(String[] args) {

        byte byte1 = 1;
        var byte2 = +byte1;  // What is byte2?
        System.out.println("byte2" + TestVar(byte2));

        var negativeByte = -byte1;
        System.out.println("negativeByte" + TestVar(negativeByte));

        short short1 = 2;
        var result = byte1 + short1;
        System.out.println("result" + TestVar(result));

        long long1 = 10L;
        var result2 = long1 + (1.0);
        System.out.println("result2" + TestVar(result2));
    }//public static void main(String[] args) {

    // This method works because of the way Java
    // autoboxes and evaluates method parameters...
    public static String TestVar(Object var) {
        String returnValue = " is unknown";
        if (var instanceof Byte) {
            returnValue = " is a byte";
        } else if (var instanceof Character) {//if (var instanceof Byte) {
            returnValue = " is a char";
        } else if (var instanceof Short) {//else if (var instanceof Character)
            returnValue = " is a short";
        } else if (var instanceof Integer) {//else if (var instanceof Short) {
            returnValue = " is an int";
        } else if (var instanceof Long) {//else if (var instanceof Integer) {
            returnValue = " is a long";
        } else if (var instanceof Double) {//else if (var instanceof Long) {
            returnValue = " is a double";
        } else if (var instanceof Float) {//else if (var instanceof Double) {
            returnValue = " is a float";
        }//else if (var instanceof Float) {
        return returnValue;
    }//public static String TestVar(Object var) {
}//public class OperatorOddities { 