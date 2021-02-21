/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic:  Counting String Objects
*/

public class StringCount {
    public static void main(String[] args) {

        String stringOriginal = "aaabbb";

        // The behavior is the same for all the replace methods,
        // if there is no match, a new String object is NOT created.
        String stringReplaced = stringOriginal.replace('C', 'a');
        System.out.println("1.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        stringReplaced = stringOriginal.replace("CC", "aa");
        System.out.println("2.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        stringReplaced = stringOriginal.replaceAll("CC", "aa");
        System.out.println("3.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        stringReplaced = stringOriginal.replaceFirst("CC", "aa");
        System.out.println("4.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        // The replace method with two chars that are the same does NOT
        // create a new String object
        stringReplaced = stringOriginal.replace('a', 'a');
        System.out.println("5.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        // The method replace with String parameters exhibits
        // different behavior than the one that accepts chars
        stringReplaced = stringOriginal.replace("a", "a");
        System.out.println("6.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        stringReplaced = stringOriginal.replaceAll("a", "a");
        System.out.println("7.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        stringReplaced = stringOriginal.replaceFirst("a", "a");
        System.out.println("8.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        // Note that creating a 'substring' which is same as string
        // does NOT create a new object.
        stringReplaced = stringOriginal.substring(0, stringOriginal.length());
        System.out.println("9.  stringOriginal==stringReplaced = " +
                (stringOriginal == stringReplaced));

        // compiler calculates this expression to the constant "abc:def" so only one
        // string is created at runtime on this line
        String s1 = "abc" + ":" + "def";

        // set up some more strings for next example..
        String s2 = "s2";
        String s3 = "s3";
        String s4 = "s4";

        // The following statement creates 3 string objects
        // object1 = s2 + s1
        //         object2 = s3 + object1
        //                object3 = s4 + object2
        // If you rewrite this as s5 = (((s4 + s3) + s2) + s1)
        // it might be easier to count the number of objects created
        // by counting left parentheses groupings
        String s5 = s4 + s3 + s2 + s1;
    }//public static void main(String[] args) {
}//public class StringCount { 