/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Declare and Initialize Variables
Sub-Topic: Initialization of primitive data type variables - including default values
*/

public class FooBar {
    public static void main(String[] args) {

        int p;  // p is an uninitialized local variable here

        boolean myBoolean = true;

        // If/Else statement satisfies compiler's full initialization check
        if (myBoolean) {
            p = 1;
        } else {//if (myBoolean) {
            p = 2;
        }//else {

        System.out.println("p is " + p);  // p is now fully initialized

        int q; // q is an uninitialized local variable here
        // If statement with static boolean value satisfies compiler's
        // full initialization check
        if (true){
            q=1;
        }//if (true){
        System.out.println("q is "+q);

        // switch statement with a default block satisfies compiler's full initialization check

        int testInt = 5;  // test variable for switch statement.
        int r;  // r is an uninitialized local variable here
        switch (testInt) {
            case 0:
            case 1:
            case 2:
                r = 1;
                break;
            case 3:
            case 4:
            case 5:
                r = 2;
                break;
            default:
                r = 3;
        }//switch (testInt) {
        System.out.println("r is " + r);   // r is now fully initialized

        // do while statement  satisfies compiler's full initialization check
        int s, t = 0;  // s is an uninitialized local variable here
        do {
            s = t++;
        } while (t < 1);//do {
        System.out.println("s is " + s);   // s is now fully initialized

        // while statement  satisfies compiler's full initialization check only if condition is staticly known
        int u, v = 0;  // u is an uninitialized local variable here
        while (true) {
            u = v++;
            break;
        }//while (true) {
        System.out.println("u is " + u);   // u is now fully initialized

    }//public static void main(String[] args) {
}//public class FooBar {