package flight.reservation.plane.CreaterAircraft;
import flight.reservation.plane.PassengerPlane;
import flight.reservation.plane.Aircraft;

public class PlaneCreator extends AircraftCreator {
    @Override
    public Aircraft createAircraft(String model){
        Aircraft pp= new PassengerPlane(model);
        return pp;
    }
}
