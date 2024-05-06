package tasca_01.n2exercici1.factories;

import tasca_01.n2exercici1.exceptions.InvalidOption;
import tasca_01.n2exercici1.international.Brasil;
import tasca_01.n2exercici1.international.InternationalI;
import tasca_01.n2exercici1.international.USA;
import tasca_01.n2exercici1.international.Xina;



public class InternationalFactory {
    public InternationalFactory() {
    }

    public static InternationalI getContact(String name, int phone, String street, int number, int floor, int door, String zipCode, String city, String country) throws InvalidOption {
        if(country==null){
            throw new InvalidOption();
        }
        switch(country.toLowerCase()) {
            case "brasil":
                return new Brasil(name,  phone, street,  number,  floor,  door,  zipCode,  city);
            case "xina":
                return new Xina(name,  phone, street,  number,  floor,  door,  zipCode,  city);
            case "usa":
                return new USA(name,  phone, street,  number,  floor,  door,  zipCode,  city);
            default:
                throw new InvalidOption();
        }

    }
}
