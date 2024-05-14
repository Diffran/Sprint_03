package tasca_01.n2exercici1Corregit.phonenumber;

public class USPhoneNumber implements IPhoneNumber{
    private String phoneNumber;
    private static final String PREFIX = "+1";

    public USPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return PREFIX+" "+this.phoneNumber;
    }
}
