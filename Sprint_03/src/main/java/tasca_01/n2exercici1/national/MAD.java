package tasca_01.n2exercici1.national;

public class MAD implements NationalI{
    private static final String NATIONAL = "Spain";
    private static final String PREFIX = "+34 ";
    private static final String CITY = "MAD";

    private String address;
    private String phone;
    private final String name;

    public MAD(String name, int phone, String street, int number, int floor, int door, String zipCode) {
        this.name = name;
        this.phone = phoneFormat(phone);
        this.address = addressFormat(street,number,floor, door,zipCode);
    }

    @Override
    public String toString(){
        return "NAME: "+this.name+"\nAddress: "+this.address+"\nPhonenumber: "+this.phone+"\n---------------------------------------";
    }
    @Override
    public String phoneFormat(int phone) {
        return PREFIX+phone;
    }

    @Override
    public String addressFormat(String street, int number, int floor, int door, String zipCode) {
        return street+", "+number+" "+floor+" "+door+", "+zipCode+"\n"+CITY+", "+NATIONAL;
    }
}
