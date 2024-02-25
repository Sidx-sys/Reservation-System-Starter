package flight.reservation.plane;
import java.util.List;

import flight.reservation.plane.PlaneModels.PlaneA350;
import flight.reservation.plane.PlaneModels.PlaneA380;
import flight.reservation.plane.PlaneModels.PlaneAntonov;
import flight.reservation.plane.PlaneModels.PlaneEmbraer;
import flight.reservation.plane.PlaneModels.PlaneModel;

public class PassengerPlane implements Aircraft{

    public String model;
    public int passengerCapacity;
    public int crewCapacity;

    public PassengerPlane(String model) {
        this.model = model;
        PlaneModel plane;
        switch (model) {
            case "A380":
                plane = new PlaneA380();
                break;
            case "A350":
                plane = new PlaneA350();
                break;
            case "Embraer 190":
                plane = new PlaneEmbraer();
                break;
            case "Antonov AN2":
                plane = new PlaneAntonov();
                break;
            default:
                throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        
        }
        List<Integer> details = plane.setDetailsOfPlane();
        passengerCapacity = details.get(0);
        crewCapacity = details.get(1);
    }

    public void serve()
    {
        System.out.println("We provide a great service");
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
