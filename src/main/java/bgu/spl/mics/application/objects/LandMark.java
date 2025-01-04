package bgu.spl.mics.application.objects;

import java.util.List;

/**
 * Represents a landmark in the environment map.
 * Landmarks are identified and updated by the FusionSlam service.
 */
public class LandMark {
    // TODO: Define fields and methods.

    String id;
    String description;
    List<CloudPoint> coordinates;

    public LandMark(String id, String description, List<CloudPoint> coordinates){
        this.id = id;
        this.description = description;
        this.coordinates = coordinates;
    }

    public String getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public List<CloudPoint> getCoordinates(){
        return coordinates;
    }
}