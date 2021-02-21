/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic: Recap
*/

public class ImmutableString {

    public static void main(String[] args) {

        //  "Hello" exists on the string pool, s1 gets a reference to it
        String s1 = "Hello";  
 
        /*
        The following code does not change the value of "Hello" on the
        string pool, it creates a new string with value of "Hello World" and
         passes the reference to this new string to s1;
 
        "Hello World" not added to the string pool unless intern() called
        */
        s1 = s1 + " World";

        System.out.println(s1);

        // Let's reset s1 and show another example using String's concat
        // method which we'll discuss later
        s1 = "Hello";
        s1.concat(" World");

        System.out.println(s1);
    }
}