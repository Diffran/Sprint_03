package tasca_01.n2exercici1.internationalFactory;

public interface InternationalI {

    static final String PREFIX_USA = "(505) ";
    static final String PREFIX_XINA = "+78 ";
    static final String XINA = "Xina";

    static final String USA = "USA";

    String toString();
    String phoneFormat(int phone);
    String addressFormat(String street, int number, int floor, int door, String zipCode, String city);

}
