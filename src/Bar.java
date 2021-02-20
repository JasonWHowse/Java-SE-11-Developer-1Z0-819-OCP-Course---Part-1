/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Declare and Initialize Variables
Sub-Topic: Initialization of primitive data type variables - including default values
*/

public class Bar {
    // Default values for numeric static variables set to a representation of 0
    static byte staticBarByte;
    static char staticBarChar;
    static short staticBarShort;
    static int staticBarInt;
    static long staticBarLong;
    static float staticBarFloat;
    static double staticBarDouble;

    // Default value for boolean static variables set to false;
    static boolean staticBarBoolean;

    // Default values for numeric instance variables set to a representation of 0
    byte barByte;
    char barChar;
    short barShort;
    int barInt;
    long barLong;
    float barFloat;
    double barDouble;

    // Default value for boolean instance variables set to false;
    boolean barBoolean;

    public static void main(String[] args) {
        Bar bar = new Bar();

        // These class variable references do not produce compile errors
        System.out.println("----------  Class Variables set to default values --------------");
        System.out.println("Bar.staticByte=" + Bar.staticBarByte);
        System.out.println("Bar.staticChar=" + Bar.staticBarChar);
        System.out.println("Bar.staticShort=" + Bar.staticBarShort);
        System.out.println("Bar.staticInt=" + Bar.staticBarInt);
        System.out.println("Bar.staticLong=" + Bar.staticBarLong);
        System.out.println("Bar.staticFloat=" + Bar.staticBarFloat);
        System.out.println("Bar.staticDouble=" + Bar.staticBarDouble);
        System.out.println("Bar.staticBoolean=" + Bar.staticBarBoolean);

        // These object instance variable references do not produce compile errors
        System.out.println("----------  Instance Variables set to default values --------------");
        System.out.println("barByte=" + bar.barByte);
        System.out.println("barChar=" + bar.barChar);
        System.out.println("barShort=" + bar.barShort);
        System.out.println("barInt=" + bar.barInt);
        System.out.println("barLong=" + bar.barLong);
        System.out.println("barFloat=" + bar.barFloat);
        System.out.println("barDouble=" + bar.barDouble);
        System.out.println("barBoolean=" + bar.barBoolean);
    }//public static void main(String[] args) {
}//public class Bar {