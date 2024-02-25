package flight.reservation.plane.PlaneModels;

import java.util.Arrays;
import java.util.List;

public class PlaneA380 implements PlaneModel {

    @Override
    public List<Integer> setDetailsOfPlane() {
        return Arrays.asList(500, 42);
    }
}
