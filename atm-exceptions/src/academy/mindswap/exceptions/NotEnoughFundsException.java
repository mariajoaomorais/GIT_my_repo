package academy.mindswap.exceptions;

public class NotEnoughFundsException extends ATMException{
    public NotEnoughFundsException() {
        super("You don't have enough funds to access.");
    }
}
