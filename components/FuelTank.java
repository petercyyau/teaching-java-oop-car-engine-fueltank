package components;
/*
 * Author: Peter Yau
 * Email: PeterCY.Yau@glasgow.ac.uk
 * Date: 20240122
 * 
 * Description: The FuelTank class represents the fuel tank in a vehicle.
 * It encapsulates features such as capacity, current fuel level, and provides methods for refueling, fuel consumption, and information display.
 * The class also includes a self-test main method for basic functionality testing.
 */

public class FuelTank {
    // Fields
    private double capacity;  // Capacity of the fuel tank in liters
    private double fuelLevel; // Current fuel level in the tank

    // Constructor
    public FuelTank(double capacity) {
        this.capacity = capacity;
        this.fuelLevel = 0; // Initially empty
    }

    // Constructor to accept initialFuelLevel
    public FuelTank(double capacity, double initialFuelLevel) {
        this.capacity = capacity;
        this.fuelLevel = Math.min(initialFuelLevel, capacity); // Ensure initial fuel level does not exceed capacity
    }

    // Self-test main method
    public static void main(String[] args) {
        // Self-test main method with command line arguments
        // double capacity = Double.parseDouble(args[0]);
        // double initialFuelLevel = Double.parseDouble(args[1]);
        // FuelTank testFuelTank = new FuelTank(capacity, initialFuelLevel);

        // Self-test main method
        FuelTank testFuelTank = new FuelTank(50);

        // Display fuel tank initial information
        testFuelTank.displayInfo();

        // Test refueling
        testFuelTank.refuel(20);

        // Test consuming fuel
        testFuelTank.consumeFuel();

        // Display fuel tank latest information
        testFuelTank.displayInfo();
    }

    // Methods
    public void refuel(double amount) {
        double spaceAvailable = capacity - fuelLevel;
        if (amount <= spaceAvailable) {
            fuelLevel += amount;
            System.out.println("Refueled: " + amount + " liters");
        } else {
            System.out.println("Cannot refuel. Tank is full.");
        }
    }

    public void consumeFuel() {
        if (fuelLevel > 0) {
            fuelLevel -= 5; // Simulating fuel consumption (adjust as needed)
            System.out.println("Fuel consumed: 5L.");
            System.out.println("Current fuel level: " + fuelLevel + " liters");
        } else {
            System.out.println("Out of fuel. Refuel before driving.");
        }
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean isEmpty() {
        return fuelLevel == 0;
    }

    public void displayInfo() {
        System.out.println("Fuel Tank Capacity: " + capacity + " liters");
        System.out.println("Current Fuel Level: " + fuelLevel + " liters");
    }
}
