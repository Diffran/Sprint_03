package tasca_01.n2exercici1.exceptions;

public class NotValidMenuOptionException extends Exception{
    public NotValidMenuOptionException() {
        super("invalid menu option");
    }
}
