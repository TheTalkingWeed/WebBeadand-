package hu.unideb.inf.user;

public class UserNotFoundException extends Throwable {
    public UserNotFoundException(String message){
        super(message);
    }
}
