/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Declare and Use List and ArrayList instances;
Sub-Topic:  Exploring toArray() method
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayExamples {
    public static void main(String[] args) {

        // testValue will be used to access a single value in returned
        // array
        int testValue = 0;

        // This is a generically typed ArrayList, passing Integer as the
        // parameterized type.
        ArrayList<Integer> intList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // This is a raw type ArrayList
        ArrayList rawList = new ArrayList(List.of(1, 2, 3, 4, 5));

        // Set up the parameter we will pass to the toArray() method
        Integer[] aIntArray = new Integer[10];

        System.out.println("---- All tests executed with lists that" +
                " contain: " + rawList + " ----");
        System.out.println("\nScenario 1:  Parameter is reference variable" +
                " for Integer[10], elements all null");
        // Scenario 1: array.length >= list.size();
        //             and array elements initialized to null
        // The method toArray([]<T>) populates the passed array with as
        // many elements as list contains and returns passed array back.
        // No new array is created.
        var bInt = intList.toArray(aIntArray);
        System.out.println("Result type from ArrayList<Integer> " +
                "assigned to var = " +
                bInt.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(bInt));

        // No casting required.
        testValue = bInt[0];
        System.out.println("--- No cast required at individual level:" +
                " the first element is " + testValue);

        // Reset the array we use as a parameter between tests, so
        // tests between raw ArrayList and generic ArrayList are same
        aIntArray = new Integer[10];

        // A raw ArrayList will still return array passed, in
        // this case aIntArray reference

        var bRaw = rawList.toArray(aIntArray);
        System.out.println("Result type from ArrayList assigned to var = " +
                bRaw.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(bRaw));

        // Casting required.
        testValue = (int) bRaw[0];
        System.out.println("--- Cast required at individual level: the " +
                "first element is " + testValue);

        System.out.println("\nScenario 2:  Parameter is reference variable" +
                " for Integer[10], elements all populated");
        // Scenario 2: array.length > list.size();
        //             and array elements initialized (not null)
        // the method toArray([]<T>) populates passed array with as many
        // elements as list contains, and has one other, maybe unexpected
        // behavioral twist - it sets the element at list.size() to null,
        // leaving all other elements at indices > list.size() as they were.
        aIntArray = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Integer[] cInt = intList.toArray(aIntArray);
        System.out.println("Result type from ArrayList<Integer> " +
                "assigned to Integer[] = " +
                cInt.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(cInt));

        // No casting required.
        testValue = cInt[0];
        System.out.println("--- No cast required at individual level:" +
                " the first element is " + testValue);

        // Reset the array we use as a parameter between tests, so
        // tests between raw ArrayList and generic ArrayList are same
        aIntArray = new Integer[]{1,2,3,4,5,6,7,8,9,10};

        // A raw ArrayList will still return array passed, in
        // this case aIntArray reference, but to assign it to an
        // Integer[] array we must cast.
        Integer[] cRaw = (Integer[]) rawList.toArray(aIntArray);
        System.out.println("Result type from ArrayList assigned to  Integer[] " +
                " required casting = " + cRaw.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(cRaw));

        // No Casting required.
        testValue = cRaw[0];
        System.out.println("--- No Cast required at individual level since" +
                " we cast entire array to (Integer[]) : the first element is "
                + testValue);

        System.out.println("\nScenario 3:  No parameter passed");
        // Scenario 3: no parameter
        // the method toArray() populates a newly instantiated Object[]
        // array with the list's elements, which happen to all be Integer.
        // The behavior is the same for both a raw list and generic list
        Object[] dInt = intList.toArray();   // CANNOT cast to (Integer[])
//        Integer[] dInt = (Integer[]) intList.toArray();   // CANNOT cast to (Integer[])

        System.out.println("Result type from ArrayList<Integer> " +
                "assigned to Object[] = " +
                dInt.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(dInt));

        // Casting required.
        testValue = (int) dInt[0];
        System.out.println("--- Cast required at individual level:" +
                " the first element is " + testValue);

        Object[] dRaw = intList.toArray();
        System.out.println("Result type from ArrayList " +
                "assigned to Object[] = " +
                dRaw.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(dRaw));

        // Casting required.
        testValue = (int) dRaw[0];
        System.out.println("--- Cast required at individual level:" +
                " the first element is " + testValue);

        System.out.println("\nScenario 4:  Array passed is too small");
        // Scenario 4: array.length < list.size();
        //             and array elements initialized to null or otherwise
        // the method toArray() populates a newly instantiated
        // array of the same type as the parameter passed,
        // and the size of the list itself, not the parameter passed
        aIntArray = new Integer[3];

        // Let's make no assumptions about what is returned...
        var eInt = intList.toArray(aIntArray);
        System.out.println("Result type from ArrayList<Integer> " +
                "assigned to var = " +
                eInt.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(eInt));

        // No casting required.
        testValue = eInt[0];
        System.out.println("--- No cast required at individual level:" +
                " the first element is " + testValue);

        // Reset the array we use as a parameter between tests, so
        // tests between raw ArrayList and generic ArrayList are same
        aIntArray = new Integer[3];

        // A raw ArrayList will still return an Integer[] array

        var eRaw = rawList.toArray(aIntArray);
        System.out.println("Result type from ArrayList assigned to var = " +
                eRaw.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(eRaw));

        // Casting required.
        testValue = (int) eRaw[0];
        System.out.println("--- Cast required at individual level: the " +
                "first element is " + testValue);

        System.out.println("\nScenario 5:  Array passed is now Number[] and not a reference variable");
        // Scenario 5: array.length < list.size();
        //             and no reference to array passed
        // the method toArray() populates a newly instantiated
        // array of the same type as the parameter passed,
        // and the size of the list itself, not the parameter passed

        var fInt = intList.toArray(new Number[0]);
        System.out.println("Result type from ArrayList<Integer> " +
                "assigned to var = " +
                fInt.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(fInt));

        // casting required.
        testValue = (int) fInt[0];
        System.out.println("--- Cast required at individual level:" +
                " the first element is " + testValue);

        // A raw ArrayList will still return a Number[] array

        var fRaw = rawList.toArray(new Number[0]);
        System.out.println("Result type from ArrayList assigned to var = " +
                fRaw.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(fRaw));

        // Casting required.
        testValue = (int) fRaw[0];
        System.out.println("--- Cast required at individual level: the " +
                "first element is " + testValue);
    }//public static void main(String[] args) {
}//public class ToArrayExamples {