/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Loops
Sub-Topic: For Loop
*/

public class ForLoopExample1 {
    public static void main(String[] args) {
        System.out.println("-----------  TRADITIONAL FOR LOOP -----------");
        // This is a basic for loop, which loops through arguments passed to
        // this method and prints them out
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + " = " + args[i]);
        }//for (int i = 0; i < args.length; i++) {

        System.out.println("-----------  ENHANCED FOR LOOP -----------");
        // Now let's do it with the enhanced for loop
        // Notice that if you want an iterator index,
        // you have to maintain it yourself
        int i = 0;
        for (String arg: args) {
            System.out.println("Argument " + (++i) + " = " + arg);
        }//for (String arg: args) {
    }//public static void main(String[] args) {
}//public class ForLoopExample1 { 