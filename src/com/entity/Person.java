/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Applying Encapsulation Principles to a class
Sub-Topic:
*/

package com.entity;

// Person 'Bean'
public class Person {
    // We declare some private attributes
    private String name;
    private StringBuilder address;
    private int age;

    // We have a constructor for easy creation of Person and
    // population of its attributes
    public Person(String name, StringBuilder address, int age) {
        this.name = name;
        this.address = new StringBuilder(address);
        this.age = age;
    }//tringBuilder address, int age) {

    public String getName() {
        return name;
    }//public String getName() {

    public void setName(String name) {
        this.name = name;
    }//public void setName(String name) {

    public StringBuilder getAddress() {
        return address;
    }//public StringBuilder getAddress() {

    public void setAddress(StringBuilder address) {
        this.address = address;
    }//public void setAddress(StringBuilder address) {

    public int getAge() {
        return age;
    }//public int getAge() {

    public void setAge(int age) {
        this.age = age;
    }//public void setAge(int age) {

    // Customize toString method
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", age=" + age +
                '}';
    }//public String toString() {
}//public class Person { 