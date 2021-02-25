/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 11: Handling Exception
Topic:  Describe Exception Handling and types of exceptions
Sub-Topic:  Finally Throws Exception
*/

import java.io.IOException;

public class AFinalTry {
    public static void main(String[] args) {
        someMethodThrowsException();
    }//public static void main(String[] args) {

    public static void someMethodThrowsException() {
        try {
            System.out.println("Doing something");
        } catch (Exception e) {//try {
            throw new IOException("Testing Catch");
        } finally {//catch (Exception e) {
            throw new RuntimeException("Testing finally");
        }//finally {
    }//public static void someMethodThrowsException() throws IOException {
}//public class AFinalTry {