/**
 * Author: Peter Yau
 * E-mail: PeterCY.Yau@glasgow.ac.uk
 * Date: 20240122
 * Description: This class contains the main method to demonstrate the usage of the vehicle package.
 */

import vehicle.Car;
import vehicle.Engine;
import vehicle.FuelTank;

public class Main {
    public static void main(String[] args) {
        Engine carEngine = new Engine("V6");
        FuelTank carFuelTank = new FuelTank(60.0);
        Car myCar = new Car("Toyota", "Camry", carEngine, carFuelTank);

        myCar.start();
        myCar.drive(150.0);
        System.out.println("Remaining fuel: " + myCar.getRemainingFuel() + " liters");
        myCar.stop();
    }
}
