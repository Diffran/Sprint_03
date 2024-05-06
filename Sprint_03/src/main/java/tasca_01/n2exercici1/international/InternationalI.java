package tasca_01.n2exercici1.international;

public interface InternationalI {
    String toString();
    String phoneFormat(int phone);
    String addressFormat(String street, int number, int floor, int door, String zipCode, String city);

}
