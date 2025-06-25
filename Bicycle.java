// Bicycle.java (Subclass)
public class Bicycle extends Vehicle {
    private boolean hasBell;

    // Constructor
    public Bicycle(int speed, double fuel, boolean hasBell) {
        super(speed, fuel);
        this.hasBell = hasBell;
    }

    // Override start
    @Override
    public void start() {
        System.out.println("Bicycle has started. Pedal away!");
    }

    // Unique to Bicycle
    public void ringBell() {
        if (hasBell) {
            System.out.println("Ring Ring!");
        } else {
            System.out.println("No bell installed.");
        }
    }

    // Getter and setter
    public boolean hasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}