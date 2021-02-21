/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Loops
Sub-Topic: While and Do/While Loops
*/

public class WhileLoop {
    public static void main(String[] args) {
        // set up a boolean that while be the condition for our while loop
        boolean keepGoing = true;
        int iterations = 0;

        while (keepGoing) {
            if (++iterations > 2) break;
            if(iterations == 2) continue;
            System.out.println("Iteration: " + iterations +
                    ", keepGoing = " + keepGoing);
            do {

                System.out.println("--- Doing something in the nested loop," +
                        " iterations =" + iterations);
                System.out.println("--- END OF DO WHILE LOOP");
            } while (iterations < 0);

        }  // end while //while (keepGoing) {
    }//public static void main(String[] args) {
}//public class WhileLoop {