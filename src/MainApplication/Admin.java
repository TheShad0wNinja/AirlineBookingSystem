package MainApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Admin extends Account {
    private transient FlightCollection flightCollection;

    public Admin(
            String name,
            String username,
            String password,
            LocalDate dob) {
        super(name, username, password, dob);
        this.flightCollection = null;
    }
    public Admin(
            FlightCollection flightCollection,
            String name,
            String username,
            String password,
            LocalDate dob) {
        super(name, username, password, dob);
        this.flightCollection = flightCollection;
    }

    public void setFlightCollection(FlightCollection flightCollection) {
        this.flightCollection = flightCollection;
    }

    public void addNewFlight(String origin, String dest, int ecoRow, int ecoCol, float ecoFare, int busRow, int busCol,
                             float busFare, int firstRow, int firstCol, float firstFare, LocalDateTime dep,
                             LocalDateTime arrival) {
        flightCollection.addFlight(origin,
                dest,
                ecoRow,
                ecoCol,
                ecoFare,
                busRow,
                busCol,
                busFare,
                firstRow,
                firstCol,
                firstFare,
                dep,
                arrival);
    }

    public Flight removeFlight(String c) {
        return flightCollection.removeFlight(c);
    }

    public Flight searchFlight(String s) {
        return flightCollection.searchFlight(s);
    }

    public void updateFlight(Flight flight, String origin, String dept, LocalDateTime arrival, LocalDateTime departure) {
        flightCollection.updateFlight(flight, origin, dept, arrival, departure);
    }

    public ArrayList<Flight> getFlights() {
        return flightCollection.getFlights();
    }

    public double getTotalRouteFare(Route route) {
        return flightCollection.getTotalRouteFare(route);
    }

    public int getTotalBookingCount(Route route) {
        return flightCollection.getTotalBookingCount(route);
    }

}