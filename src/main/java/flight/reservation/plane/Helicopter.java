package flight.reservation.plane;

public class Helicopter implements Aircraft{
    public String model;
    public int passengerCapacity;
    public int crewCapacity = 2;

    public Helicopter(String model) {
        this.model = model;
        if (model.equals("H1")) {
            passengerCapacity = 4;
        } else if (model.equals("H2")) {
            passengerCapacity = 6;
        } else {
            throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
    }

    public void serve()
    {
        System.out.println("We provide limited service");
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
