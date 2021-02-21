/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 7: Creating and Using Methods
Topic: Create Methods and Constructors
Sub-Topic: Overloaded Methods
*/
class WhichOne {
    public String thisOne(Integer i) {
        return "Integer matched";
    }//public String thisOne(Integer i) {

    public String thisOne(long i) {
        return "long matched";
    }//public String thisOne(long i) {

    public String thisOne(short s) {
        return "short matched";
    }//public String thisOne(short s) {

    public String thisOne(char... c) {
        return "char matched";
    }//public String thisOne(char... c) {

    // Adding a method with matching wrapper
    public String thisOne(Character c) {
        return "Character matched";
    }//public String thisOne(Character c) {
}//class WhichOne {

public class OverloadMatches {
    public static void main(String[] args) {
        WhichOne whichOne = new WhichOne();
        char c = 'a';
        System.out.println("Method (" + whichOne.thisOne(c) +
                ") was executed for " + c);
    }//public static void main(String[] args) {
}//public class OverloadMatches { 