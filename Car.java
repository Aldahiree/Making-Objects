// Car.java (Subclass)
public class Car extends Vehicle {
    private int numberOfDoors;
// Constructor
Public Car(int speed, double fuel, int numberOfDoors) {
    super(speed, fuel);  // Call Vehicle constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Override start
    @Override
    public void start() {
        System.out.println("Car has started.");
    }

    // Unique to Car
    public void honk() {
        System.out.println("Car horn: Beep Beep!");
    }

    // Getter and setter
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}