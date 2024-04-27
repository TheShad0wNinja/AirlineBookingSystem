package MainApplication.CustomExceptions;

public class InvalidPassword extends IllegalArgumentException {
    public InvalidPassword() {
        super("The password does is incorrect");
    }
}