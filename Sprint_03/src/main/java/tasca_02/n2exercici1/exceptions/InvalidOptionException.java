package tasca_02.n2exercici1.exceptions;

public class InvalidOptionException extends Exception{
    public InvalidOptionException() {
        super("Invalid Option, please enter a valid option");
    }
}
