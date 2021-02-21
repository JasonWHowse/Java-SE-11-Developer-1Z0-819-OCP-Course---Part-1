/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Operators
Sub-Topic: Unary Operators
*/

public class UnaryOperator {
    public static void main(String[] args) {
        System.out.println("----------Test 1 ----------");
        int a = 0;
        // If you do no assignment and the operator is not participating
        // in a more complex expression the following statements are the
        // same.  the value in variable a gets incremented by 1
        a = 1;
        ++a;  // a = a+1
        System.out.println("a after ++a = " + a);
        a = 1;
        a++;  // a = a+1
        System.out.println("a after a++ = " + a);

        // What happens if we do this?
        System.out.println("----------Test 2 ----------");
        a = 1;
        System.out.println("a after ++a = " + ++a);
        a = 1;
        System.out.println("a after a++ = " + a++);
        System.out.println("And now the value of a is: " + a);

        System.out.println("----------Test 3 ----------");
        // Let's look at postfix increment in a variable declaration
        a = 1;
        int a2 = a++;
        System.out.println("The value of a is " + a);
        System.out.println("The value of a2 is " + a2);

        // Let's look at postfix in an expression...
        a = 1;
        if (++a == 1) {
            System.out.println("If Statement, now the value of a is " + a);
        }

        System.out.println("----------End 3 ----------");

        System.out.println("----------Test 4 ----------");
        int b = 5;
        int loopiterations = 0;
        while (--b > 0) {  // Use a prefix decrement
            loopiterations++;
        }//while (--b > 0) {
        System.out.println("Prefix decrement operator used, loopiterations = " +
                loopiterations + ", b = " + b);

        // Reset values, all things equal except the type of increment operator
        b = 5;
        loopiterations = 0;
        while (b-- > 0) {  // Use a postfix decrement
            loopiterations++;
        }//while (b-- > 0) {
        System.out.println("Postfix decrement operator used, loopiterations = " +
                loopiterations + ", b = " + b);
    }//public static void main(String[] args) {
}//public class UnaryOperator { 