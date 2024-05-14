package tasca_01.n2exercici1Corregit.factories;

import tasca_01.n2exercici1Corregit.address.IAddress;
import tasca_01.n2exercici1Corregit.address.SpainAddress;
import tasca_01.n2exercici1Corregit.phonenumber.IPhoneNumber;
import tasca_01.n2exercici1Corregit.phonenumber.SpainPhoneNumber;

public class SpainFactory implements IContactFactory{
    @Override
    public IAddress createAddress(String address) {
        return new SpainAddress(address);
    }

    @Override
    public IPhoneNumber createPhoneNumber(String number) {
        return new SpainPhoneNumber(number);
    }
}
