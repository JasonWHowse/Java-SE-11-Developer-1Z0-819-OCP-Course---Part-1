/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Distinguish class inheritance from interface inheritance
Sub-Topic: Abstract Class and Interface Comparisons
*/
package interfaces;

// We have a global class keeping track of instance counts
class GlobalInformation {
    public static int DogCount;
    public static int CatCount;
    public static int TreeCount;
}

// Create an interface to support the countMyInstances method
interface Countable {
    public abstract void countMyInstances();
}

// Animal implements Countable
abstract class Animal implements Countable {
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        countMyInstances();
    }

    private String name;
    private String type;
}

// We add a concrete Animal called Dog which must implement
// countMyInstances()
class Dog extends Animal {

    public Dog(String name, String type) {
        super(name, type);
    }

    public void countMyInstances() {
        GlobalInformation.DogCount++;
    }
}

// We add a concrete Animal called Cat which must implement
// countMyInstances()
class Cat extends Animal {

    public Cat(String name, String type) {
        super(name, type);
    }

    public void countMyInstances() {
        GlobalInformation.CatCount++;
    }
}

// We add a disparate class that will also implement
// countMyInstances()
class Tree implements Countable {
    public Tree() {
        countMyInstances();
    }

    public void countMyInstances() {
        GlobalInformation.TreeCount++;
    }
}

// Our main method will create some objects of disparate types
// and verify that our counters are being incremented.
public class CompareExamples2 {
    public static void main(String[] args) {
        Dog d;
        Cat c;
        Tree t;
        for (int i = 0; i < 5; i++) {
            d = new Dog("DOG_" + (i + 1), "dog");
        }
        for (int i = 0; i < 7; i++) {
            c = new Cat("CAT_" + (i + 1), "cat");
        }
        for (int i = 0; i < 3; i++) {
            t = new Tree();
        }
        System.out.println("Number of Cat instances = "
                + GlobalInformation.CatCount);
        System.out.println("Number of Dog instances = "
                + GlobalInformation.DogCount);
        System.out.println("Number of Tree instances = "
                + GlobalInformation.TreeCount);
    }
}