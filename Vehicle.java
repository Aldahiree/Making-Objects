// Vehicle.java (Base Class)
public class Vehicle {
    protected int speed;            // Accessible by subclasses
    private double fuel;           // Only accessible within  Vehicle (Base Class)
    // Constructor
    public Vehicle(int spped, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }
    // Start the vehicle
    public void start() {
        System.out.println("Vehicle has startes.");
    }
    // Stop the vehicle
    public void stop() {
        System.out.println("Vehicle has stopped.");
    }
    // A method to display fuel level
    public final void displayFuel() {
        System.out.println("Fuel level: " + fuel + " liters");
    }
    // Adding Refuel the vehicle methode 
    public void refuel(double amount) {
        if (amount > 0) {
            fuel += amount;
            System.out.println("Refueled " + amount + " liters. ");
        }
        else {
        System.out.println("Invalid fuel amount.");
    }
}
// Adding Accelerate the vehicle methode
public void accelerate(int increent) {
    speed += increment;
    System.out.println("Accelerated to " + speed + " km/h");
}
// Getters and Setters
public int getSpeed() {
    return speed;
}
public void setSpeed() {
    return speed;
}
public void setSpeed(int speed) {
    this.speed = speed;
}
protected double getFuel() {
    return fuel;
}
}