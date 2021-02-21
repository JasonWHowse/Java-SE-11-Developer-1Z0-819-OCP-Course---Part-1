/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Applying Access Modifiers to Methods
*/

// Employee class has a method for each type of modifier...
class Employee {
    public void printPublic() {
        System.out.println("An Employee can make a public statement");
    }//public void printPublic() {

    protected void printProtected() {
        System.out.println("An Employee can make a protected statement");
    }//protected void printProtected() {

    void printPackage() {
        System.out.println("An Employee can make a package statement");
    }//void printPackage() {

    private void printPrivate() {
        System.out.println("An Employee can make a private statement, " +
                "but only the employee can make it accessible through" +
                " other means..");
    }//private void printPrivate() {

    // blog method is pass through to the private printPrivate method
    protected void blog() {
        printPrivate();
    }//protected void blog() {
}//class Employee {

// subclass of Employee overrides some of Boss's methods,
// changing access modifiers
class Boss extends Employee {
    // making a private method on parent public on child
    public void printPrivate() {
        System.out.println("A Boss's private statements can " +
                "be made public now");
    }//public void printPrivate() {

    // making a package-private method on parent protected on child
    protected void printPackage() {
        System.out.println("A Boss's packaged speech can " +
                "be shared with his children as well now.");
    }//protected void printPackage() {
//    private void printPublic() {
//        System.out.println("A Boss's public speech cannot be made private");
//    }//private void printPublic() {
//
//    void printProtected() {
//        System.out.println("A Boss's protected speech cannot be packaged");
//    }//void printProtected() {
}//class Boss extends Employee {

public class AllowableOverrideModifiers {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.printPublic();
        e.printProtected();
        e.printPackage();

        // Employee use's blog method to provide controlled
        // access to its printPrivate method
        e.blog();

        Boss b = new Boss();
        b.printPackage();
        b.printPrivate();
    }//public static void main(String[] args) {
}//public class AllowableOverrideModifiers { 