package bgu.spl.mics.application.objects;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import sun.security.krb5.Config;

import java.util.ArrayList;
import java.util.List;

/**
 * LiDarDataBase is a singleton class responsible for managing LiDAR data.
 * It provides access to cloud point data and other relevant information for tracked objects.
 */
public class LiDarDataBase {
    private List<StampedCloudPoints> cloudPoints;  //The coordinates of that we have for every object per time.
    public LiDarDataBase() {
        cloudPoints = new ArrayList<StampedCloudPoints>();
    }
    public List<StampedCloudPoints> getCloudPoints() {
        return cloudPoints;
    }
    public void addCloudPoints(StampedCloudPoints cloudPoints) {
        this.cloudPoints.add(cloudPoints);
    }
    /**
     * Returns the singleton instance of LiDarDataBase.
     *
     * @param filePath The path to the LiDAR data file.
     * @return The singleton instance of LiDarDataBase.
     */
    public static LiDarDataBase getInstance(String filePath) {
        Gson gson = new Gson();

    }
}
