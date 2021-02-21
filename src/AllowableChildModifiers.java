/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Applying Access Modifiers to Attributes
*/

// Create a base class Animal which has one attribute with each
// type of access modifier
class Animal {
    // Each attribute has a different access modifier
    public String name = "Unknown";
    protected String breed = "Unknown";
    String owner = "Unknown";
    private String type = "Unknown";

    public String toString() {
        return owner + "'s " + type + " " + name + " is a " + breed;
    }//public String toString() {
}//class Animal {

// Dog declares exact same attributes as its parent, Animal, but modifies
// the access modifier of each attribute
class Dog extends Animal {

    // type was private on Animal, we declare it public here
    // Less restrictive hiding
    public String type = "Dog";

    // owner was package-private on Animal, we declare it protected here
    // Less restrictive hiding
    protected String owner;

    // breed was protected on Animal, we declare it package-private by
    // default
    // package-private is more restrictive hiding than protected
    String breed;

    // name was public on Animal, we declare it private here
    // More restrictive hiding
    private String name;

    // Constructor to make creating a Dog easy
    Dog(String owner, String name, String breed) {
        this.owner = owner;
        this.name = name;
        this.breed = breed;
    }//Dog(String owner, String name, String breed) {

    public String toString() {
        return super.toString();
    }//public String toString() {
}//class Dog extends Animal {

public class AllowableChildModifiers {
    public static void main(String[] args) {

        Animal a = new Animal();
        System.out.println("Created a generic animal with defaults:");
        System.out.println(a.toString());

        System.out.println("Created a specific dog");
        Dog pug = new Dog("Fran", "Brandy", "Pug");
        System.out.println(pug.toString());

        System.out.println("Pug's type is " + pug.type);
        System.out.println("Pug's breed is " + pug.breed);
        System.out.println("Pug's owner is " + pug.owner);
        a = pug;
        System.out.println("Pug's breed is " + a.breed);
        System.out.println("Pug's owner is " + a.owner);
        System.out.println("Pug's name is " + a.name);
//        System.out.println("Pug's type is " + a.type);
    }//public static void main(String[] args) {
}//public class AllowableChildModifiers { 