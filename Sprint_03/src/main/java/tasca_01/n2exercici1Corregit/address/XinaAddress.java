package tasca_01.n2exercici1Corregit.address;

public class XinaAddress implements IAddress{
    private String address;
    private static final String COUNTRY = "Xina";

    public XinaAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return this.address+", "+COUNTRY;
    }
}
