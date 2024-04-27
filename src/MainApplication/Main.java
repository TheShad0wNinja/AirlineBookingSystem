package MainApplication;

import MainApplication.UI.MainFrame;
import MainApplication.UI.SignUpUI;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        FlightCollection fc = new FlightCollection();
        BookingCollection bc = new BookingCollection();
        AccountCollection ac = new AccountCollection(bc, fc);
        Authentication auth = new Authentication(ac);

        Flight flight = new Flight(new Route("AA", "BB"),
                new ArrayList<Seat> (List.of(new Seat(12.0, Seat.SeatType.ECONOMY, 'a', 1))),
                LocalDateTime.now(),
                LocalDateTime.now(),
                "AAA");

        Flight flight1 = new Flight(new Route("AA", "BB"),
                new ArrayList<Seat> (List.of(new Seat(12.0, Seat.SeatType.ECONOMY, 'a', 1))),
                LocalDateTime.now(),
                LocalDateTime.now(),
                "BBB");

        Passenger passenger = new Passenger("A", "A", "A", LocalDate.now());;
        Passenger passenger1 = new Passenger("B", "B", "B", LocalDate.now());;

//        ac.addAccount("admin", "admin", "B", LocalDate.now(), true);
//        ac.addAccount(passenger);
//        ac.addAccount(passenger1);

//        fc.addFlight(flight);
//        fc.addFlight(flight1);

        System.out.println(fc.getFlights());
        System.out.println(ac.getAccounts());
        System.out.println(bc.getBookings());

//        ((MainApplication.Passenger) ac.getAccounts().get(1)).addBooking(flight1, null);

//        ((MainApplication.Admin) ac.getAccounts().get(0)).addNewFlight(flight1);

//        System.out.println(fc.getFlights());

//        ((MainApplication.Passenger) ac.getAccounts().get(0)).addBooking();

        new SignUpUI(auth);
    }
}