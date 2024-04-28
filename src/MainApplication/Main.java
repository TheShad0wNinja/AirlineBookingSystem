package MainApplication;

import MainApplication.UI.SignInUI;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FlightCollection fc = new FlightCollection();
        BookingCollection bc = new BookingCollection();
        AccountCollection ac = new AccountCollection(bc, fc);
        Authentication auth = new Authentication(ac);

//        ac.addAccount("admin", "admin", "admin", LocalDate.now(), true);

        new SignInUI(auth);
    }
}