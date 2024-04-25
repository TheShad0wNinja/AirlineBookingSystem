import java.time.LocalDate;

public class Authentication {
   
    final private AccountCollection accountCollection;
    private Account currentAccount;

    public Authentication(AccountCollection accountCollection) {
        this.accountCollection = accountCollection;
        this.currentAccount = null;
    }

    public void signup (FlightCollection flightService, BookingCollection bookingCollection, String name, String username , String password, LocalDate dob){
//        Passenger passenger = new Passenger();
//        accountCollection.addAccount(flightService, bookingCollection, name, username, password, dob);
//        currentAccount = passenger;
    }
    
    public void login(String username, String password){
        Account account = accountCollection.searchAccount(username);
        
        if(account != null && account.getPassword().equals(password)) {
            currentAccount = account;
        }

    }

    public Account getCurrentAccount() {
        return currentAccount;
    }
    
    public boolean isAdmin() {
        return currentAccount != null && currentAccount instanceof Admin;
    }
    
    public boolean isLoggedIn() {
        return currentAccount != null;
    }

    public void logout() {
        currentAccount = null;
    }
}
