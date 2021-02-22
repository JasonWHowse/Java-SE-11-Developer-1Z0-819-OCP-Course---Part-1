/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Create and use subclasses and superclasses
*/

package com.petstore;

import java.time.LocalDate;

class Dog extends Animal {

    // Supplement fields
    private int pedigreeId;

    // Hide field on superclass
    private LocalDate chipDate;

    // Constructors are not inherited, create one, pass thru to super
    public Dog(String name, String owner, String breed,
               AnimalType type, int pedigreeId) {
        super(name, owner, breed, type);
        this.pedigreeId = pedigreeId;
    }//public Dog(String name, String owner, String breed,...

    // override toString method and extend functionality of the superclass
    public String toString() {
        String str = super.toString();
        if (pedigreeId > 0) {
            str += " (pedigree Id = " + pedigreeId + ")";
        }//if (pedigreeId > 0) {
        return str;
    }//public String toString() {

    public static void examineAnimal() {
        System.out.println("Examine for breathing problems");
    }//public static void examineAnimal() {

    public LocalDate getChildChipDate() {
        System.out.println("child getChildChipDate");
        return chipDate;
    }//public LocalDate getChildChipDate() {

    // Hides method on parent
    public void setChipDate(LocalDate chipDate) {
        this.chipDate = chipDate;
    }//public void setChipDate(LocalDate chipDate) {
}//class Dog extends Animal {

public class AnimalVisit {
    public static void main(String[] args) {

        // Create a Dog
        Dog pug = new Dog("George", "Ralph", "Pug", Animal.AnimalType.DOG, 775533);

        // Call a method on the superclass from the subclass instance
        pug.setChipDate(LocalDate.now());

        // Call the overridden method (note that toString() is implied
        System.out.println(pug);

        // Call the overridden method
        System.out.println("Chip Date = " + pug.getChipDate());

        // Try to force the call to the parent's method
        Animal a = pug;
        System.out.println("Chip Date = " + a.getChipDate());

        // Call the supplemented method
        System.out.println("Chip Date = " + pug.getChildChipDate());

        // Call the static methods
        Animal.examineAnimal();
        Dog.examineAnimal();
    }//public static void main(String[] args) {
}//public class AnimalVisit {