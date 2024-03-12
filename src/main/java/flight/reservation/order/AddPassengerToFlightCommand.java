package flight.reservation.order;

import flight.reservation.flight.ScheduledFlight;

public class AddPassengerToFlightCommand implements FlightBookingCommand {
    private FlightReservationSystem flightReservationSystem;
    private FlightOrder flightOrder;
    private ScheduledFlight flight;
    private String passengerName;

    public AddPassengerToFlightCommand(FlightReservationSystem flightReservationSystem, FlightOrder flightOrder,
            ScheduledFlight flight,
            String passengerName) {
        this.flightReservationSystem = flightReservationSystem;
        this.flightOrder = flightOrder;
        this.flight = flight;
        this.passengerName = passengerName;
    }

    @Override
    public void execute() {
        flightReservationSystem.AddPassengerToFlight(flightOrder, flight,
                passengerName);
    }
}
