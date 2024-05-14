package tasca_01.n2exercici1Corregit.address;

public class SpainAddress implements IAddress{
    private String address;
    private static final String COUNTRY = "Spain";

    public SpainAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return this.address+", "+COUNTRY;
    }
}
