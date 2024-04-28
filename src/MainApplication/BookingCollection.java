package MainApplication;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class BookingCollection {
    private ArrayList<Booking> bookings;

    public BookingCollection() {
        try {
            bookings = DataStore.loadData("Bookings.txt");
        } catch (IOException e) {
            System.err.println("Unable to read saved bookings");
            bookings = new ArrayList<>();
        }
    }

    public Booking addBooking(Passenger passenger, Flight flight, Seat seat, String passengerName) throws IOException {
        Booking newBooking = new Booking(passenger, LocalDate.now());
        seat.setOccupied(true);
        newBooking.reserveTicket(flight, seat, passengerName);
        bookings.add(newBooking);
        DataStore.saveData("Bookings.txt", bookings);
        return newBooking;
    }

    //TODO: Implement
    public void updateBooking(String bookingCode, Booking newBooking){
        DataStore.saveData("Bookings.txt", bookings);
    }

    public void removeBooking(String bookingCode) {
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).getBookingCode().equals(bookingCode)) {
                bookings.remove(i);
                DataStore.saveData("Bookings.txt", bookings);
                return;
            }
        }
    }

    public Booking searchBooking(String bookingCode) {
        for (Booking booking : bookings)
            if (booking.getBookingCode().equals(bookingCode))
                return booking;
        return null;
    }

    public ArrayList<Booking> searchPassengerBookings(Passenger passenger) {
        ArrayList<Booking> passengerBookings = new ArrayList<>();
        for (Booking booking : bookings)
            if (booking.getPassenger().equals(passenger))
                passengerBookings.add(booking);
        return passengerBookings;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }
}
