import java.io.IOException;
import java.util.ArrayList;

public class AccountCollection {
    private ArrayList<Account> accounts;

    public AccountCollection(BookingCollection bookingCollection, FlightCollection flightCollection) {
        try {
            accounts = DataStore.loadData("Accounts.txt");
        } catch (IOException e) {
            System.err.println("Unable to read saved Accounts");
            accounts = new ArrayList<>();
        }

        if (accounts != null)
            for (Account account : accounts) {
                if (account instanceof Passenger passenger) {
                    System.out.println("Passenger " + passenger.getUsername());
                    passenger.setFlightCollection(flightCollection);
                    passenger.setBookingCollection(bookingCollection);
                } else if (account instanceof Admin admin) {
                    System.out.println("Admin " + admin.getUsername());
                    admin.setFlightCollection(flightCollection);
                }
            }
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    //TODO: ADD PARAMETERS TO CREATE ACCOUNT
    //TODO: ADD ERROR HANDING FOR INVALID INPUT
    public void addAccount(Account newAccount) {
        accounts.add(newAccount);
        DataStore.saveData("Accounts.txt", accounts);
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
