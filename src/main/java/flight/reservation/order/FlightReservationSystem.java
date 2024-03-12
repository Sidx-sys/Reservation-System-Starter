package flight.reservation.order;
import flight.reservation.flight.ScheduledFlight;
import flight.reservation.Passenger;
import java.util.ArrayList;
import java.util.List;

public class FlightReservationSystem {
    public List<FlightOrder> AllOrders;

    public void BookFlight(FlightOrder flightOrder) {
        AllOrders.add(flightOrder);
    }

    public void CancelFlight(FlightOrder flightOrder) {
        AllOrders.remove(flightOrder);
    }

    public void AddPassengerToFlight(FlightOrder flightOrder,
            ScheduledFlight flight, String passengerName) {
        // convert passenger name to list
        List<Passenger> List = new ArrayList<Passenger>();
        List.add(new Passenger(passengerName));
        FlightOrder CurOrder = AllOrders.get(AllOrders.indexOf(flightOrder));
        ScheduledFlight CurFlight = CurOrder.getScheduledFlights().get(CurOrder.getScheduledFlights().indexOf(flight));
        CurFlight.addPassengers(List);
    }

    public void RemovePassengerFromFlight(FlightOrder flightOrder,
            ScheduledFlight flight, String passengerName) {
        // convert passenger name to list
        List<Passenger> List = new ArrayList<Passenger>();
        List.add(new Passenger(passengerName));
        FlightOrder CurOrder = AllOrders.get(AllOrders.indexOf(flightOrder));
        ScheduledFlight CurFlight = CurOrder.getScheduledFlights().get(CurOrder.getScheduledFlights().indexOf(flight));
        CurFlight.removePassengers(List);
    }
}
