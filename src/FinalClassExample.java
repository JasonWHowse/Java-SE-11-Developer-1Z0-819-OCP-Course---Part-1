/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 7: Creating and Using Methods
Topic: Create Methods and Constructors
Sub-Topic:  Final Class
*/

// Example of a final class
final class FinalEntity {
    private String name;

    FinalEntity(String name) {
        this.name = name;
    }//FinalEntity(String name) {

    void doSomething() {
        System.out.println("doing something for " + this.name);
    }//void doSomething() {
}//final class FinalEntity {

public class FinalClassExample {
    public static void main(String[] args) {

        // You can create as many instances of a final class as you wish
        FinalEntity f1 = new FinalEntity("a");
        FinalEntity f2 = new FinalEntity("b");
        f1.doSomething();
        f2.doSomething();
    }//public static void main(String[] args) {
}//public class FinalClassExample { 