package tasca_01.n2exercici1Corregit.factories;

import tasca_01.n2exercici1Corregit.address.IAddress;
import tasca_01.n2exercici1Corregit.address.USAddress;
import tasca_01.n2exercici1Corregit.phonenumber.IPhoneNumber;
import tasca_01.n2exercici1Corregit.phonenumber.USPhoneNumber;

public class USAFactory implements IContactFactory{
    @Override
    public IAddress createAddress(String address) {
        return new USAddress(address);
    }

    @Override
    public IPhoneNumber createPhoneNumber(String number) {
        return new USPhoneNumber(number);
    }
}
