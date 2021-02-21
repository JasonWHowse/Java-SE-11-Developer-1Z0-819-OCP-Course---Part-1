/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Operators
Sub-Topic: Ternary Operator
*/

public class TernaryOperator {
    public static void main(String[] args) {

        // Example 1
        // The value returned from this ternary operation is a boolean.
        boolean hasArguments = (args.length == 0) ? false : true;
        System.out.println("Result of Example 1 = " + hasArguments);

        // Example 2
        // Value returned from ternary operation is primitive data
        boolean b = true;
        int result = (b && (hasArguments && args[0].equals("10"))) ? 10 : 0;
        System.out.println("Result of Example 2 = " + result);

        // Example 3
        // Value returned from ternary operation is either an Integer or String
        Object objectResult =
                (b && (hasArguments && args[0].equals("10"))) ? 10 : "Not ten";
        System.out.println("Result of Example 3 = " + objectResult);

        // Example 4
        // Expressions only evaluated in the one of the cases
        int x = 0;
        int y = 0;
        int newResult = (b && (hasArguments && args[0].equals("10"))) ? x++ : y++;
        System.out.println("Result of Example 4 = " +
                newResult + ", x = " + x + ", y = " + y);
    }//public static void main(String[] args) {
}//public class TernaryOperator { 