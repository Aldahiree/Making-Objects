// Main.java (Testing)
public class Main {
    public static void main(String[] args) {
        // Create Car object 
        Car car = new car(60, 20.5, 4);
        car.start();
        car.accelerate(20);
        car.honk();
        car.displayFuel();
        car.refuel(10);
        car.displayFuel();
        car.stop();
        System.out.println();
        // Create Bicycle object
        Bicycle bicycle = new Bicycle(15, 0, true);
        bicycle.start();
        bicycle.accelerate(5);
        bicycle.ringBell();
        bicycle.displayFuel(); //shiuld still work from base class
        bicycle.stop;
    }
}