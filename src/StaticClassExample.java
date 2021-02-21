/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 7: Creating and Using Methods
Topic: Create Methods and Constructors
Sub-Topic: static keyword
*/

// The UtilityClass defines a static abstract class,
// a static field with the type of the abstract class
// and a method that is a pass thru to the abstract method on
// the abstract class
class UtilityClass {
    // nested static abstract class
    static abstract class Logger {
        abstract void log(String logMessage);
    }//static abstract class Logger {

    // static field typed to the nested static abstract class
    static Logger logger;

    // static method (pass through method to the method on
    // the abstract class
    static void log(String logMessage) {
        logger.log(logMessage);
    }//static void log(String logMessage) {
}//class UtilityClass {

// This class extends the UtilityClass and implements the log method
class CustomLogger extends UtilityClass.Logger {
    // overrides and implements the abstract method from
    // the abstract class
    void log(String logMessage) {
        logMessage = doSomethingCustomBeforeLogging(logMessage);
        System.out.println("I want to log " + logMessage
                + " my own great way");
    }//void log(String logMessage) {

    // A custom private method used in log method
    private String doSomethingCustomBeforeLogging(String logMessage) {
        // code might search, replace, persist, whatever...
        logMessage = "'" + logMessage + "' (" + logMessage.split(" ").length
                + " words)";
        return logMessage;
    }//private String doSomethingCustomBeforeLogging(String logMessage) {
}//class CustomLogger extends UtilityClass.Logger {

// This code tests the code from above.
public class StaticClassExample {
    public static void main(String[] args) {
        UtilityClass.logger = new CustomLogger();
        UtilityClass.log("An important message");
    }//public static void main(String[] args) {
}//public class StaticClassExample {