package MainApplication;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

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

    public void addFlight(Flight f) {
        flights.add(f);
        DataStore.saveData("Flights.txt", flights);
    }

    public void addFlight(String origin, String dest, int ecoRow, int ecoCol, float ecoFare, int busRow, int busCol,
                             float busFare, int firstRow, int firstCol, float firstFare, LocalDateTime dep,
                             LocalDateTime arrival) {
        Route route = new Route(origin, dest);

        ArrayList<Seat> seats = new ArrayList<>();

        for (int i = 0; i < ecoCol; i++) {
            char letter = (char) ('A' + i);
            for (int j = 1; j <= ecoRow; j++) {
                seats.add(new Seat(ecoFare, Seat.SeatType.ECONOMY, letter, j) );
            }
        }

        for (int i = 0; i < busCol; i++) {
            char letter = (char) ('A' + i);
            for (int j = 1; j <= busRow; j++) {
                seats.add(new Seat(busFare, Seat.SeatType.BUSINESS, letter, j) );
            }
        }

        for (int i = 0; i < firstCol; i++) {
            char letter = (char) ('A' + i);
            for (int j = 1; j <= firstRow; j++) {
                seats.add(new Seat(firstFare, Seat.SeatType.FIRST_CLASS, letter, j) );
            }
        }

        Flight flight = new Flight(route, seats, dep, arrival, generateRandomCode(5));

        this.flights.add(flight);
        DataStore.saveData("Flights.txt", flights);
    }

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

            if (count <= flight.getSeats().size())
                availableFlights.add(flight);
        }

        return availableFlights;
    }

    public void updateFlight(Flight flight, String origin, String dept, LocalDateTime arrival, LocalDateTime departure) {
        flight.setRoute(new Route(origin, dept));
        flight.setArrival(arrival);
        flight.setDeparture(departure);
        DataStore.saveData("Flights.txt", flights);
    }


    private static String generateRandomCode(int length) {
        String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int candidateCharsLength = candidateChars.length();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateCharsLength)));
        }

        return sb.toString();
    }

}
