/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Access Modifiers
Sub-Topic: Constructors
*/

package pkgOne;

class LevelOneClass {
    // Protected access constructor
    protected LevelOneClass() {
        System.out.println("protected LevelOneClass " +
                "no args constructor");
    }//protected LevelOneClass() {

    // Package-private access constructor
    LevelOneClass(String text) {
        System.out.println("package level LevelOneClass " +
                "single params constructor");
    }//LevelOneClass(String text) {
}//class LevelOneClass {

public class LevelTwoClass extends LevelOneClass {
    // Protected access constructor
    protected LevelTwoClass() {
        System.out.println("protected LevelTwoClass " +
                "no args constructor");
    }//protected LevelTwoClass() {

    // Package-private access constructor
    LevelTwoClass(String text) {
        System.out.println("package level LevelTwoClass " +
                "single params constructor");
    }//LevelTwoClass(String text) {
}//public class LevelTwoClass extends LevelOneClass { 