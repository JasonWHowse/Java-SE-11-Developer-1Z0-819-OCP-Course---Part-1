/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Enable Polymorphism by overriding methods.
*/

class BaseClass {
    public void goodMethod() {
        System.out.println("BaseClass executing good method");
    }//public void goodMethod() {

    public void printInformation(CharSequence s) {
        System.out.println("BaseClass prints " + s);
    }//public void printInformation(CharSequence s) {

    public CharSequence getInformation() {
        return getClass().getName();
    }//public CharSequence getInformation() {
}//class BaseClass {

class ExtendedClass extends BaseClass {
    public void goodMethod() {
        super.goodMethod();
        System.out.println("ExtendedClass executing a better method");
    }//public void goodMethod() {

//    public void printInformation(String s) {
//        System.out.println("ExtendedClass prints " + s);
//    }//public void printInformation(String s) {

    public void printInformation(CharSequence s) {
        System.out.println("ExtendedClass prints " + s);
    }//public void printInformation(CharSequence s) {

    public String getInformation() {
        return getClass().getName();
    }//public String getInformation() {
}//class ExtendedClass extends BaseClass {

public class OverrideExample {
    public static void main(String[] args) {
        ExtendedClass e = new ExtendedClass();
        e.goodMethod();
        e.printInformation(e.getInformation());
        e.printInformation((CharSequence) e.getInformation());
    }//public static void main(String[] args) {
}//public class OverrideExample {