/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic: Comparing Strings
*/

public class StringComparison {
    public static void main(String[] args) {

        // We'll create some String Objects to test...
        String nullString = null;
        String stringHello1 = "Hello";  // String Literal, interned
        String stringhEllo = "hEllo";  // String Literal, interned

        // String reference, not interned
        String stringHello2 = new String(new char[]{'H', 'e', 'l', 'l', 'o'});

        // StringBuilder implements CharSequence, We'll test String
        // comparison methods with alternate objects.
        StringBuilder helloStringBuilder = new StringBuilder("Hello");

        String firstString = stringhEllo;   // Line 23
        String secondString = stringHello1;     // Line 24
        Object secondObject = secondString; // Line 25
        CharSequence secondSequence = secondString; // Line 26

        //  == operand
        TestEqualsOperand(firstString, secondString);

        //  public boolean equals(Object anObject)
        TestEqualsMethod(firstString, secondObject);

        // ---- public boolean equalsIgnoreCase?(String anotherString)
        TestEqualsIgnoreCaseMethod(firstString, secondString);

        // ---- public boolean contentEquals?(CharSequence cs)
        TestContentEqualsMethod(firstString, secondSequence);

        // ---- public int compareTo?(String anotherString)
        TestCompareToMethod(firstString, secondString);

        // ----- public int compareToIgnoreCase?(String str)
        TestCompareToIgnoreCaseMethod(firstString, secondString);

    }//public static void main(String[] args) {

    //  == operand
    // returns true when both objects refer to the same object, not the same value
    public static void TestEqualsOperand(String firstString, Object secondObject) {
        System.out.println(String.format("(%s == %s) = " +
                (firstString == secondObject), firstString, secondObject));

    }//public static void TestEqualsOperand(String firstString, Object secondObject) {

    //  public boolean equals(Object anObject)
    //  returns true if references are the same,
    //  OR if parameter type is String AND the value is the same
    public static void TestEqualsMethod(String firstString, Object secondObject) {
        try {
            System.out.println(String.format("%s.equals(%s) = " +
                    (firstString.equals(secondObject)), firstString, secondObject));
        } catch (Exception e) {//try {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondObject, e.getClass().getName()));

        }//catch (Exception e) {
    }//public static void TestEqualsMethod(String firstString, Object secondObject) {

    //  public boolean equalsIgnoreCase(Object anObject)
    //  returns true if two Strings have same value ignoring case
    public static void TestEqualsIgnoreCaseMethod(String firstString, String secondObject) {
        try {
            System.out.println(String.format("%s.equalsIgnoreCase(%s) = " +
                    (firstString.equalsIgnoreCase(secondObject)), firstString, secondObject));
        } catch (Exception e) {//try {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondObject, e.getClass().getName()));

        }//catch (Exception e) {
    }//public static void TestEqualsIgnoreCaseMethod(String firstString, String secondObject) {

    //  public boolean contentEquals(CharSequence cs)
    //  returns true if values in String and the second passed parameter are the same.
    public static void TestContentEqualsMethod(String firstString, CharSequence secondSequence) {
        try {
            System.out.println(String.format("%s.contentEquals(%s) = " +
                    (firstString.contentEquals(secondSequence)), firstString, secondSequence));
        } catch (Exception e) {//try {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondSequence, e.getClass().getName()));

        }//catch (Exception e) {
    }//public static void TestContentEqualsMethod(String firstString, CharSequence secondSequence) {

    //  public int compareTo(String anotherString)
    //  Compares the value of Strings lexicographically
    public static void TestCompareToMethod(String firstString, String secondString) {
        try {
            System.out.println(String.format("%s.compareTo(%s) = " +
                    (firstString.compareTo(secondString)), firstString, secondString));
        } catch (Exception e) {//try {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondString, e.getClass().getName()));

        }//catch (Exception e) {
    }//public static void TestCompareToMethod(String firstString, String secondString) {

    // public int compareToIgnoreCase(String str)
    //  Compares the value of Strings lexicographically ignoring case
    public static void TestCompareToIgnoreCaseMethod(String firstString, String secondString) {
        try {
            System.out.println(String.format("%s.compareToIgnoreCase(%s) = " +
                    (firstString.compareToIgnoreCase(secondString)), firstString, secondString));
        } catch (Exception e) {//try {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondString, e.getClass().getName()));

        }//catch (Exception e) {
    }//public static void TestCompareToIgnoreCaseMethod(String firstString, String secondString) {
}//public class StringComparison { 