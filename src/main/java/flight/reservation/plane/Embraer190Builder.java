package flight.reservation.plane;

public class Embraer190Builder implements PlaneInterface {
    PassengerPlane embraer190Plane = new PassengerPlane();

    public Embraer190Builder() {
        embraer190Plane.model = "Embraer 190";
    }

    @Override
    public void buildPassengerCapacity() {
        embraer190Plane.passengerCapacity = 25;
    }

    @Override
    public void buildCrewCapacity() {
        embraer190Plane.crewCapacity = 5;
    }

    public PassengerPlane getResult() {
        return embraer190Plane;
    }
}
