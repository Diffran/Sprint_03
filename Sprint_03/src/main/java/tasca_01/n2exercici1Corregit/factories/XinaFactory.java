package tasca_01.n2exercici1Corregit.factories;

import tasca_01.n2exercici1Corregit.address.IAddress;
import tasca_01.n2exercici1Corregit.address.XinaAddress;
import tasca_01.n2exercici1Corregit.phonenumber.IPhoneNumber;
import tasca_01.n2exercici1Corregit.phonenumber.XinaPhoneNumber;

public class XinaFactory implements IContactFactory{
    @Override
    public IAddress createAddress(String address) {
        return new XinaAddress(address);
    }

    @Override
    public IPhoneNumber createPhoneNumber(String number) {
        return new XinaPhoneNumber(number);
    }
}
