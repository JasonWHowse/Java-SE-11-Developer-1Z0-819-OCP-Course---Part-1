/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIS
Topic: Create and Manipulate Strings
Sub-Topic: Out of Ordinary
 */

public class TestValueOf {
    public static void main(String[] args) {
        String george = "FredGeorgeSmith";

        // Constructor used to get substring
        // beginning offset index 4 inclusive, and 6 characters long
        String shortGeorge1 = new String(george.toCharArray(), 4, 6);
        System.out.println("shortGeorge1 = " + shortGeorge1);

        // valueOf method used to get substring
        // beginning offset index 4 inclusive, and 6 characters long
        String shortGeorge2 = String.valueOf(george.toCharArray(), 4, 6);
        System.out.println("shortGeorge2 = " + shortGeorge2);

        // The method substring uses offsets,
        // beginning offset (inclusive) and ending offset (exclusive)
        // What happens if we use same parameter values examples above?
        String shortGeorge3 = george.substring(4, 6);
        System.out.println("shortGeorge3 = " + shortGeorge3);

        // let's change our second parameter value...
        String shortGeorge4 = george.substring(4, 10);
        System.out.println("shortGeorge4 = " + shortGeorge4);

        // Notice that none of these methods change george variable itself
        System.out.println("george = " + george);
    }//public static void main(String[] args) {
}//public class TestValueOf { 