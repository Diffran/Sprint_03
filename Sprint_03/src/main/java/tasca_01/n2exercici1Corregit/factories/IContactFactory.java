package tasca_01.n2exercici1Corregit.factories;

import tasca_01.n2exercici1Corregit.address.IAddress;
import tasca_01.n2exercici1Corregit.phonenumber.IPhoneNumber;

public interface IContactFactory {
    IAddress createAddress(String address);
    IPhoneNumber createPhoneNumber(String number);
}
