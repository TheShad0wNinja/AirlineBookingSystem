package MainApplication.CustomExceptions;

public class UserNotExistException extends IllegalArgumentException{
    public UserNotExistException() {
        super("This username doesn't exist");
    }
}
