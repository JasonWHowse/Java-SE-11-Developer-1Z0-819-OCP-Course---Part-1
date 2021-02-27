/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 12: Understanding Modules
Topic: Declare modules and enable access between modules
*/
package org.pkg.concrete;

import org.pkg.appglobals.ApplicationConstants;
import org.pkg.util.Countable;

public class Couple implements Countable {

    // Constructor calls the countMe method
    public Couple() {
        countMe();
    }//public Couple() {

    // implement countMe method from the interface
    public void countMe() {
        ApplicationConstants.addCounter();
        ApplicationConstants.addCounter();
    }//public void countMe() {
}//public class Couple implements Countable {