package tasca_01.n2exercici1.factories;

import tasca_01.n2exercici1.exceptions.InvalidOption;
import tasca_01.n2exercici1.national.BCN;
import tasca_01.n2exercici1.national.MAD;
import tasca_01.n2exercici1.national.NationalI;

public class NationalFactory {
    public NationalFactory() {
    }

    public NationalI getContact(String name, int phone, String street, int number, int floor, int door, String zipCode, String city) throws InvalidOption{
        if(city==null){
           throw new InvalidOption();
        }
        switch(city.toUpperCase()) {
            case "BCN":
                return new BCN(name, phone, street, number, floor, door, zipCode);
            case "MAD":
                return new MAD(name, phone, street, number, floor, door, zipCode);
            default:
                throw new InvalidOption();
        }
    }
}
