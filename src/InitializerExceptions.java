import java.io.IOException;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 11: Handling Exception
Topic:  Exceptions, Out of Ordingary
Sub-Topic:  Exceptions in Initializers
*/
class StaticTest {
    public static String currentMessage;

    // Initialized to 0
    public static int currentVal;

    // Static Initializer
    static{
        System.out.println("Initializing class StaticTest");
        try {
            // We force an error for demonstration purposes
            if ((10 / currentVal) > 0) {
                System.out.println("Whoops");
            }//if ((10 / currentVal) > 0) {
        }//try {
        catch (Exception e) {
            System.out.println("Caught the error");
        }//catch (Exception e) {
        finally {
            currentVal=1;
        }//finally {
        currentMessage = "Inside Static Initializer";
    }//static{
}//class StaticTest {

public class InitializerExceptions {
    SubClass() extends InitializerExceptions {
        SubClass() throws Exception{
            super();
        }//SubClass() throws Exception{
    }//SubClass() extends InitializerExceptions {

    // Create an instance initializer block that throws an unchecked exception
    {
        int i = 0;
        if (i == 0) throw new IOException("Whoops");
    }

    InitializerExceptions() throws IOException{
    }//InitializerExceptions() throws IOException{

    // Second constructor without a throws clause
//    InitializerExceptions(String parameterOne){
//        try {
//
//        } catch (IOException e) {
//            System.out.println("I'm ignoring the error");
//        }
//    }
    public static void main(String[] args) {
        System.out.println("Executing main()");
        System.out.println(StaticTest.currentMessage);
        try {
            InitializerExceptions ie = new InitializerExceptions();
        } catch (Exception e) {//try {
            System.out.println("Ignoring the error, " + e.getMessage());
        }//catch (Exception e) {
    }//public static void main(String[] args) {
}//public class InitializerExceptions {