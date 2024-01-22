/**
 * Author: Peter Yau
 * Email: PeterCY.Yau@glasgow.ac.uk
 * Date: 20240122
 * Description: This class represents the engine of a vehicle.
 */

package vehicle;

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Engine started. Type: " + type);
    }

    public void stop() {
        System.out.println("Engine stopped.");
    }
}