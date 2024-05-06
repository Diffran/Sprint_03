package tasca_01.n2exercici1.menu;

import tasca_01.n2exercici1.exceptions.InvalidOption;
import tasca_01.n2exercici1.factories.AbstractContactFactory;
import tasca_01.n2exercici1.international.Brasil;
import tasca_01.n2exercici1.national.MAD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact {
    private static String option ;
    private static Scanner sc = new Scanner(System.in);
    private static List<Object> contactos = new ArrayList<Object>();
    private static AbstractContactFactory abstactFactory = new AbstractContactFactory();

    private static String street, city, country, zipCode, name;
    private static int floor, door, number,phone;



    public static void createContact() throws InvalidOption, NumberFormatException{
        System.out.println("--------NATIONAL OR INTERNATIONAL-------");
        System.out.println("1- NATIONAL CONTACT");
        System.out.println("2- INTERNATIONAL CONTACT");
        System.out.println("Choose an option:");

        option = sc.nextLine();

        switch (option) {
            case "1":
                    getData();
                    contactos.add(abstactFactory.getNational(name,  phone, street,  number,  floor,  door,  zipCode,  city));
                System.out.println("Contact saved successfully");
                break;
            case "2":
                    getData();
                    getDataCountry();
                contactos.add(abstactFactory.getInternational(name,  phone, street,  number,  floor,  door,  zipCode,  city,country));
                System.out.println("Contact saved successfully");
                break;
            default:
                throw new InvalidOption();
        }

    }

    private static void getData() throws NumberFormatException{
        System.out.println("enter contact name:");
        name = sc.nextLine();
        System.out.println("enter contact phonenumber:");
        phone = Integer.parseInt(sc.nextLine());
        System.out.println("enter contact street:");
        street = sc.nextLine();
        System.out.println("enter contact building number:");
        number = Integer.parseInt(sc.nextLine());
        System.out.println("enter contact floor:");
        floor = Integer.parseInt(sc.nextLine());
        System.out.println("enter contact door:");
        door = Integer.parseInt(sc.nextLine());
        System.out.println("enter contact zip-code:");
        zipCode = sc.nextLine();
        System.out.println("enter contact city:");
        city = sc.nextLine();
    }
    private static void getDataCountry(){
        System.out.println("enter contact country:");
        country = sc.nextLine();
    }

    //--------------------LIST---------------------------------------
    public static void listContacts(){
        System.out.println("-----------CONTACT LIST------------------");
        contactos.forEach(object -> System.out.println(object));
    }

}
