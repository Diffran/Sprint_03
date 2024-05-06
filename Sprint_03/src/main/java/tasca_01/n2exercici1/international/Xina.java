package tasca_01.n2exercici1.international;

public class Xina implements InternationalI{
    private static final String PREFIX_XINA = "+78 ";
    private static final String XINA = "Xina";
    private String address;
    private String phone;
    private final String name;

    public Xina(String name, int phone,String street, int number, int floor, int door, String zipCode, String city) {
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
        return PREFIX_XINA+phone;
    }

    @Override
    public String addressFormat(String street, int number, int floor, int door, String zipCode, String city) {
        return city+", "+XINA+"\n"+street+", "+number+" "+floor+" "+door+", "+zipCode;
    }
}
