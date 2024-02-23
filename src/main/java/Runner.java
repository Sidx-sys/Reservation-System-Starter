import flight.reservation.Airport;
import flight.reservation.flight.Schedule;
import flight.reservation.flight.Flight;
import flight.reservation.plane.A350Builder;
import flight.reservation.plane.A380Builder;
import flight.reservation.plane.AntonovAN2Builder;
import flight.reservation.plane.Embraer190Builder;
import flight.reservation.plane.Helicopter;
import flight.reservation.plane.PassengerDrone;
import flight.reservation.plane.PassengerPlane;
import flight.reservation.plane.PlaneDirector;


import java.util.Arrays;
import java.util.List;

public class Runner {
    static List<Airport> airports = Arrays.asList(
            new Airport("Berlin Airport", "BER", "Berlin, Berlin"),
            new Airport("Frankfurt Airport", "FRA", "Frankfurt, Hesse"),
            new Airport("Madrid Barajas Airport", "MAD", "Barajas, Madrid"),
            new Airport("Guarulhos International Airport", "GRU", "Guarulhos (São Paulo)"),
            new Airport("John F. Kennedy International Airport", "JFK", "Queens, New York, New York"),
            new Airport("Istanbul Airport", "IST", "Arnavutköy, Istanbul"),
            new Airport("Dubai International Airport", "DXB", "Garhoud, Dubai"),
            new Airport("Chengdu Shuangliu International Airport", "CTU", "Shuangliu-Wuhou, Chengdu, Sichuan")
    );

        // create a380
        public static PassengerPlane createA380(PlaneDirector director) {
                
                A380Builder builder = new A380Builder();
                director.setPlaneType(builder);
                director.constructPlane();
                PassengerPlane a380 = builder.getResult();
                return a380;
        }

        // create a350
        public static PassengerPlane createA350(PlaneDirector director) {
                A350Builder builder = new A350Builder();
                director.setPlaneType(builder);
                director.constructPlane();
                PassengerPlane a350 = builder.getResult();
                return a350;
        }

        // create embraer 190
        public static PassengerPlane createEmbraer190(PlaneDirector director) {
                Embraer190Builder builder = new Embraer190Builder();
                director.setPlaneType(builder);
                director.constructPlane();
                PassengerPlane embraer190 = builder.getResult();
                return embraer190;
        }


        // create antonov an2
        public static PassengerPlane createAntonovAN2(PlaneDirector director) {
                AntonovAN2Builder builder = new AntonovAN2Builder();
                director.setPlaneType(builder);
                director.constructPlane();
                PassengerPlane antonovAN2 = builder.getResult();
                return antonovAN2;
        }


        public static PassengerPlane createPassengerPlane(String model) {
                switch (model) {
                        case "A380":
                                return createA380(new PlaneDirector());
                        case "A350":
                                return createA350(new PlaneDirector());
                        case "Embraer 190":
                                return createEmbraer190(new PlaneDirector());
                        case "Antonov AN2":        
                                return createAntonovAN2(new PlaneDirector());
        
                        default:
                                return createAntonovAN2(new PlaneDirector());
                }

        }




    static List<Object> aircrafts = Arrays.asList(
        createPassengerPlane("A380"),
        createPassengerPlane("A350"),
        createPassengerPlane("Embraer 190"),
        createPassengerPlane("Antonov AN2"),
        //     new PassengerPlane("A380"),
        //     new PassengerPlane("A350"),
        //     new PassengerPlane("Embraer 190"),
        //     new PassengerPlane("Antonov AN2"),
            new Helicopter("H1"),
            new PassengerDrone("HypaHype")
    );

    static List<Flight> flights = Arrays.asList(
            new Flight(1, airports.get(0), airports.get(1), aircrafts.get(0)),
            new Flight(2, airports.get(1), airports.get(2), aircrafts.get(1)),
            new Flight(3, airports.get(2), airports.get(4), aircrafts.get(2)),
            new Flight(4, airports.get(3), airports.get(2), aircrafts.get(3)),
            new Flight(5, airports.get(4), airports.get(2), aircrafts.get(4)),
            new Flight(6, airports.get(5), airports.get(7), aircrafts.get(5))
    );

    static Schedule schedule;

    public static void main(String[] args) {
    }
}
