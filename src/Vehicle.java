/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Abstract classes
*/

// Vehicle is our most general entity and will never be an
// actual instance. 
public abstract class Vehicle {

    // We create an enum which describes possible subclasses
    protected enum VehicleType {
        Automobile, Motorcycle, Moped, Bicycle, Scooter
    }//protected enum VehicleType {

    // We define some attributes all vehicles would have in common
    private VehicleType type;
    private String owner;
    private String make;

    // Constructor will be the method we use to set data
    public Vehicle(VehicleType type, String owner, String make) {
        this.type = type;
        this.owner = owner;
        this.make = make;
    }//public Vehicle(VehicleType type, String owner, String make) {

    // We use IntelliJ's generated toString method
    public String toString() {
        return "Vehicle{" +
                "type=" + type +
                ", owner='" + owner + '\'' +
                ", make='" + make + '\'' +
                '}';
    }//public String toString() {

    // We create methods we want concrete subclasses to be forced to
    // implement
    public abstract void drive();

    public abstract void park();

    public abstract void makeNoise();
}//public abstract class Vehicle {