Skip to content
        Search or jump to…

        Pull requests
        Issues
        Marketplace
        Explore

@JasonWHowse 
This repository has been archived by the owner. It is now read-only.
        JasonWHowse
        /
        Scope-Java-SE-11-Developer-1Z0-819-OCP-Course---Part-1
        Archived
        1
        00
        Code
        Issues
        Pull requests
        Actions
        Projects
        Wiki
        Security
        Insights
        Settings
        S03.21. Scope

        master
@JasonWHowse
JasonWHowse committed 9 days ago
        1 parent 010d416 commit 13f90ce3472e0f96a11f6145601a5b6176641263
        Showing  with 114 additions and 0 deletions.
        89  src/Person.java
@@ -0,0 +1,89 @@
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Identify the Scope of a variable.
*/

public class Person {
    static String name = "UNKNOWN";  // Class Variable
    String instanceName = "UNKNOWN"; // Instance Variable;
    String age = "25";  // Instance Variable initialized;

    // No Args Constructor
    public Person() {}

    // Single Parameter Constructor.
    public Person(String age) {
        // Constructors are perfect examples of how a method parameter
        // name can have same name as class or instance variable name.

        // In this constructor,  the Person instance age does not get
        // set at all, because age not qualified by 'this'.
        // This is a common mistake and may be tested on exam
        age = age;
    }//public Person(String age) {

    // Two Args Constructor
    public Person(String name, String age) {
        // constructor parameters are named and typed the same as the
        // class variable 'name' and the instance variable 'age'

        // Correctly setting object's age using 'this' qualifier
        this.age = age;

        // instanceName is an instance variable and has different
        // name from the parameter which will be assigned to it, so
        // this not required, but good practice to use it

        // Also setting static variable name in same assignment
        // statement
        this.instanceName = Person.name = name;
    }//public Person(String name, String age) {

    // Simple setter for age
    public void setAge(String age) {
        // method sets instance variable age to the parameter passed.
        this.age = age;
    }//public void setAge(String age) {

    // Simple setter for instanceName
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }//public void setInstanceName(String instanceName) {

    @Override
    public String toString() {
        // instance and class variable names have scope within all
        // non-static methods of the enclosing class, no qualifier
        // required.   Qualifiers do help readability though
        return instanceName + " is " + age + " years old (" + getAgeGroupClassification() + ")";
    }//public String toString() {

    // This method tests local variable declaration in if/else blocks
    public String getAgeGroupClassification() {

        // Declaring a local variable ageClassification, initializing to "GenY"
        String ageClassification = "GenY";

        // This local variable age 'shadows' the instance variable age
        int age = Integer.parseInt(this.age);

        if (age >= 95) {
            ageClassification = "The Greatest Generation";
        } else if (age >= 75) {//if (age >= 95) {
            ageClassification = "The Silent Generation";
        } else if (age >= 55) {//else if (age >= 75) {
            ageClassification = "Baby Boomer";
        } else if (age >= 40) {//else if (age >= 55) {
            ageClassification = "GenX";
        } else if (age >= 20) {//else if (age >= 40) {
            ageClassification = "Millenial";
            String ageType = "";
            if (age >= 21) {
                ageType = "Voting ";
            }//if (age >= 21) {
            ageClassification = ageType + ageClassification;
        }//else if (age >= 20) {
        return ageClassification;
    }//public String getAgeGroupClassification() {
}//public class Person { 
 25  src/TestPerson.java
@@ -0,0 +1,25 @@
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
0 comments on commit 13f90ce
@JasonWHowse
Write
        Preview
        This repository has been archived.

        You’re receiving notifications because you’re watching this repository.
        © 2021 GitHub, Inc.
        Terms
        Privacy
        Security
        Status
        Docs
        Contact GitHub
        Pricing
        API
        Training
        Blog
        About
