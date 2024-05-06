package tasca_01.n2exercici1.national;

public interface NationalI {
    String toString();
    String phoneFormat(int phone);
    String addressFormat(String street, int number, int floor, int door, String zipCode);
}
