package flight.reservation.plane;

public class PassengerDrone implements Aircraft{
    public String model;
    public int passengerCapacity = 1;
    public int crewCapacity = 0;

    public PassengerDrone(String model) {
        if (model.equals("HypaHype")) {
            this.model = model;
        } else {
            throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
    }
    public void serve()
    {
        System.out.println("Sorry, no service in air");
    }
    public String getModel() {
        return model;
    }
    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    public int getCrewCapacity() {
        return crewCapacity;
    }
}
