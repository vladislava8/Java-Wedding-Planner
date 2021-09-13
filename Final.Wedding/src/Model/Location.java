package Model;

import java.util.HashMap;
import java.util.Map;

public class Location extends Wedding {
    public final int locationID;
    public final String description;
    public final Map<String,Integer> weddingLocations;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.weddingLocations = new HashMap<String, Integer>();
    }

    public void addLocation(String name, int maxGuestNumber){
        weddingLocations.put(name, maxGuestNumber);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getWeddingLocations() {
        return new HashMap<String,Integer>(weddingLocations);
    }
}
