package MainApplication;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Passenger extends Account{
    private transient BookingCollection bookingCollection;
    private transient FlightCollection flightCollection;

    public Passenger(String name, String username, String password, LocalDate dob) {
        super(name, username, password, dob);
        this.bookingCollection = null;
        this.flightCollection = null;
    }
    public Passenger( FlightCollection flightCollection, BookingCollection bookingCollection, String name, String username, String password, LocalDate dob) {
        super(name, username, password, dob);
        this.bookingCollection = bookingCollection;
        this.flightCollection = flightCollection;
    }

    public void setBookingCollection(BookingCollection bookingCollection) {
        this.bookingCollection = bookingCollection;
    }

    public void setFlightCollection(FlightCollection flightCollection) {
        this.flightCollection = flightCollection;
    }

    public int getBookingCount() {
        return bookingCollection.searchPassengerBookings(this).size();
    }

    public Booking addBooking (Flight flight, Seat seat, String passengerName) throws IOException {
        return bookingCollection.addBooking(this, flight, seat, passengerName);
    }

    public void removeBooking(String code) {
        bookingCollection.removeBooking(code);
    }
    public ArrayList<Booking> viewBookings () {
        return bookingCollection.searchPassengerBookings(this);
    }

    public boolean searchBooking(String code) {
        return bookingCollection.searchBooking(code) != null;
    }

    public Flight searchFlight(String s) {
        return flightCollection.searchFlight(s);
    }
    public ArrayList<Flight> viewAvailableFlights() {
        return flightCollection.getAvailableFlights();
    }

    public void updateUser(String username, String name, String password, LocalDate dob) {
        this.setName(name);
        this.setUsername(username);
        this.setPassword(password);
        this.setDob(dob);
    }
}
