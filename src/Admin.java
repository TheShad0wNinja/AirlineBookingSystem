import java.time.LocalDate;
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

    //TODO: ADD THE PARAMETERS REQUIRED TO CREATE A NEW FLIGHT
    public void addNewFlight(Flight f) {
        flightCollection.addFlight(f);
    }

    public Flight removeFlight(String c) {
        return flightCollection.removeFlight(c);
    }

    public Flight searchFlight(String s) {
        return flightCollection.searchFlight(s);
    }

    public void updateFlight(String c, Flight newFlight) {
        flightCollection.updateFlight(c, newFlight);
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