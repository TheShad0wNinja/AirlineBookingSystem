public class Ticket {
    private String ticketCode;
    private Flight flight;
    private Seat seat;
    private String passengerName;

    public Ticket(String ticketCode, Flight flight, Seat seat, String passengerName) {
        this.ticketCode = ticketCode;
        this.flight = flight;
        this.seat = seat;
        this.passengerName = passengerName;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        return ticketCode.equals(ticket.ticketCode);
    }

    @Override
    public int hashCode() {
        return ticketCode.hashCode();
    }
}
