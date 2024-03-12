package flight.reservation.plane;

public interface Aircraft {

    public void serve();
    public String getModel();
    public int getPassengerCapacity();
    public int getCrewCapacity();
}
