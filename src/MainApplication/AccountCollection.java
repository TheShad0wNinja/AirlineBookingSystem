package MainApplication;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class AccountCollection {
    private ArrayList<Account> accounts;
    final private BookingCollection bookingCollection;
    final private FlightCollection flightCollection;

    public AccountCollection(BookingCollection bookingCollection, FlightCollection flightCollection) {
        this.bookingCollection = bookingCollection;
        this.flightCollection = flightCollection;
        try {
            accounts = DataStore.loadData("Accounts.txt");
        } catch (IOException e) {
            System.err.println("Unable to read saved Accounts");
            accounts = new ArrayList<>();
        }

        if (accounts != null)
            for (Account account : accounts) {
                if (account instanceof Passenger passenger) {
                    System.out.println("MainApplication.Passenger " + passenger.getUsername());
                    passenger.setFlightCollection(flightCollection);
                    passenger.setBookingCollection(bookingCollection);
                } else if (account instanceof Admin admin) {
                    System.out.println("MainApplication.Admin " + admin.getUsername());
                    admin.setFlightCollection(flightCollection);
                }
            }
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public Account addAccount(String name, String username, String password, LocalDate dob, boolean admin) {
        Account newAccount;
        if (admin)
            newAccount = new Admin(flightCollection, name , username, password, dob);
        else
            newAccount = new Passenger(flightCollection, bookingCollection, name, username, password, dob);

        accounts.add(newAccount);

        DataStore.saveData("Accounts.txt", accounts);
        return newAccount;
    }

    //TODO: ADD ERROR HANDING FOR INVALID INPUT
    public void removeAccount(String deleteAccount) {
        for (Account account : accounts) {
            if (account.getUsername().equals(deleteAccount)) {
                accounts.remove(account);
                DataStore.saveData("Accounts.txt", accounts);
                break;
            }
        }
    }

    public Account searchAccount(String username) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                return account;
            }
        }
        return null;
    }

    //TODO: ADD ERROR HANDLING FOR INVALID INPUT
    public Account updateAccount(String oldUsername, Account update) {
        for (Account account : accounts) {
            if (account.getUsername().equals(oldUsername)) {
                account.setUsername(update.getUsername());
                account.setPassword(update.getPassword());
                DataStore.saveData("Accounts.txt", accounts);
                return account;
            }
        }
        return null;
    }
}
