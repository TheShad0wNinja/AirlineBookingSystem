import java.time.LocalDateTime;
import java.util.ArrayList;

public class Flight {
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

    public void viewAvailableSeats() {
        StringBuilder out = new StringBuilder();

        out.append("-------------------------------------------------------------------\n");

        out.append(String.format("| %-15s | %-8s | %-15s |\n", "Seat Number", "Fare", "Type"));

        out.append("-------------------------------------------------------------------\n");

        String type;
        for (Seat seat : seats) {
            if (seat.getOccupied()) continue;
            type = switch (seat.getType()) {
                case ECONOMY -> "Economy";
                case BUSINESS -> "Business";
                case FIRST_CLASS -> "First Class";
            };
            out.append(String.format("| %-15s | %-8.2f | %-15s |\n",
                    String.format("%c%d", seat.getLetter(), seat.getNumber()),
                    seat.getFare(),
                    type));
        }

        out.append("-------------------------------------------------------------------\n");

        System.out.println(out);
    }

    public Seat searchSeat(char letter, int number, Seat.SeatType type) {
        for (Seat seat : seats) {
            if (seat.getLetter() == letter && seat.getType() == type && seat.getNumber() == number) return seat;
        }
        return null;
    }

}
