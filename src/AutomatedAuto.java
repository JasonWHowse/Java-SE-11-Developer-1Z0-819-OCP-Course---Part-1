/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Abstract classes
*/

// This is a concrete class extending AutomatedVehicle.
// You will note that this class does not implement drive() or park()
public class AutomatedAuto extends AutomatedVehicle {

    // This constructor is a pass thru method to the constructor
    // on AutomatedVehicle
    public AutomatedAuto(VehicleType type, String owner, String make) {
        super(type, owner, make);
    }//public AutomatedAuto(VehicleType type, String owner, String make) {

    // Implements autoDrive(), required by AutomatedVehicle extension
    public void autoDrive() {
        System.out.println("Driving it myself");
    }//public void autoDrive() {

    // Implements autoDrive(), required by AutomatedVehicle extension
    public void autoPark() {
        System.out.println("Parking it myself");
    }//public void autoPark() {

    // Implements autoDrive(), required by Vehicle extension, because
    // Automated Vehicle punted on the implement ation - actually it
    // made no assumptions about how the subclass would implement it.
    public void makeNoise() {
        System.out.println("Beep, Beep");
    }//public void makeNoise() {

    // Main method instances an object of type AutomatedAuto.
    public static void main(String[] args) {

        AutomatedAuto automatedCar =
                new AutomatedAuto(VehicleType.Automobile, "Martha", "Tesla");
        System.out.println(automatedCar);

        // drive() and park() are not even methods on AutomatedAuto
        // but we can use them because of inheritance and best part of all,
        // they execute autoDrive() and autoPark() for this type of object.
        automatedCar.drive();
        automatedCar.park();
        automatedCar.makeNoise();
    }//public static void main(String[] args) {
}//public class AutomatedAuto extends AutomatedVehicle {