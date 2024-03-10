package flight.reservation.plane_factory;
import flight.reservation.plane.Helicopter;
import flight.reservation.plane.Aircraft;

public class HelicopterFactory implements AircraftFactory {
    public Aircraft createAircraft(String model) {
        return new Helicopter(model);
    }
}
