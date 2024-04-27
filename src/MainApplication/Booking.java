package MainApplication;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Booking implements Serializable {
    private String bookingCode;
    private ArrayList<Ticket> tickets;
    private Passenger passenger;
    private LocalDate date;

    public Booking(Passenger passenger, LocalDate date) {
        this(generateRandomCode(10), new ArrayList<>(), passenger, date);
    }

    public Booking(String bookingCode, ArrayList<Ticket> tickets, Passenger passenger, LocalDate date) {
        this.bookingCode = bookingCode;
        this.tickets = tickets;
        this.passenger = passenger;
        this.date = date;
    }

    //TODO: Add error handling
    public void reserveTicket(Flight flight, Seat seat, String passengerName){
        Ticket newTicket = new Ticket(generateRandomCode(8), flight, seat, passengerName);

        tickets.add(newTicket);
    }


    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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

    @Override
    public String toString() {
        return "MainApplication.Booking{" + "bookingCode='" + bookingCode + '\'' + ", tickets=" + tickets + ", passenger=" + passenger + ", date=" + date + '}';
    }
}
