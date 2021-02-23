/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Abstract classes
*/

// This abstract class extends the abstract Vehicle
// It is not required that an abstract class implements any or all
// of Vehicle's abstract methods.   In this example, we implement 2 of
// Vehicle's abstract methods, but do not implement makeNoise method

public abstract class AutomatedVehicle extends Vehicle {
    // Constructor is pass thru to Vehicle constructor
    public AutomatedVehicle(VehicleType type, String owner, String make) {
        super(type, owner, make);
    }//public AutomatedVehicle(VehicleType type, String owner, String make) {

    // This class implements park(), but calls an abstract method defined
    // on this class.   Any class that extends the AutomatedVehicle no
    // longer has to implement park(), but has to implement autoPark.
    public void park() {
        autoPark();
    }//public void park() {

    // This class implements drive(), but calls an abstract method defined
    // on this drive
    public void drive() {
        autoDrive();
    }//public void drive() {

    // Any concrete class that extends the AutomatedVehicle has to
    // implement autoPark
    abstract void autoPark();

    // Any concrete class that extends the AutomatedVehicle has to
    // implement autoDrive
    abstract void autoDrive();
}//public abstract class AutomatedVehicle extends Vehicle {