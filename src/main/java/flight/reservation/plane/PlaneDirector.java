package flight.reservation.plane;

public class PlaneDirector {
    private PlaneInterface planeBuilder;
    // constructor 
    public PlaneDirector(PlaneInterface planeBuilder) {
        this.planeBuilder = planeBuilder;
    }
}
