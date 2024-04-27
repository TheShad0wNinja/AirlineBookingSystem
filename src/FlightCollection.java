import java.io.*;
import java.util.ArrayList;

public class FlightCollection {

    private ArrayList<Flight> flights;

    public FlightCollection() {
        try {
            flights = DataStore.loadData("Flights.txt");
        } catch (FileNotFoundException e) {
            flights = new ArrayList<>();
        } catch (IOException e) {
            System.out.println("ERRROR");
            throw new RuntimeException(e);
        }
    }

    //TODO: ADD THE PARAMETERS REQUIRED TO CREATE A NEW FLIGHT
    public void addFlight(Flight f) {
        //TODO: VALIDATION AND ERROR FOR INVALID INPUT
        this.flights.add(f);
        DataStore.saveData("Flights.txt", flights);
    }

    //TODO: THROW ERROR IF INVALID CODE
    public Flight removeFlight(String c) {
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getFlightNum().equals(c)) {
                DataStore.saveData("Flights.txt", flights);
                return flights.remove(i);
            }

        }
        return null;
    }

    public Flight searchFlight(String s) {
        for (Flight flight : flights) {
            if (flight.getFlightNum().equals(s)) {
                return flight;
            }
        }
        return null;
    }

    public double getTotalRouteFare(Route route) {
        double total = 0;
        for (Flight flight : flights) {
            if (flight.getRoute().equals(route))
                total += flight.getTotalFare();
        }
        return total;
    }

    public int getTotalBookingCount(Route route) {
        int count = 0;
        for (Flight flight : flights) {
            if (flight.getRoute().equals(route)) {
                for (Seat seat: flight.getSeats()) {
                    if (seat.getOccupied())
                        count++;
                }
            }

        }
        return count;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public ArrayList<Flight> getAvailableFlights() {
        ArrayList<Flight> availableFlights = new ArrayList<>();

        for (Flight flight : flights) {
            int count = 0;
            for (Seat seat : flight.getSeats()) {
                if (!seat.getOccupied())
                    count++;
            }

            if (count < flight.getSeats().size())
                availableFlights.add(flight);
        }

        return availableFlights;
    }

    //TODO: CREATE FUNCTIONS, HAVE IT COMPARE VALUES WITH THE PASSED FLIGHT AND EDIT
    //TODO: ERRORS FOR INVALID INPUTS
    public void updateFlight(String c, Flight newFlight) {
    }



}
