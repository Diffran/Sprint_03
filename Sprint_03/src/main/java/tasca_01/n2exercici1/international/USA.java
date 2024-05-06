package tasca_01.n2exercici1.international;

public class USA implements InternationalI{
    private static final String PREFIX_USA = "(505) ";
    private static final String USA = "USA";
    private String address;
    private String phone;
    private final String name;

    public USA(String name, int phone,String street, int number, int floor, int door, String zipCode, String city) {
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
        return PREFIX_USA+phone;
    }

    @Override
    public String addressFormat(String street, int number, int floor, int door, String zipCode, String city) {
        return number+" "+floor+" "+door+", "+street+", "+zipCode+"\n"+city+", "+USA;
    }
}
