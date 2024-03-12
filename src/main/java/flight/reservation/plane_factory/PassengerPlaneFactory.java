package flight.reservation.plane_factory;
import flight.reservation.plane.PassengerPlane;
import flight.reservation.plane.Aircraft;

public class PassengerPlaneFactory extends AircraftFactory {
    public Aircraft createAircraft(String model) {
        return new PassengerPlane(model);
    }
}
