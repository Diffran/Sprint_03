package tasca_01.n2exercici1.factories;

import tasca_01.n2exercici1.exceptions.InvalidOption;
import tasca_01.n2exercici1.international.InternationalI;
import tasca_01.n2exercici1.national.NationalI;

public class AbstractContactFactory {
    private InternationalFactory internationalFact = new InternationalFactory();
    private NationalFactory nationalFact = new NationalFactory();

    public InternationalI  getInternational(String name, int phone, String street, int number, int floor, int door, String zipCode, String city, String country) throws InvalidOption {
        return internationalFact.getContact(name,  phone, street,  number,  floor,  door,  zipCode,  city,country);
    }
    public NationalI getNational(String name, int phone, String street, int number, int floor, int door, String zipCode, String city) throws InvalidOption{
        return nationalFact.getContact(name,  phone, street,  number,  floor,  door,  zipCode,  city);
    }

}
