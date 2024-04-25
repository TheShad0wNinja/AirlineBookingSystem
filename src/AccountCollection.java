import java.util.ArrayList;

public class AccountCollection {
    final private ArrayList<Account> accounts;

    public AccountCollection() {
        this.accounts = new ArrayList<>();
    }

    //TODO: ADD PARAMETERS TO CREATE ACCOUNT
    //TODO: ADD ERROR HANDING FOR INVALID INPUT
    public void addAccount() {
//        accounts.add(newAccount);
    }

    //TODO: ADD ERROR HANDING FOR INVALID INPUT
    public Account removeAccount(String deleteAccount) {
        Account removedAccount = null;
        for (Account account : accounts) {
            if (account.getUsername().equals(deleteAccount)) {
                removedAccount = account;
                accounts.remove(account);
                break;
            }
        }
        return removedAccount;
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
                return account;
            }
        }
        return null;
    }
}
