/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Identify the Scope of a variable
*/

public class TestPerson {
    public static void main(String[] args) {

        // First we'll create a person, JOE using 2 args constructor.
        Person joe = new Person("JOE", "55");

        // Next we'll create a person, using 1 arguments
        Person deb = new Person("DEB", "85");

        // And now the noargs constructor, and using setters
        Person ann = new Person();

        System.out.println(joe);
        System.out.println(deb);
        ann.setAge("21");
        ann.setInstanceName("ANN");
        System.out.println(ann);
    }//public static void main(String[] args) {
}//public class TestPerson {