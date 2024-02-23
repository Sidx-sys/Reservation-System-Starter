package flight.reservation.plane;

public class A350Builder implements PlaneInterface {
    PassengerPlane a350Plane = new PassengerPlane();

    public A350Builder() {
        a350Plane.model = "A350";
    }

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
