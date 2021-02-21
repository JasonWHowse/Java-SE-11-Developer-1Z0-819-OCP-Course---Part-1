/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Operators
Sub-Topic: Ternary Operator
*/

public class BinaryOperatorExamples2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 1;

        // == checks equality of values for primitive data types
        if (a == c) {
            System.out.println("a and c primitive values are equal");
        }//if (a == c) {
        if (a != b) {
            System.out.println("a and b are not equal because primitive" +
                    " data values are not equal");
        }//if (a != b) {

        // == checks equality of String literals or String objects
        String s1 = "hello";
        String s2 = new String(s1);
        String s3 = s2.intern();
        if (s1 == s3) {
            System.out.println("Strings are equal if they are interned or are String literals");
        }//if (s1 == s3) {
        if (s1 != s2) {
            System.out.println("Otherwise String objects are not equal");
        }//if (s1 != s2) {

        Object o1 = s1;
        Object o2 = s1;
        Object o3 = new String(s1);
        if (o1 == o2) {
            System.out.println("Objects are equal if they reference same object");
        }//if (o1 == o2) {
        if (o1 != o3) {
            System.out.println("Otherwise  objects are not equal");
        }//if (o1 != o3) {

        System.out.println("\n--- Bitwise Operators, AND, OR, XOR ---");

        System.out.println("result of bitwise AND (0b0000_0000 & 0b1111_1111) = "
                + String.format("%8s", Integer.toBinaryString(
                0b0000_0000 & 0b1111_1111)).replace(' ', '0'));

        System.out.println("result of bitwise AND (0b1111_0000 & 0b1111_1111) = "
                + String.format("%8s", Integer.toBinaryString(
                0b1111_0000 & 0b1111_1111)).replace(' ', '0'));

        System.out.println("result of bitwise OR (0b0000_0000 | 0b1111_1111) = "
                + String.format("%8s", Integer.toBinaryString(
                0b0000_0000 | 0b1111_1111)).replace(' ', '0'));

        System.out.println("result of bitwise OR (0b0000_0000 | 0b0000_1111) = "
                + String.format("%8s", Integer.toBinaryString(
                0b0000_0000 | 0b0000_1111)).replace(' ', '0'));

        System.out.println("result of bitwise XOR (0b0000_0000 ^ 0b1111_1111) = "
                + String.format("%8s", Integer.toBinaryString(
                0b0000_0000 ^ 0b1111_1111)).replace(' ', '0'));

        System.out.println("result of bitwise XOR (0b0000_1111 ^ 0b0000_1111) = "
                + String.format("%8s", Integer.toBinaryString(
                0b0000_1111 ^ 0b0000_1111)).replace(' ', '0'));

        System.out.println("\nResults from assignment operators...");
        // Assignment Operator
        byte b1 = 2;
        byte b2 = 2;
        byte b3 = 5;

        // Multiplicative Assignments, note that variables NOT promoted
        b1 *= 2;
        System.out.println("b1 (after b1 *= 2 ) = " + b1);
        b2 /= 2;
        System.out.println("b2 (after b2 /= 2) = " + b2);
        b3 %= 2;
        System.out.println("b3 (after b3 %= 2) = " + b3);

        // Additive Assignments, note that variables NOT promoted
        b1 = 2;
        b2 = 2;
        b1 += 2;
        System.out.println("b1 (after b1 += 2) = " + b1);
        b2 -= 2;
        System.out.println("b2 (after b2 -= 2) = " + b2);

        // Assignment operators with bit shift
        b1 = 16;
        b2 = 16;
        b3 = 16;
        b1 <<= 1;
        System.out.println("b1 (after b1 <<= 1) = " + b1);
        b2 >>= 1;
        System.out.println("b2 (after b2 >>= 1) = " + b2);
        b3 >>>= 1;
        System.out.println("b3 (after b3 >>>= 1) = " + b3);

        // Assignment operators with bit and, xor, or
        b1 = 0b0000;
        b1 &= 0b1111;
        System.out.println("b1 (after b1 &= 0b1111 ) = " + b1);
        b1 |= 0b1111;
        System.out.println("b1 (after b1 |= 0b1111 ) = " + b1);
        b1 ^= 15;
        System.out.println("b1 (after b1 ^= 15 )= " + b1);

        // This code results in an overflow
        byte testByte = 127;
        testByte += 1;
        System.out.println("testByte = " + testByte);

//        // This code results in a compiler error
//        byte testByte2 = 127;
//        testByte2 = testByte2 + 1;
//        System.out.println("testByte2 = " + testByte2);
    }//public static void main(String[] args) {
}//public class BinaryOperatorExamples2 { 