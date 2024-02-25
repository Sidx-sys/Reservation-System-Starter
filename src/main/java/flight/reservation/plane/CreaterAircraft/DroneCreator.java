package flight.reservation.plane.CreaterAircraft;
import flight.reservation.plane.PassengerDrone;
import flight.reservation.plane.Aircraft;

public class DroneCreator extends AircraftCreator {
    @Override
    
    public Aircraft createAircraft(String model){
        Aircraft pd= new PassengerDrone(model);
        return pd;
    }
}
