package flight.reservation;
import flight.reservation.Customer;
import flight.reservation.Passenger;

public class CustomerAdapter extends Passenger {
    private Customer customer;

    CustomerAdapter(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String getName() {
        return customer.getName();
    }
}
