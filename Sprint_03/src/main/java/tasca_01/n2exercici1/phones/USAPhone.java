package tasca_01.n2exercici1.phones;

public class USAPhone implements PhoneI{
    private String phoneNumberFormat;
    private int phoneNumber;
    private static final String PREFIX = "+1 ";

    public USAPhone(int phoneInt) throws  NullPointerException{
        this.phoneNumber=phoneInt;
        this.phoneNumberFormat = correctPhoneFormat(phoneInt);
    }

    @Override
    public String correctPhoneFormat(int phoneNumber) throws NullPointerException{
        String format;
        format = String.valueOf(phoneNumber);
        format = PREFIX + "("+format.substring(0,3)+") "+format.substring(3,6)+"-"+format.substring(5);
        return format;
    }
    @Override
    public String toString(){
        return "PhoneNumber: "+phoneNumberFormat;
    }

    //-----------------------------GETTERS AND SETTERS-----------------------------------------


    public String getPhoneNumberFormat() {
        return phoneNumberFormat;
    }

    public void setPhoneNumberFormat(String phoneNumberFormat) {
        this.phoneNumberFormat = phoneNumberFormat;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
