/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Operators
Sub-Topic: Out of the Ordinary
*/

public class MoreOddities {
    public static void main(String[] args) {
        int number = 10;
        int result = 0;
        System.out.println("----------  First Test --------------");
        // result = --number - number--
        // result always resolves to zero
        // Test a couple of instances with a for loop
        for (int i = 10; i <= 50; i += 10) {
            number = i;
            result = --number - number--;

            System.out.println("i = " + i + ", number = " + number +
                    ", result = " + result);
        }//for (int i = 10; i <= 50; i += 10) {

        System.out.println("----------  Second Test --------------");
        // int result = number-- - --number;
        // result is always the number 2
        // Test with a few examples in a for loop
        for (int i = 10; i <= 50; i += 10) {
            number = i;
            result = number-- - --number;
            System.out.println("i = " + i + ", number = " + number +
                    ", result = " + result);
        }//for (int i = 10; i <= 50; i += 10) {

        System.out.println("----------  Third Test --------------");
        // Just complicating matters a bit more.
        for (int i = 10; i <= 20; i += 10) {
            number = i;
            result = number-- - number++ * --number;
            System.out.println("i = " + i + ", number = " +
                    number + ", result = " + result);
        }//for (int i = 10; i <= 20; i += 10) {

        System.out.println("----------  Fourth Test --------------");
        // (number--) == (number += 1)
        // evaluates to true!
        number = 10;
        boolean isEqual = (number--) == (number += 1);
        System.out.println("isEqual = " + isEqual +
                ", and number = " + number);

        System.out.println("----------  Final Test --------------");
        // number = number--;
        // value in number stays unchanged
        number = 10;
        number = number--;
        System.out.println("number = " + number);
    }//public static void main(String[] args) {
}//public class MoreOddities { 