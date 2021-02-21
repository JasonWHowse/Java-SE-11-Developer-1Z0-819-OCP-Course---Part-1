/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 7: Creating and Using Methods
Topic: Create Methods and Constructors
Sub-Topic:  Overloaded Methods
*/

class Load {
    public void bestMethod(int i) {
        System.out.println("bestMethod for int");
    }//public void bestMethod(int i) {

    // Add method for parameter Integer
    public void bestMethod(Integer i) {
        System.out.println("bestMethod for Integer");
    }//public void bestMethod(Integer i) {

    // Add method for parameter Number (Integer is a Number)
    public void bestMethod(Number i) {
        System.out.println("bestMethod for Number");
    }//public void bestMethod(Number i) {

    // Add method for parameter Comparable (Integer implements Comparable)
    public void bestMethod(Comparable i) {
        System.out.println("bestMethod for Comparable");
    }//public void bestMethod(Comparable i) {

    // Add method for parameter Object (Integer is of course an Object)
    public void bestMethod(Object i) {
        System.out.println("bestMethod for Object");
    }//public void bestMethod(Object i) {

    // Add method for parameter with an int var args
    public void bestMethod(int... i) {
        System.out.println("bestMethod for var args (int)");
    }//public void bestMethod(int... i) {

    // Add method for parameter with Integer var args
    public void bestMethod(Integer... i) {
        System.out.println("bestMethod for var args (Integer)");
    }//public void bestMethod(Integer... i) {
}//class Load {

public class IsOverloaded {
    public static void main(String[] args) {
        Load n = new Load();
        int myInt = 1;
        Integer myInteger = Integer.valueOf(1);
        n.bestMethod(myInt);
        n.bestMethod(myInteger);
        n.bestMethod((Number) myInteger);
        n.bestMethod((Comparable) myInteger);
        n.bestMethod((Object) myInteger);

//        n.bestMethod(1,2);
        n.bestMethod((new int[]{1,2}));
        n.bestMethod((new Integer[]{1,2}));

    }//public static void main(String[] args) {
}//public class IsOverloaded { 