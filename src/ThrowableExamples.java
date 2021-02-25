/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 11: Handling Exception
Topic:  Describe Exception Handling and types of exceptions
Sub-Topic:  Review
*/

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;

public class ThrowableExamples {
    public static void main(String[] args) {
        ThrowableExamples te = new ThrowableExamples();
        String filename = "This_File_Does_Not_Exist.out";

        te.throwAnError();
        // Try to open file with filename defined above
        try {
            FileInputStream f =
                    new FileInputStream(filename);

        }//try {  // This statement catches anything thrown at you.
        catch (Throwable error) {
            // Check to see if it's an IOException and print something
            if (error instanceof IOException) {
                System.out.println("Something went wrong with the" +
                        " processing of " + filename);
            }//if (error instanceof IOException) {

            printErrorStructure(error);
        }//catch (Throwable error) {
    }//public static void main(String[] args) {

    // This method will just print the hierarchy of the exception
    public static void printErrorStructure(Object o) {
        Class parent = o.getClass();
        String prefix = "";
        System.out.println("Error caught was: ");
        do {
            System.out.println(prefix + " " + parent.getName());
            prefix += "--";
            parent = parent.getSuperclass();
            if (parent == null) break;

        }//do {
        while (parent.getSuperclass() != null);
    }//public static void printErrorStructure(Object o) {

    private void throwAnError() throws IOError {
        throw new IOError(new Throwable("Testing"));
    }//private void throwAnError() throws IOError {
}