package tasca_01.n2exercici1.international;

public class Brasil implements InternationalI{
    private static final String PREFIX_BRASIL = "+63 ";
    private static final String BRASIL = "Brasil";
    private String address;
    private String phone;
    private final String name;

    public Brasil(String name, int phone,String street, int number, int floor, int door, String zipCode, String city) {
        this.name = name;
        this.phone = phoneFormat(phone);
        this.address = addressFormat(street,number,floor, door,zipCode,city);
    }

    @Override
    public String toString(){
        return "NAME: "+this.name+"\nAddress: "+this.address+"\nPhonenumber: "+this.phone+"\n---------------------------------------";
    }
    @Override
    public String phoneFormat(int phone) {
        return PREFIX_BRASIL+phone;
    }

    @Override
    public String addressFormat(String street, int number, int floor, int door, String zipCode, String city) {
        return street+", "+number+" "+floor+" "+door+", "+zipCode+"\n"+city+", "+BRASIL;
    }
}
