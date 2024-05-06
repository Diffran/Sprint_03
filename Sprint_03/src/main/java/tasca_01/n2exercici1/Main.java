package tasca_01.n2exercici1;


import org.w3c.dom.ls.LSOutput;
import tasca_01.n2exercici1.exceptions.InvalidOption;
import tasca_01.n2exercici1.factories.AbstractContactFactory;
import tasca_01.n2exercici1.factories.InternationalFactory;
import tasca_01.n2exercici1.factories.NationalFactory;

public class Main {
    public static void main(String[] args) {
        AbstractContactFactory a = new AbstractContactFactory();
        InternationalFactory i = a.getInternational();
        NationalFactory n = a.getNational();
        try{
            System.out.println(n.getContact("Arturo",45678912,"calle de la calabaza",5,2,1,"08045","MAD"));
        }catch(InvalidOption e){
            System.out.println(e.getMessage());
        }

    }

}
