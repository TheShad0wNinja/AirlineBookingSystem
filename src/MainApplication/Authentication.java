package MainApplication;

import MainApplication.CustomExceptions.ExistingUserException;
import MainApplication.CustomExceptions.InvalidPassword;
import MainApplication.CustomExceptions.UserNotExistException;

import java.time.LocalDate;

public class Authentication {
   
    final private AccountCollection accountCollection;
    private Account currentAccount;

    public Authentication(AccountCollection accountCollection) {
        this.accountCollection = accountCollection;
        this.currentAccount = null;
    }

    public void signup (String name, String username , String password, LocalDate dob) throws ExistingUserException {
        if (accountCollection.searchAccount(username) != null) {
            throw new ExistingUserException();
        }
        currentAccount = accountCollection.addAccount(name, username, password, dob, false);
    }
    
    public void login(String username, String password) throws UserNotExistException, InvalidPassword {

        Account account = accountCollection.searchAccount(username);

        if (account == null) {
            throw new UserNotExistException();
        } else if (!account.getPassword().equals(password)) {
            throw new InvalidPassword();
        } else {
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

    public void updateData() {
        accountCollection.updateData();
    }
}
