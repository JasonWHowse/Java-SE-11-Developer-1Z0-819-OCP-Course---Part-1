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
        return instanceName + " is " + age + " years old (" + getAgeGroupClassification() + ", " + getDecade(Integer.parseInt(this.age)) + ")";
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

    public String getDecade(int age) {
        String decadeString = "";

        // This variable holds the maximum decade
        int decadeNumber = age / 10;

        // Add variable j
        int j = 0;
        for (int i = j = 0; i < (decadeNumber + 1); i++, j++) {
            // local loop block variable named decade, scope is loop
            String decade = "Decade " + (age / 10);
            if (i == (decadeNumber)) {
                decadeString = decade;
            }//if (i == (decadeNumber)) {
        }//for (int i = 0; i < (decadeNumber + 1); i++, j++) {
        int modyear = age % 10;
        decadeString += ", Year " + modyear;
        return decadeString;
    }//public String getDecade(int age) {
}//public class Person {