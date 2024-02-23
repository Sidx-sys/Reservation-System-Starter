package flight.reservation.plane;

public class AntonovAN2Builder implements PlaneInterface {
    PassengerPlane antonovAN2Plane = new PassengerPlane();

    @Override
    public void buildPassengerCapacity() {
        antonovAN2Plane.passengerCapacity = 12;
    }

    @Override
    public void buildCrewCapacity() {
        antonovAN2Plane.crewCapacity = 2;
    }

    public PassengerPlane getResult() {
        return antonovAN2Plane;
    }
}
