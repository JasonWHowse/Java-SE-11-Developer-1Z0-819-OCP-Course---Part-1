/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Create and implement interfaces
*/

interface InterfaceExample {
    // Define some variables
    // no modifiers at all
    String interfaceName = "InterfaceExample";

    // single modifer
    static String staticInterfaceName = "StaticInterfaceExample";
    public String publicInterfaceName = "PublicInterfaceName";
    final String finalInterfaceName = "FinalInterfaceName";

    // double modifiers
    public final String publicFinalInterfaceName = "PublicFinalInterfaceName";
    static final String staticFinalInterfaceName = "StaticFinalInterfaceName";

    // triple modifiers
    public static final String publicStaticFinalInterfaceName = "PublicStaticFinalInterfaceName";
    // These methods are private because we declared them private.
    private String privateMethod() {
        return "private";
    }//private String privateMethod() {

    private static String privateStaticMethod() {
        return "private static";
    }//private static String privateStaticMethod() {

    // These methods are public implicitly
    default String defaultMethod() {
        // You can call private method from a default method
        return privateMethod() + " then default";
    }//default String defaultMethod() {

    static String publicStaticMethod() {
        // You can call private static method from public static method
        return InterfaceExample.privateStaticMethod() + " then static";
    }//static String publicStaticMethod() {

    // This is the public method that would, in theory, be the method
    // that you want all implementing classes to have in common.
     abstract void theImportantMethod();
}//interface InterfaceExample {

public class InterfaceTest implements InterfaceExample{
    public static void main(String[] args) {
        // Regardless of how you define it, a variable on an interface is
        // public static final
        System.out.println("All fields on an interface are" +
                " public static final:");
        System.out.println(InterfaceExample.interfaceName);
        System.out.println(InterfaceExample.staticInterfaceName);
        System.out.println(InterfaceExample.publicInterfaceName);
        System.out.println(InterfaceExample.finalInterfaceName);
        System.out.println(InterfaceExample.publicFinalInterfaceName);
        System.out.println(InterfaceExample.staticFinalInterfaceName);
        System.out.println(InterfaceExample.publicStaticFinalInterfaceName);
        System.out.println("\nExecuting concrete methods on interface");
        // public static method can be accessed from type
        System.out.println(InterfaceExample.publicStaticMethod());

        // default method can be accessed from object which implements type
        InterfaceTest it = new InterfaceTest();
        System.out.println(it.defaultMethod());
    }//public static void main(String[] args) {

    public void theImportantMethod() {
        System.out.println("This is the important method that all objects " +
                "implementing InterfaceTest must override and implement ");
    }//public void theImportantMethod() {

    // Method that accepts the interface as a parameter
    public void testInterface(InterfaceExample it) {
        System.out.println("Executing testInterface with InterfaceExample");
        it.theImportantMethod();
    }//public void testInterface(InterfaceExample it) {

    // Method that accepts on object as a parameter
    public void testInterface(Object o) {
        System.out.println("Executing testInterface with Object");
        // Using instanceof with an interface
        if (o instanceof InterfaceExample) {
            // Casting using an interface
            InterfaceExample it = (InterfaceExample) o;
            it.theImportantMethod();
        }//if (o instanceof InterfaceExample) {
    }//public void testInterface(Object o) {
}//public class InterfaceTest {