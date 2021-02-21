/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Operators
Sub-Topic: Binary Operators
*/

public class BinaryOperatorExamples {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;

        // Multiplicative (* / %) operations are evaluated first
        // Before Additive operators (+ -)
        // and evaluated left to right.

        // Could also be written:  a + (e * b) - (f / c) % b;
        int result = a + e * b - f / c % b;
        System.out.println("result for (a + e * b - f / c % b) = "
                + result);

        // Modulus operator (remainder operator) returns remainder
        // of operation. Result is easier to understand when the divisor
        // is greater than dividend
        System.out.println("result for (11 % 10) = " + (11 % 10));

        // The following code will demonstrate examples where
        // dividend < divisor.
        System.out.println("Modulus examples where integer divisor" +
                " > integer dividend");
        for (int i = 0; i <= 9; i += 3) {
            for (int j = 10; j <= 100; j += 30) {
                System.out.println("i (" + i + ") % j (" + j + ")  = "
                        + (i % j));
            }//for (int j = 10; j <= 100; j += 30) {
        }//for (int i = 0; i <= 9; i += 3) {
        System.out.println("Modulus examples where double divisor " +
                "> double dividend");

        // In C and C++, modulus accepts only integral operands but
        // Java accepts Floating point operands as well
        // We see that result still is dividend if divisor > dividend
        for (double i = 0.5; i <= 0.55; i += 0.025) {
            for (double j = 10; j <= 100; j += 30.57) {
                System.out.println("i (" + i + ") % j (" + j + ")  = "
                        + (i % j));
            }//for (double j = 10; j <= 100; j += 30.57) {
        }//for (double i = 0.5; i <= 0.55; i += 0.025) {

        // Modulus with zero divisor using integer operands
        try {
            System.out.println("Modulus with zero divisor (10 % 0) = "
                    + (10 % 0));
        } catch (Exception ex) {//try {
            ex.printStackTrace(System.out);
        }//catch (Exception ex) {

        //Modulus with zero divisor using  double operands
        try {
            System.out.println("Modulus with zero divisor (10.0 % 0.0) = "
                    + (10.0 % 0.0));
        } catch (Exception ex) {//try {
            ex.printStackTrace(System.out);
        }//catch (Exception ex) {

        System.out.println("--- Shift Operators ---");
        // left shift (<<)
        // bit pattern shifted left by 2 places (right operand = 2)
        // 0b0000_0001 becomes 0b0000_0100
        System.out.println("result of left shift (00000001 << 2 ) = "
                + String.format("%8s",Integer.toBinaryString(0b00000001 << 2)).
                replace(' ', '0'));


        // right shift (>>)
        // bit pattern shifted left by 3 places (right operand = 3)
        // 0b10001000 becomes 0b00010001
        System.out.println("result of right shift (10001000 >> 3 ) = "
                + String.format("%8s",Integer.toBinaryString(0b10001000 >> 3)).
                replace(' ', '0'));


        // >>>  right shift unsigned
        System.out.println("result of unsigned right shift (" +
                "10000010_00000010_00000010_00000010 >>> 1 ) = "
                + String.format("%32s",Integer.toBinaryString(
                0b10000010_00000010_00000010_00000010 >>> 1)).
                replace(' ', '0'));

        //  Compare right shift unsigned to right shift results
        System.out.println("result of signed right shift   (" +
                "10000010_00000010_00000010_00000010 >>  1 ) = "
                + String.format("%32s",Integer.toBinaryString(
                0b10000010_00000010_00000010_00000010 >> 1)).
                replace(' ', '0'));

        // Relationship operators <, <=
        // | - logical or
        // || - conditional logical or
        System.out.println("\nResults using relationship operators" +
                " and logical or operators (| ||) ");
        e = 0;
        f = 0;
        if ((e++ <= f) | (++e < f)) {
            System.out.println("Evaluation [(e++ <= f) | (++e < f)] met");
        }//if ((e++ <= f) | (++e < f)) {
        System.out.println("Logical | (OR) will evaluate both expressions: e = "
                + e + ", and f = " + f);

        e = 0;
        f = 0;
        if ((e++ <= f) || (++e < f)) {
            System.out.println("Evaluation [(e++ <= f) || (++e < f)] met");
        }//if ((e++ <= f) || (++e < f)) {
        System.out.println("Conditional Logical || evaluates only first " +
                "expression if it evaluates to true: e = "
                + e + ", and f = " + f);

        e = 0;
        f = 0;
        if ((e++ < f) || (++e <= f)) {
            System.out.println("Evaluation [(e++ <= f) || (++e < f)] met");
        }//if ((e++ < f) || (++e <= f)) {
        System.out.println("Conditional Logical || (OR) will evaluate" +
                " both expressions ONLY if first expression is false : e = "
                + e + ", and f = " + f);


        System.out.println("\nResults using relationship operators" +
                " and logical or operators (& &&) ");

        a = 0;
        b = 10;
        if ((++a > b) & (++a >= b)) {
            System.out.println("Evaluation [(++a > b) & (++a >= b)] met");
        }//if ((++a > b) & (++a >= b)) {

        System.out.println("Logical & (AND) will evaluate both expressions: a = "
                + a + ", and b = " + b);

        a = 0;
        b = 10;
        if ((++a > b) && (++a >= b)) {
            System.out.println("Evaluation [(++a > b) && (++a >= b)] met");
        }//if ((++a > b) && (++a >= b)) {

        System.out.println("Conditional && (AND) will evaluate only first " +
                "expression if it evaluates to false: a = "
                + a + ", and b = " + b);

        a = 0;
        b = 0;
        if ((++a > b) && (++a >= b)) {
            System.out.println("Evaluation [(++a > b) && (++a >= b)] met");
        }//if ((++a > b) && (++a >= b)) {}

        System.out.println("Conditional && (AND) will evaluate both " +
                "expressions if first evaluates to true: a = "
                + a + ", and b = " + b);
    }
} 