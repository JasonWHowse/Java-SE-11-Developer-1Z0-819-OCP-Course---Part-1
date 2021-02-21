/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 6: Describing and Using Objects and Classes
Topic: Declare and Instantiate Objects
Sub-Topic: Out of the Ordinary
*/
class ASuperClass {
    String name;

    // Constructor for Super Class
    ASuperClass() {
        System.out.println("Parent constructor executes");
    }//ASuperClass() {

    public void setName(String name) {
        this.name = name;
    }//public void setName(String name) {

    public String toString() {
        return "My name is " + this.name;
    }//public String toString() {
}//class ASuperClass {

class ASubClass extends ASuperClass {

    // Constructor for Sub Class
    ASubClass() {
        System.out.println("Child no args constructor executes");
        setName(name);
    }//ASubClass() {

    // Constructor for Sub Class
    ASubClass(String name) {
        this();
        System.out.println("Child single argument constructor executes");
        setName(name);
    }//ASubClass(String name) {

    // Initializer code
    {
        this.name = "Override";
        System.out.println("Child initializer executes");
        System.out.println(this);
    }
}//class ASubClass extends ASuperClass {

public class InitializerOddsAndEnds {
    public static void main(String[] args) {
        ASubClass joe = new ASubClass("Joe");
        System.out.println(joe);
    }//public static void main(String[] args) {
}//public class InitializerOddsAndEnds { 