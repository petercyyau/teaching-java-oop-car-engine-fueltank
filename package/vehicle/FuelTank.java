/**
 * Author: Peter Yau
 * E-mail: PeterCY.Yau@glasgow.ac.uk
 * Date: 20240122
 * Description: This class represents the fuel tank of a vehicle.
 */

package vehicle;

public class FuelTank {
    private double capacity;
    private double currentFuelLevel;

    public FuelTank(double capacity) {
        this.capacity = capacity;
        this.currentFuelLevel = 0.0;
    }

    public void refuel(double amount) {
        if (currentFuelLevel + amount <= capacity) {
            currentFuelLevel += amount;
            System.out.println("Fuel tank refueled. Current fuel level: " + currentFuelLevel + " liters");
        } else {
            System.out.println("Cannot exceed the fuel tank capacity. Refueling aborted.");
        }
    }

    public void consumeFuel(double amount) {
        if (currentFuelLevel >= amount) {
            currentFuelLevel -= amount;
            System.out.println("Fuel consumed. Current fuel level: " + currentFuelLevel + " liters");
        } else {
            System.out.println("Not enough fuel. Unable to consume.");
        }
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }
}
