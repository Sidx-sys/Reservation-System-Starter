package flight.reservation.plane.builders;
import flight.reservation.plane.interfaces.DroneBuilderInterface;
import flight.reservation.plane.PlaneModels.Drone;

public class DroneBuilder implements DroneBuilderInterface {
    private String model;

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    public Drone getResult() {
        return new Drone(model);
    }
}
