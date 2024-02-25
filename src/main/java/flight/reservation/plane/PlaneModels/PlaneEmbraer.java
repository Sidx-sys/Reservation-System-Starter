package flight.reservation.plane.PlaneModels;

import java.util.Arrays;
import java.util.List;

public class PlaneEmbraer implements PlaneModel{
    @Override
    public List<Integer> setDetailsOfPlane() {
        return Arrays.asList(320, 40);
    }
}
