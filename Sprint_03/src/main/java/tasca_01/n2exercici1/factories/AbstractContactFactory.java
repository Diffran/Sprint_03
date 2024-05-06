package tasca_01.n2exercici1.factories;

import tasca_01.n2exercici1.international.InternationalI;

public class AbstractContactFactory {
    public InternationalFactory getInternational(){
        return new InternationalFactory();
    }
    public NationalFactory getNational(){
        return new NationalFactory();
    }

}
