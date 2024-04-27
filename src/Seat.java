import java.io.Serializable;

public class Seat implements Serializable {
    public static enum SeatType {
        ECONOMY,
        BUSINESS,
        FIRST_CLASS,
    };

    private Double fare;
    private SeatType type;
    private char letter;
    private int number;
    private boolean occupied;

    public Seat(Double fare, SeatType type, char letter, int number) {
        this(fare, type, letter, number, false);
    }

    public Seat(Double fare, SeatType type, char letter, int number, boolean occupied) {
        this.fare = fare;
        this.type = type;
        this.letter = letter;
        this.number = number;
        this.occupied = occupied;
    }

    public Double getFare() {
        return fare;
    }

    public SeatType getType() {
        return type;
    }

    public char getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

    public boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(boolean Occupied) {
        this.occupied = Occupied;
    }

    public void setFare(Double Fare) {
        this.fare = Fare;
    }

    public void setType(SeatType type) {
        this.type = type;
    }

    public void setLetter(char Letter) {
        this.letter = Letter;
    }

    public void setNumber(int Number) {
        this.number = Number;
    }


}
