/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic:  Transform String.
*/

public class TextTransform {
    public static void main(String[] args) {

        // Example of:  repeat(int count) (introduced in Java 11)
        // Returns a String
        String repeatString = "Repeat After Me ";

        // We'll repeat the String 3 x, set count parameter = 3
        repeatString = repeatString.repeat(3);
        System.out.println("repeatString = " + repeatString);

        // But what does passing a zero in do?
        repeatString = repeatString.repeat(0);
        System.out.println("repeatString = " + repeatString);

        Character.isWhitespace('a');

        // ---  valueOf methods ---

        // Example of : valueOf(char[] data)
        // Returns a String
        String charsToString = String.valueOf(new char[]{'a', 'b', 'c', 'd', 'e'});

        // Example of : valueOf(char[] data, int offset, int count)
        // Returns a String
        String charsToStringPartial = String.valueOf(new char[]{'a', 'b', 'c', 'd', 'e'}, 1, 3);
        String subString = charsToString.substring(1, 3);

        System.out.println("charsToString = " + charsToString);
        System.out.println("charsToStringPartial = " + charsToStringPartial
                + ", subString = " + subString);
    }//public static void main(String[] args) {
}//public class TextTransform { s