package tasca_01.n2exercici1Corregit.address;

public class USAddress implements IAddress{
    private String address;
    private static final String COUNTRY = "USA";

    public USAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return this.address+", "+COUNTRY;
    }
}
