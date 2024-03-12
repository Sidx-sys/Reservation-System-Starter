package flight.reservation.order;

import flight.reservation.flight.ScheduledFlight;

public class RemovePassengerFromFlightCommand implements
        FlightBookingCommand {
    private FlightReservationSystem flightReservationSystem;
    private FlightOrder flightOrder;
    private ScheduledFlight flight;
    private String passengerName;

    public RemovePassengerFromFlightCommand(FlightReservationSystem flightReservationSystem, FlightOrder flightOrder,
            ScheduledFlight flight,
            String passengerName) {
        this.flightReservationSystem = flightReservationSystem;
        this.flightOrder = flightOrder;
        this.flight = flight;
        this.passengerName = passengerName;
    }

    @Override
    public void execute() {
        flightReservationSystem.RemovePassengerFromFlight(flightOrder,
                flight, passengerName);
    }

}
