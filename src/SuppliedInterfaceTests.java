/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10:  Section 10: Programming Abstractly Through Interfaces
Topic: Lambda Expressions
Sub-Topic: Functional Interfaces in the java.util.function package.
*/

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SuppliedInterfaceTests {
    public static void main(String[] args) {

        // Set up some test data
        String[] dictionary = {"Angry", "Apple", "Art",
                "Ball", "Box", "Bump",
                "Cap", "Car", "Cone",
                "Dart", "Dog", "Duck"};

        // -- Consumer Example
        // Method returns no result, just does something on
        // the parameter passed
        Consumer<String> str = s -> {
            StringBuilder sb = new StringBuilder(s);
            sb.insert(0, "MyApplication: SuppliedInterfaceTests : ");
            sb.insert(0, LocalDateTime.now().toLocalTime() + ": ");
            System.out.println(sb);
        };//Consumer<String> str = s -> {
        str.accept("I want to log this statement");

        // -- Predicate Example
        // Method returns a boolean, accepts one parameter
        Predicate<String> aWords = p -> p.indexOf("A") == 0;
        ArrayList<String> a = new ArrayList(Arrays.asList(dictionary));
        // demonstrate with ArrayList.removeIf method which accepts a
        // Predicate as a parameter
        a.removeIf(aWords);
        System.out.println(a);

        // Now, we demonstrate test method on Predicate
        String apple = "Apple";
        if (aWords.test(apple)) {
            System.out.println(apple + " starts with an A");
        }//if (aWords.test(apple)) {

        // -- Supplier Example
        // Method returns an object, accepts no parameter
        Supplier<String> stringSupplier =
                () -> new String("returning a new String Object");
        System.out.println("stringSupplier.get() = " + stringSupplier.get());

        // -- Function Example
        // Method returns a result, and accepts one parameter
        Function<String, String> funkyFunction = (s) -> {
            s = s.repeat(5);
            return s;
        };//Function<String, String> funkyFunction = (s) -> {

        System.out.println("funkyFunction.apply() = "
                + funkyFunction.apply("oh no "));

    }//public static void main(String[] args) {
}//public class SuppliedInterfaceTests {