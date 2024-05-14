package tasca_01.n2exercici1Corregit.phonenumber;

public class SpainPhoneNumber implements IPhoneNumber{
    private String phoneNumber;
    private static final String PREFIX = "+34";

    public SpainPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return PREFIX+" "+this.phoneNumber;
    }
}
