/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Create and implement interfaces
Sub-Topic:  Ambiguous variables and conflicting methods
*/

// interface Confusable has a constant name and abstract method
interface Confusable {
    String name = "Confusable";

    String confuse();
}//interface Confusable {

// Abstract class Confused has a constant name and abstract method
abstract class Confused {
    public static String name = "Confused";

    abstract Object confuse();
}//abstract class Confused {

// AmbiguousExamples will demonstrate some problems with multiple
// inheritance of type
public class AmbiguousExamples extends Confused implements Confusable {
    public static void main(String[] args) {
        AmbiguousExamples a = new AmbiguousExamples();
        System.out.println("The method confuse returns: " + a.confuse());
    }//public static void main(String[] args) {

    public String confuse() {
        return Confused.name;
    }//public String confuse() {
}//public class AmbiguousExamples implements Confusable {