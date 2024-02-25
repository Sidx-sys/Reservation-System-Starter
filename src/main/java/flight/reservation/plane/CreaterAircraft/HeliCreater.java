package flight.reservation.plane.CreaterAircraft;
import flight.reservation.plane.Helicopter;
import flight.reservation.plane.Aircraft;

public class HeliCreater extends AircraftCreator {
    @Override
    public Aircraft createAircraft(String model){
        Aircraft heli= new Helicopter(model);
        return heli;
    }
}
