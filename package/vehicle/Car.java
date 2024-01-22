/**
 * Author: Peter Yau
 * Email: PeterCY.Yau@glasgow.ac.uk
 * Date: 20240122
 * Description: This class represents a car with an engine and fuel tank.
 */

 package vehicle;

public class Car {
    private String make;
    private String model;
    private Engine engine;
    private FuelTank fuelTank;

    public Car(String make, String model, Engine engine, FuelTank fuelTank) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public void start() {
        System.out.println("Starting the car: " + make + " " + model);
        engine.start();
    }

    public void stop() {
        System.out.println("Stopping the car: " + make + " " + model);
        engine.stop();
    }

    public void refuel(double amount) {
        fuelTank.refuel(amount);
    }

    public void drive(double distance) {
        double fuelRequired = distance / 10.0; // Assume 10 km per liter fuel consumption
        fuelTank.consumeFuel(fuelRequired);
        System.out.println("Car drove " + distance + " km.");
    }

    public double getRemainingFuel() {
        return fuelTank.getCurrentFuelLevel();
    }
}