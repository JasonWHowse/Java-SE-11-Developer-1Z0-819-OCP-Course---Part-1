/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 6: Describing and Using Objects and Classes
Topic: Declare and Instantiate Objects
Sub-Topic:  Object references
*/

// A simple test class with a few attributes, a constructor and
// a method.
class TestClass {
    private String a = "a";
    private String b = "b";

    // Constructor
    TestClass(String a, String b) {
        this.a = a;
        this.b = b;
    }//TestClass(String a, String b) {

    public String toString() {
        return a + "-" + b;
    }//public String toString() {
}//class TestClass {

public class References {
    public static void main(String[] args) {

        // Declare and instantiate some objects

        // aref is a reference to the 'a-z object'
        TestClass aref = new TestClass("a", "z");

        // bref is a reference to the 'first-last object'
        TestClass bref = new TestClass("first", "last");

        // cref is a reference to the 'start-end object'
        TestClass cref = new TestClass("start", "end");

        // References not assigned to any objects.
        TestClass dref = null;
        TestClass eref = null;

        // any references to 'a-z object' no longer exist after statement
        aref = bref;
        System.out.println("aref has a reference to object : " + aref);

        //  aref, bref and dref variables reference the 'first-last object'
        dref = bref;
        System.out.println("dref has a reference to object : " + dref);

        // Assignments not in declarations occur right to left
        // eref, bref, cref variables all reference the 'start-end object'
        eref = bref = cref;
        System.out.println("eref has a reference to object : " + eref);

        // all references to 'start-end object' are set to null,
        // making it eligible for garbage collection
        aref = dref = null;
        System.out.println("---------Finally-------------");
        System.out.println("aref has a reference to object : " + aref);
        System.out.println("bref has a reference to object : " + bref);
        System.out.println("dref has a reference to object : " + cref);
        System.out.println("dref has a reference to object : " + dref);
        System.out.println("eref has a reference to object : " + eref);

    }//public static void main(String[] args) {
}//public class References { 