package tasca_01.n2exercici1.exceptions;

public class InvalidOption extends Exception{
    public InvalidOption() {
        super("ERROR: invalid option, please enter a valid option");
    }
}
