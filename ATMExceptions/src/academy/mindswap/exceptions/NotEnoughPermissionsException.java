package academy.mindswap.exceptions;

public class NotEnoughPermissionsException extends ATMException {

    public NotEnoughPermissionsException() {
        super("You don't have enough permissions to access.");
    }

}
