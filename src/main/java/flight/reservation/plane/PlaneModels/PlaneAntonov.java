package flight.reservation.plane.PlaneModels;

import java.util.Arrays;
import java.util.List;

public class PlaneAntonov implements PlaneModel{
    @Override
    public List<Integer> setDetailsOfPlane() {
        return Arrays.asList(320, 40);
    }
}

