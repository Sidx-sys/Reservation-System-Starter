package flight.reservation.plane.directors;

import flight.reservation.plane.builders.DroneBuilder;
import flight.reservation.plane.PlaneModels.Drone;

public class DroneDirector {
    public static Drone constructHypaHypeDrone(DroneBuilder builder) {
        builder.setModel("HypaHype");
        return builder.getResult();
    }

    public static void constructMilitaryDrone(DroneBuilder builder) {
        builder.setModel("Military Drone");
    }
}
