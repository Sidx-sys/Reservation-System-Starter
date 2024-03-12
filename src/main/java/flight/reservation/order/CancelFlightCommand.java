package flight.reservation.order;


public class CancelFlightCommand implements FlightBookingCommand {
    private FlightReservationSystem flightReservationSystem;
    private FlightOrder flightOrder;

    public CancelFlightCommand(FlightReservationSystem flightReservationSystem, FlightOrder flightOrder) {
        this.flightReservationSystem = flightReservationSystem;
        this.flightOrder = flightOrder;
    }

    @Override
    public void execute() {
        flightReservationSystem.CancelFlight(flightOrder);
    }
}
