package flight.reservation.order;

public class CommandInvoker {
    AddPassengerToFlightCommand addPassengertoFlight;
    BookFlightCommand bookFlightCommand;
    CancelFlightCommand cancelFlightCommand;
    RemovePassengerFromFlightCommand removePassengerFromFlight;

    public CommandInvoker(AddPassengerToFlightCommand addPassengertoFlight, BookFlightCommand bookFlightCommand,
            CancelFlightCommand cancelFlightCommand,
            RemovePassengerFromFlightCommand removePassengerFromFlight) {
        this.addPassengertoFlight = addPassengertoFlight;
        this.bookFlightCommand = bookFlightCommand;
        this.cancelFlightCommand = cancelFlightCommand;
        this.removePassengerFromFlight = removePassengerFromFlight;
    }

    public void addPassengerToFlight() {
        addPassengertoFlight.execute();
    }

    public void bookFlight() {
        bookFlightCommand.execute();
    }

    public void cancelFlight() {
        cancelFlightCommand.execute();
    }

    public void removePassengerFromFlight() {
        removePassengerFromFlight.execute();
    }
}
