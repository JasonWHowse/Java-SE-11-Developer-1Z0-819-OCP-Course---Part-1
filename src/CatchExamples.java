/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 11: Handling Exception
Topic:  Describe Exception Handling and types of exceptions
Sub-Topic:  Catch Examples
*/

import java.io.IOException;

class CustomThrowable extends Throwable {
    CustomThrowable(String message) {
        super(message);
    }//CustomThrowable(String message) {
}//class CustomThrowable extends Throwable {

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }//CustomException(String message) {
}//class CustomException extends Exception {

class SuperClass {
    public void methodSuperClass() throws CustomException {

    }//public void methodSuperClass() throws CustomException {
}//class SuperClass {

class SubClass extends SuperClass {
    public void methodSubClass() {
        try {
            methodSuperClass();
        } catch (Exception CustomException) {//try
            // ignore it
        }//catch (Exception CustomException) {
    }//public void methodSubClass() {
}//class SubClass extends SuperClass {

public class CatchExamples {
    public static void main(String[] args) {
        CatchExamples ce = new CatchExamples();

        // Reminder, Throwable or custom subclasses of Throwable and any
        // RuntimeException descendants are checked.

        try {
            SubClass c = new SubClass();
            c.methodSuperClass();
            ce.testError();

        } catch (ArithmeticException e) {//try {
            e = new ArithmeticException("This works");
            throw e;
        } catch (CustomException | RuntimeException | IOException e) {//catch (ArithmeticException e) {
            throw new RuntimeException("So many exceptions, so little time");
        }//catch (CustomException | RuntimeException | IOException e) {

    }//public static void main(String[] args) {

    private void testError() throws IOException {
        // We'll complete this later
    }//private void testError() throws IOException {
}//public class CatchExamples {