package flight.reservation.plane;

public class A380Builder implements PlaneInterface {
    PassengerPlane a380Plane = new PassengerPlane();

    public A380Builder() {
        a380Plane.model = "A380";
    }

    @Override
    public void buildPassengerCapacity() {
        a380Plane.passengerCapacity = 500;
    }

    @Override
    public void buildCrewCapacity() {
        a380Plane.crewCapacity = 42;
    }

    public PassengerPlane getResult() {
        return a380Plane;
    }
}
