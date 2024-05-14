package tasca_01.n2exercici1Corregit.phonenumber;

public class XinaPhoneNumber implements IPhoneNumber{
    private String phoneNumber;
    private static final String PREFIX = "+86";

    public XinaPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return PREFIX+" "+this.phoneNumber;
    }
}
