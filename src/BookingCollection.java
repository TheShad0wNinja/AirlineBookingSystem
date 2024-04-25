import java.time.LocalDate;
import java.util.ArrayList;

public class BookingCollection {
    ArrayList<Booking> bookings;

    public BookingCollection() {
        this.bookings = new ArrayList<>();
    }

    public void addBooking(Passenger passenger) {
        Booking newBooking = new Booking(passenger, LocalDate.now());
        bookings.add(newBooking);
    }

    //TODO: Implement
    public void updateBooking(String bookingCode, Booking newBooking){

    }

    public void removeBooking(String bookingCode) {
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).getBookingCode().equals(bookingCode)) {
                bookings.remove(i);
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

    public void addBookingTicket(String bookingCode, Flight flight, Seat seat, String passengerName) {
        //TODO: implement error for invalid code
        Booking booking = searchBooking(bookingCode);
        booking.reserveTicket(flight, seat, passengerName);
    }

    public void removeBookingTicket(String bookingCode, String ticketCode){
        //TODO: implement error for invalid code
        Booking booking = searchBooking(bookingCode);
        //TODO: error if invalid ticket code
        for (Ticket ticket : booking.getTickets()) {
            if (ticket.getTicketCode().equals(ticketCode))
                booking.getTickets().remove(ticket);
        }
    }
}
