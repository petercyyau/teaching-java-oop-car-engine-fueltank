/*
 * Author: Peter Yau
 * E-mail: PeterCY.Yau@glasgow.ac.uk
 * Date: 20240122
 * 
 * Description: The Car class represents a vehicle with an engine and a fuel tank.
 * It interacts with the Engine and FuelTank classes, encapsulating functionality for starting, driving, stopping, refueling,
 * and displaying information about the car.
 */
 
 public class Car {
    // Fields
    private String make;
    private String model;
    private Engine engine;
    private FuelTank fuelTank;

    // Constructor
    public Car(String make, String model, Engine engine, FuelTank fuelTank) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    // Methods
    public void start() {
        engine.start();
    }

    public void drive() {
        if (fuelTank.isEmpty()) {
            System.out.println("The " + make + " " + model + " is out of fuel. Refuel before driving.");
        } else {
            System.out.println("The " + make + " " + model + " is moving.");
            engine.start(); // Simulate fuel consumption by the engine
            fuelTank.consumeFuel(); // Simulate overall fuel consumption
        }
    }

    public void stop() {
        engine.stop();
    }

    public void refuel(double amount) {
        fuelTank.refuel(amount);
    }

    public void displayInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        engine.displayInfo();
        fuelTank.displayInfo();
    }

    // Self-test main method
    public static void main(String[] args) {
        // Create instances of Engine and FuelTank
        Engine testEngine = new Engine("V6", 300);
        FuelTank testFuelTank = new FuelTank(50, 30);

        // Create an instance of Car
        Car testCar = new Car("Toyota", "Camry", testEngine, testFuelTank);

        // Test starting the car
        testCar.start();

        // Test driving the car
        testCar.drive();

        // Test stopping the car
        testCar.stop();

        // Test refueling the car
        testCar.refuel(20);

        // Display car information
        testCar.displayInfo();
    }
}
