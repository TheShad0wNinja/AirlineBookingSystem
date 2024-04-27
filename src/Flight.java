import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Flight implements Serializable {
    private Route route;
    private ArrayList<Seat> seats;
    private LocalDateTime departure;
    private LocalDateTime arrival;
    private String flightNum;

    public Flight(Route route, ArrayList<Seat> seats, LocalDateTime departure, LocalDateTime arrival,
                  String flightNum) {
        this.route = route;
        this.flightNum = flightNum;
        this.arrival = arrival;
        this.departure = departure;
        this.seats = seats;
    }

    public Route getRoute() {
        return route;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public void setDeparture(LocalDateTime departure) {
        this.departure = departure;
    }

    public void setArrival(LocalDateTime arrival) {
        this.arrival = arrival;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public double getTotalFare() {
        double total = 0;
        for (Seat seat : seats) {
            if (seat.getOccupied()) total += seat.getFare();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Flight{" + "route=" + route + ", flightNum='" + flightNum + '\'' + '}';
    }

    public ArrayList<Seat> viewAvailableSeats() {
        ArrayList<Seat> s = new ArrayList<>();

        for (Seat seat : seats) {
            if (!seat.getOccupied())
                s.add(seat);
        }

        return s;
    }

    public Seat searchSeat(char letter, int number, Seat.SeatType type) {
        for (Seat seat : seats) {
            if (seat.getLetter() == letter && seat.getType() == type && seat.getNumber() == number) return seat;
        }
        return null;
    }

}
