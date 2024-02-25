package flight.reservation.plane.PlaneModels;

import java.util.Arrays;
import java.util.List;

public class PlaneA350 implements PlaneModel {

    @Override
    public List<Integer> setDetailsOfPlane() {
        return Arrays.asList(320, 40);
    }
}
