package flight.reservation.order;

public class BookFlightCommand implements FlightBookingCommand {
    private FlightReservationSystem flightReservationSystem;
    private FlightOrder flightOrder;

    public BookFlightCommand(FlightReservationSystem flightReservationSystem, FlightOrder flightOrder) {
        this.flightReservationSystem = flightReservationSystem;
    }

    @Override
    public void execute() {
        flightReservationSystem.BookFlight(flightOrder);
    }
}
