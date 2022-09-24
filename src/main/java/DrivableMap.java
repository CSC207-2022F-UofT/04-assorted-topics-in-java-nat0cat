/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /**
     * Adds a drivable object into a hashmap given
     * the key which is represented as a String.
     *
     * @param id The key of the object in the hashmap.
     * @param obj The object to be added to the hashmap
     * @return True if it was successfully added, false otherwise.
     */
    public boolean addDrivable(String id, Drivable obj) {
        if (!drivable_map.containsKey(id)) {
            drivable_map.put(id, obj);
            return true;
        }
        return false;
    }

    /**
     * Checks if there is a drivable object with
     * a speed greater than the given speed.
     *
     * @param speed the given speed to compare to.
     * @return true if there is a speed greater than the given speed.
     */
    public boolean hasFasterThan(int speed) {
        for (Drivable d : drivable_map.values()) {
            if (d.getMaxSpeed() >= speed) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a list containing all the Tradable items.
     *
     * @return a list of tradable items.
     */
    public List<Tradable> getTradable() {
        List<Tradable> items = new ArrayList<>();
        for (Drivable d : drivable_map.values()) {
            if (d instanceof Tradable) {
                items.add((Tradable) d);
            }
        }
        return items;
    }
}