/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 12: Understanding Modules
Topic: Declare modules and enable access between modules
*/

package org.pkg.entity;

import org.pkg.appglobals.ApplicationConstants;
import org.pkg.util.Countable;

public class BaseEntity implements Countable {

    // Constructor calls the countMe method
    public BaseEntity() {
        countMe();
    }//public BaseEntity() {

    // main method creates several objects then prints out how many
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            BaseEntity b1 = new BaseEntity();
        }//for (int i = 0; i < 5; i++) {
        System.out.println(ApplicationConstants.APP_NAME + " created " +
                ApplicationConstants.getCounter() + " objects ");
    }//public static void main(String[] args) {

    // countMe implements Countable.countMe method
    public void countMe() {
        ApplicationConstants.addCounter();
    }//public void countMe() {
}//public class BaseEntity implements Countable {