package tasca_01.n2exercici1Corregit.factories;

import tasca_01.n2exercici1Corregit.address.IAddress;
import tasca_01.n2exercici1Corregit.phonenumber.IPhoneNumber;

public class Contact {
    private String name;
    private IAddress address;
    private IPhoneNumber phoneNumber;

    public Contact(String name, IAddress address, IPhoneNumber phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public IAddress getAddress() {
        return address;
    }

    public IPhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address.getAddress() + "\nPhone Number: " + phoneNumber.getPhoneNumber()
                +"\n------------------------------------------------------------";
    }
}
