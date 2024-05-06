package tasca_01.n2exercici1;


import org.w3c.dom.ls.LSOutput;
import tasca_01.n2exercici1.factories.AbstractContactFactory;
import tasca_01.n2exercici1.factories.InternationalFactory;
import tasca_01.n2exercici1.factories.NationalFactory;

public class Main {
    AbstractContactFactory a = new AbstractContactFactory();
    InternationalFactory i = a.getInternational();
    NationalFactory n = a.getNational();
    System.out.println();
}
