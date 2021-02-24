/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10:  Section 10: Programming Abstractly Through Interfaces
Topic: Lambda Expressions
Sub-Topic: Anonymous classes
*/

public class AnonymousTest {
    interface Helloable {
        public void hello();
    }//interface Helloable {

    public static void main(String[] args) {
        AnonymousTest a = new AnonymousTest();

        // We declare a local inner class (named) in this method
        class LocalClass extends Object {
            public void hello() {
                System.out.println("Hello Local Class");
            }
        }//class LocalClass extends Object {

        // We immediately execute a method on the local class
        // If this were the only line of code that used the local class,
        // An anonymous class would make more sense.
        new LocalClass().hello();

        // We create an anonymous class as a statement, not a declaration.
        // This one is of type Object (extends Object)
        Object anomClass = new Object() {
            public String toString() {
                return "Hello Anonymous Class";
            }//public String toString() {
        };//Object anomClass = new Object() {
        // We immediately execute a method on anonymous class
        System.out.println(anomClass.toString());

        // Anonymous class is a statement, not a declaration.
        // This one is a Helloable (implements Helloable)
        Helloable anomInterfacedClass = new Helloable() {
            public void hello() {
                System.out.println("Hello Anonymous Class" +
                        " implementing Interface");
            }
        };
        // Executing methods on anonymous class
        anomInterfacedClass.hello();

        // In the code below, we actually pass an anonymous class in the
        // call to a method that accepts a Helloable type as a parameter
        a.printHello(
                // Anonymous class created on the fly
                new Helloable() {
                    public void hello() {
                        System.out.println("Hello Anonymous Class " +
                                "passed as a parameter");
                    }//public void hello() {
                }//
        );//a.printHello(

        // In the code below, we now replace the anonymous class parameter
// with a lambda expression
        a.printHello(
                // Lambda Expression
                () -> System.out.println("Hello Lambda Expression" +
                        " as a parameter")
        );//a.printHello(
    }//public static void main(String[] args) {
    public void printHello(Helloable h) {
        h.hello();
    }//public void printHello(Helloable h) {
}//public class AnonymousTest {