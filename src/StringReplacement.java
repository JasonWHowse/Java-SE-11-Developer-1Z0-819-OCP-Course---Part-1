/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic:  String replace and substring.
*/

public class StringReplacement {
    public static void main(String[] args) {

        // Create variables.
        String mississippi = "Mississippi";
        String[] resultArray = new String[4];

        // Example of: replace(char oldChar, char newChar)
        // Returns a String
        resultArray[0] = "Replace s with S : " + mississippi.replace('s', 'S');

        // Example of: replace(CharSequence target, CharSequence replacement)
        // Returns a String
        resultArray[1] = "Replace literal \"iss\" with \"ips\" : " +
                mississippi.replace("iss", "ips");

        // Example of: replaceAll(String regex, String replacement)
        // Returns a String
        resultArray[2] = "Replace regexp [i with 2 characters(s or p)] with literal \"ax\" : " +
                mississippi.replaceAll("(i(s|p){2})", "ax");

        // Example of: replaceFirst(String regex, String replacement)
        // Returns a String
        resultArray[3] = "Replace first match of regexp [i with 2 characters(s or p)] " +
                "with literal \"ax\" : " +
                mississippi.replaceFirst("(i(s|p){2})", "ax");

        // Printing our resultArray to console
        for (String result : resultArray) {
            System.out.println(result);
        }//for (String result : resultArray) {

        // ... substring and subSequence examples...

        // This call to substring extracts a substring ignoring any
        // characters prior to index 7
        System.out.println("mississippi.substring(7) = "
                + mississippi.substring(7));

        // This call to substring extracts a substring starting at
        // index = 3 and ending at index 7
        // (note that character at index 7 is not included)
        System.out.println("mississippi.substring(3, 7) = "
                + mississippi.substring(3, 7));  // start index = 3, end index = 7

        // subSequence can be used for both String and StringBuilder Objects.
        // but both a starting and ending index are required.
        System.out.println("mississippi.subSequence(3, 7) = "
                + mississippi.subSequence(3, 7));

        System.out.println("mississippi = " + mississippi);

        // reassigning output to the mississipi String reference type.
        mississippi = mississippi.substring(0, 4);
        System.out.println("mississippi = " + mississippi);
    }//public static void main(String[] args) {
}//public class StringReplacement { 