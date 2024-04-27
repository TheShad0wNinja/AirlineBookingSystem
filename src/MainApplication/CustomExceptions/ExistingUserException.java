package MainApplication.CustomExceptions;

public class ExistingUserException extends RuntimeException{
    public ExistingUserException() {
        super("This username is already in use");
    }
}
