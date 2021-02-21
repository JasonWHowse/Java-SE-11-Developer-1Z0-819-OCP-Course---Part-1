/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: StringBuilder
Sub-Topic: Out of the Ordinary
*/

public class StringBuilderExtras {
    public static void main(String[] args) {

        // Create empty StringBuilder
        StringBuilder builder = new StringBuilder();

        // Add some code with leading/trailing whitespcace
        builder.append("  ABCD                 ");
        System.out.println("Original Value of builder = *" + builder + "*");
        System.out.println("Length of builder = " + builder.length());
        System.out.println("Capacity of builder = " + builder.capacity());

        // What do you think trimToSize does?
        builder.trimToSize();
        System.out.println("Current Value of builder = *" + builder + "*");
        System.out.println("Length of builder = " + builder.length());
        System.out.println("Capacity of builder = " + builder.capacity());

        builder.replace(0, builder.length(), builder.toString().strip());
        System.out.println("Next Value of builder = *" + builder + "*");
        System.out.println("Length of builder = " + builder.length());
        System.out.println("Capacity of builder = " + builder.capacity());

        // Let's now explore getChars method on String and StringBuilder
        // Test data
        builder.append(" just more text because we need more text");
        char[] myCharacterArray1 = new char[10];
        char[] myCharacterArray2 = new char[10];

        // calling getChars on a String with srcBegin = 20,  srcEnd = 27
        builder.toString().getChars(20, 27, myCharacterArray1, 0);
        // calling getChars on a StringBuilder object with srcBegin = 20,  srcEnd = 27
        builder.getChars(20, 27, myCharacterArray2, 0);

        System.out.println("myCharacterArray1 = " +
                java.util.Arrays.toString(myCharacterArray1));
        System.out.println("myCharacterArray2 = " +
                java.util.Arrays.toString(myCharacterArray2));

// Set up some test data
        char[] myCharacterArray3 = new char[builder.length()];
        char[] myCharacterArray4 = new char[builder.length()];

        // calling getChars on a String with srcBegin = 20,  srcEnd = 21
        builder.toString().getChars(20, 21, myCharacterArray3, 0);
        // calling getChars on a StringBuilder object with srcBegin = 20,  srcEnd = 21
        builder.getChars(20, 21, myCharacterArray4, 0);
        System.out.println("myCharacterArray3 = " +
                java.util.Arrays.toString(myCharacterArray3));
        System.out.println("myCharacterArray4 = " +
                java.util.Arrays.toString(myCharacterArray4));

        // Set up additional test data
        char[] myCharacterArray5 = new char[10];
        char[] myCharacterArray6 = new char[10];

        // change destination index from 0 to 3 for String
        builder.toString().getChars(20, 27, myCharacterArray5, 3);
        // change destination index from 0 to 3 for String
        builder.getChars(20, 27, myCharacterArray6, 3);

        System.out.println("myCharacterArray5 = " +
                java.util.Arrays.toString(myCharacterArray5));
        System.out.println("myCharacterArray6 = " +
                java.util.Arrays.toString(myCharacterArray6));

        // Let's change the destination index
        char[] myCharacterArray7 = new char[5];
        char[] myCharacterArray8 = new char[5];
        builder.toString().getChars(20, 27, myCharacterArray7, 3);
        builder.getChars(20, 27, myCharacterArray8, 3);
        System.out.println("myCharacterArray7 = " +
                java.util.Arrays.toString(myCharacterArray7));
        System.out.println("myCharacterArray8 = " +
                java.util.Arrays.toString(myCharacterArray8));
    }//public static void main(String[] args) {
}//public class StringBuilderExtras { 