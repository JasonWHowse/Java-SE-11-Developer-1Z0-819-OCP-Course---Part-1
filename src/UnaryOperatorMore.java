/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Operators
Sub-Topic: Unary Minus, Plus, Bitwise Complement and Logical Complement
*/

public class UnaryOperatorMore {
    public static void main(String[] args) {
        // unary Minus
        int a = 1, b = -a;

        // Note that the value of actual operand a does not change
        System.out.println("a = " + a + "; b = " + b);
        a = -1;
        b = -a;
        System.out.println("a = " + a + "; b = " + b);

        //  Unary Plus
        a = 1;
        b = +a;  // Not to mistaken for b+=a;
        System.out.println("a = " + a + "; b = " + b);
        a = -1;
        b = +a;
        System.out.println("a = " + a + "; b = " + b);

        // Bitwise Complement Operator  ~a
        // when value is x then ~x = (-x)-1;
        int bin1 = 0b00000000_00000000_00000000_00000000;
        int bin2 = ~bin1;

        System.out.println("bin1 = " + bin1 +
                " (" + Integer.toBinaryString(bin1) + "), " +
                "bin2 = " + bin2 +
                " (" + Integer.toBinaryString(bin2) + ")");


        // Logical Complement Operator  !a
        boolean myBoolean = false;
        boolean newBoolean = !myBoolean;
        System.out.println("myBoolean = " + myBoolean +
                ", the opposite is = " + newBoolean);
    }//public static void main(String[] args) {
}//public class UnaryOperatorMore { 