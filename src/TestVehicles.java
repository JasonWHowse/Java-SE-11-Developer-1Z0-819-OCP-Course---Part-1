/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Polymorphism
*/

// We create a new Vehicle, Motorcycle, which implements
// the abstract methods on Vehicle
class Motorcycle extends Vehicle {
    public Motorcycle(VehicleType type, String owner, String make) {
        super(type, owner, make);
    }//public Motorcycle(VehicleType type, String owner, String make) {

    public void drive() {
        System.out.println("Kick up stand.  Go");
    }//public void drive() {

    public void park() {
        System.out.println("Put down stand.");
    }//public void park() {

    public void makeNoise() {
        System.out.println("Zoom!");
    }//public void makeNoise() {
}//class Motorcycle extends Vehicle {

// TestVehichles class demonstrates polymorphism
public class TestVehicles {
    public static void main(String[] args) {

        // We create 3 types of 'Vehicle' classes
        Auto car = new Auto(Vehicle.VehicleType.Automobile, "Allen", "Ford");
        AutomatedAuto automatedCar = new AutomatedAuto(
                Vehicle.VehicleType.Automobile, "Martha", "Tesla");

        Motorcycle harley = new Motorcycle(
                Vehicle.VehicleType.Motorcycle, "Buzz", "Harley-Davidson");

        // We execute this class's drive method the same regardless of the
        // type of object passed...
        drive(car);
        drive(automatedCar);
        drive(harley);

        // We execute this class's park method the same regardless of the
        // type of object passed...
        park(car);
        park(automatedCar);
        park(harley);

    }//public static void main(String[] args) {

    // We create a generic drive method that makes no assumptions about
    // what the object's drive method will do, it just knows from the
    // abstract class that drive() is a valid method on Vehicle.
    public static void drive(Vehicle v) {
        System.out.print(v.getClass().getName() + " drive() :  ");
        v.drive();
    }//public static void drive(Vehicle v) {

    // We create a generic park method that makes no assumptions about
    // what the object's drive method will do, it just knows from the
    // abstract class that park() is a valid method on Vehicle.
    public static void park(Vehicle v) {
        System.out.print(v.getClass().getName() + " park() :  ");
        v.park();
    }//public static void park(Vehicle v) {
}//public class TestVehicles {