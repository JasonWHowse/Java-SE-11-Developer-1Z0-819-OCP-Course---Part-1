/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 11: Handling Exception
Topic:  Describe Exception Handling and types of exceptions
Sub-Topic:  Methods with throws clause
*/

public class ThrowsClauseExample {
    // Custom RuntimeException
    class ACustomRuntimeException extends RuntimeException {
        ACustomRuntimeException(String message) {
            super(message);
        }//ACustomRuntimeException(String message) {
    }//class ACustomRuntimeException extends RuntimeException {

    // Custom Exception (not RuntimeException)
    class ACustomCheckedException extends Exception {
        ACustomCheckedException(String message) {
            super(message);
        }//ACustomCheckedException(String message) {

    }//class ACustomCheckedException extends Exception {

    // Custom Throwable
    class ACustomThrowable extends Throwable {
        ACustomThrowable(String message) {
            super(message);
        }//ACustomThrowable(String message) {

    }//class ACustomThrowable extends Throwable {

    // Custom Error
    class AnError extends Error {
        AnError(String message) {
            super(message);
        }//AnError(String message) {

    }//class AnError extends Error {

    public static void main(String[] args){
        ThrowsClauseExample t = new ThrowsClauseExample();

        // For loop allows us to test each exception thrown
        for (int i = 0; i < 4; i++) {
            try {
                switch (i) {
                    case 0:
                        t.methodOne();
                        break;
                    case 1:
                        t.methodTwo();
                        break;
                    case 2:
                        t.methodThree();
                        break;
                    case 3:
                        t.methodFour();
                        break;
                }//switch (i) {
                // Catch clause is inside for loop, so execution of
                // for loop continues after we catch the exception
            } catch (ACustomRuntimeException are) {// try{
                System.out.println("In the catch clause for" +
                        " ACustomRuntimeException in main(): " +
                        are);
            } catch (RuntimeException e) {//catch (ACustomRuntimeException are) {
                System.out.println("In the catch clause of main(): " +
                        e);
            } catch (ACustomThrowable te) {//catch (RuntimeException e) {
                System.out.println("In the catch clause for" +
                        " ACustomThrowable in main(): " +
                        te);
            } catch (AnError ae) {//catch (ACustomThrowable te) {
                System.out.println("In the catch clause for" +
                        " AnError in main(): " +
                        ae);
            }//catch (AnError ae) {
        }//for (int i = 0; i < 4; i++) {
    }//public static void main(String[] args) {

    // Unchecked Runtime Exception Thrown
    private void methodOne() {
        throw new ACustomRuntimeException("Error in methodOne");
    }//private void methodOne() {

    // Checked - must satisfy catch or specify - here we catch.
    private void methodTwo() {
        try {
            throw new ACustomCheckedException("Error in methodTwo");
        } catch (Exception e) {// try{
            System.out.println("In the catch clause of methodTwo(): " +
                    e);
            throw new ACustomRuntimeException("Changed methodTwo to throw ACustomRuntimeException");
        }//catch (Exception e) {
    }//private void methodTwo() {

    // Checked - must satisfy catch or specify - here we specify
    // in the throws clause
    private void methodThree() throws ACustomThrowable, ACustomRuntimeException {
        if (10%3==0)
            throw new ACustomThrowable("Error in methodThree");
        else
            throw new ACustomRuntimeException ("Error in methodThree");
    }//private void methodThree() throws ACustomThrowable, ACustomRuntimeException {

    // Unchecked Error thrown
    private void methodFour() {
        throw new AnError("Error in methodFour");

    }//private void methodFour() {

}//public class ThrowsClauseExample {