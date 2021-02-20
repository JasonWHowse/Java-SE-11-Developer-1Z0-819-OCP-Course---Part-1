/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Declare and Initialize Variables
Sub-Topic: Casting
*/

public class CastingExample {
    public static void main(String[] args) {

        // Set up some local variables.  Note that s2 is a short.
        short s2;
        int loopIterations = 0;

        int minValue = Short.MIN_VALUE-1;  // our loop condition variable is an int, so this is widening
        int maxValue = Short.MAX_VALUE+1;

        // We are forcing the for loop to stay in the valid range of a short
        for (int i = minValue; i <= maxValue; i++) {

            // We know because of the way we've written the code that i will never be outside
            // the range of a short, so we confidently cast i to s2 as a short.
            s2 = (short) i;  // we cast an int to a short

            // We'll print stuff out at the first and last increment of loop.
            if (i == minValue) System.out.println("Minimum Short value = " + s2);
            if (i == maxValue) System.out.println("Maximum Short value = " + s2);

            // We need to pass a short to the method we've created
            // so we pass s2, not our loop variable i.
            callAMethodWithParameter((loopIterations + 1), s2);
            loopIterations++;
        }//for (int i = minValue; i <= maxValue; i++) {
        System.out.println("loopIterations = " + loopIterations);
    }//public static void main(String[] args) {

    private static void callAMethodWithParameter(int i, short s) {
        // Do something here with your short that you would not do with an int or long for example

        // Really only want this to print once, though it's called in a loop...
        if (s == Short.MAX_VALUE) System.out.println("Iteration " + i + " had the max value, my type is short");
    }//private static void callAMethodWithParameter(int i, short s) {
}//public class CastingExample {