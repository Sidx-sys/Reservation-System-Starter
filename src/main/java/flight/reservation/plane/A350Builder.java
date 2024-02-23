package flight.reservation.plane;

public class A350Builder implements PlaneInterface {
    PassengerPlane a350Plane = new PassengerPlane();

    @Override
    public void buildPassengerCapacity() {
        a350Plane.passengerCapacity = 320;
    }

    @Override
    public void buildCrewCapacity() {
        a350Plane.crewCapacity = 40;
    } 

    public PassengerPlane getResult() {
        return a350Plane;
    }
}
