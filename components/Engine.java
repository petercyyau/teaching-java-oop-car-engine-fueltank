/*
 * Author: Peter Yau
 * E-mail: PeterCY.Yau@glasgow.ac.uk
 * Date: 20240122
 * 
 * Description: The Engine class represents an internal combustion engine in a vehicle.
 * It encapsulates essential characteristics such as the engine type, horsepower, and running status.
 * The class provides methods to start and stop the engine, as well as display information about its current state.
 * Additionally, this class includes a self-test main method that demonstrates basic functionality,
 * and it can be instantiated with command line arguments for dynamic configuration.
 */

public class Engine {
    // Fields
    private String type;
    private int horsepower;
    private boolean isRunning;

    // Constructor
    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
        this.isRunning = false;
    }

    // Overloading Constructor
    public Engine(String type, int horsepower, boolean isRunning) {
        this.type = type;
        this.horsepower = horsepower;
        this.isRunning = isRunning;
    }

    // Self-test main method
    public static void main(String[] args) {

        // Self-test main method with command line arguments
        // String type = args[0];
        // int horsepower;
        // horsepower = Integer.parseInt(args[1]);
        // Engine testEngine = new Engine(type, horsepower);

        // Self-test main method
        // Engine testEngine = new Engine("V6", 300);
        Engine testEngine = new Engine("V6", 300, false);

        // Display engine initial information
        testEngine.displayInfo();

        // Test starting the engine
        testEngine.start();

        // Test trying to start the engine when it's already running
        testEngine.start();

        // Test stopping the engine
        testEngine.stop();

        // Display engine latest information
        testEngine.displayInfo();
    }

    // Methods
    public void start() {
        if (!isRunning) {
            System.out.println("The " + type + " engine is starting.");
            isRunning = true;
        } else {
            System.out.println("The engine is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            System.out.println("The " + type + " engine is stopping.");
            isRunning = false;
        } else {
            System.out.println("The engine is already stopped.");
        }
    }

    public void displayInfo() {
        System.out.println("Engine Type: " + type);
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Engine Status: " + (isRunning ? "Running" : "Stopped"));
    }
}
