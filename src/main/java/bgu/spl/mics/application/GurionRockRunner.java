package bgu.spl.mics.application;

import bgu.spl.mics.application.objects.Camera;
import bgu.spl.mics.application.objects.FusionSlam;
import bgu.spl.mics.application.services.FusionSlamService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;


/**
 * The main entry point for the GurionRock Pro Max Ultra Over 9000 simulation.
 * <p>
 * This class initializes the system and starts the simulation by setting up
 * services, objects, and configurations.
 * </p>
 */
public class GurionRockRunner {

    /**
     * The main method of the simulation.
     * This method sets up the necessary components, parses configuration files,
     * initializes services, and starts the simulation.
     *
     * @param args Command-line arguments. The first argument is expected to be the path to the configuration file.
     */
    public static <List> void main(String[] a0rgs) {
        System.out.println("Hello World!");
        String configPath = args[0]; //path of the config.

        FileReader configFile = null;

        try {
            configFile = new FileReader(configPath);
        }catch(Exception e) {
            e.printStackTrace();
        }


        FusionSlamService fusionSlamService = new FusionSlamService(FusionSlam.getInstance());
        Gson gson = new Gson();

        ArrayList<Camera> cameras = new ArrayList<>();

        Type camerasListType = new TypeToken<ArrayList<Camera>>(){}.getType();

        cameras = gson.fromJson(configFile, camerasListType);






        // TODO: Parse configuration file.
        // TODO: Initialize system components and services.
        // TODO: Start the simulation.
    }
}