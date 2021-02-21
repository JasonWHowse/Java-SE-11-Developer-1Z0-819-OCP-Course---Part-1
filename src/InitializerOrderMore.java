/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 6: Describing and Using Objects and Classes
Topic: Declare and Instantiate Objects
Sub-Topic: Initializers
*/

class MixItUpClass {
    static int statementOrder;

    int a = clarify("assigning a", statementOrder);

    //  initializer 1
    {
        // we reference variable declared above in initializer statement
        clarify("initializer 1", this.a);
    }

    // we reference variable declared above in declaration and assignment
    int b = clarify("assigning b", this.a);

    //  initializer 2
    {
        // we reference variable declared above in initializer statement
        clarify("initializer 2", this.b);
    }

    // Constructor
    MixItUpClass() {
        // we reference variable declared below in constructor statement
        d = clarify("constructor", this.d);
    }//MixItUpClass() {

    // we reference variable declared above in declaration and assignment
    int c = clarify("assigning c", this.b);

    //  initializer 3
    {
        // we reference variable declared above in initializer statement
        clarify("initializer 3", this.c);
    }

    int clarify(String message, int passedVariable) {
        statementOrder++;
        System.out.println(statementOrder + " " + message);
        return statementOrder;
    }//int clarify(String message, int passedVariable) {

    int d;

    public String toString() {
        return this.a + ", " + this.b + ", " + this.c + ", " + this.d;
    }//public String toString() {
}//class MixItUpClass {

public class InitializerOrderMore {
    public static void main(String[] args) {
        System.out.println(new MixItUpClass());
    }//public static void main(String[] args) {
}//public class InitializerOrderMore { 