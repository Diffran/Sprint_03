package tasca_01.n2exercici1Corregit;

import tasca_01.n2exercici1.exceptions.InvalidOption;
import tasca_01.n2exercici1Corregit.factories.Contact;
import tasca_01.n2exercici1Corregit.factories.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Demo {
    private static Scanner sc = new Scanner(System.in);
    private static String option;
    private static ArrayList<Contact> contactList = new ArrayList<Contact>();
    public static void mainMenu(){
        do{
            System.out.println("-----------------CONTACT LIST MANAGEMENT-------------------------");
            System.out.println("1- CREATE NEW CONTACT");
            System.out.println("2- LIST CONTACTS");
            System.out.println("3- EXIT");
            System.out.println("Choose an option: ");

            option = sc.nextLine();
            try{
                switch(option){
                    case "1":
                        createNewContact();
                        break;
                    case "2":
                        listConstactList();
                        break;
                    case "3":
                        System.exit(0);
                    default:
                        throw new InvalidOption();
                }
            }catch(InvalidOption e){
                System.out.println(e.getMessage());
            }catch(NumberFormatException e){
                System.out.println("Please enter a Integer");
            }
        }while(!option.equals("3"));
    }
    private static void createNewContact() throws InvalidOption, NumberFormatException{
        Pattern phoneNumberPattern = null;

        System.out.println("------COUNTRY MENU--------");
        System.out.println("1- USA");
        System.out.println("2- XINA");
        System.out.println("3- SPAIN");
        System.out.println("Select the country:");

        option = sc.nextLine();
        IContactFactory factory = null;
        switch (option) {
            case "1":
                factory = new USAFactory();
                phoneNumberPattern = Pattern.compile("^\\d{10}$");
                break;
            case "2":
                factory = new XinaFactory();
                phoneNumberPattern = Pattern.compile("^\\d{11}$");
                break;
            case "3":
                factory = new SpainFactory();
                phoneNumberPattern = Pattern.compile("^\\d{9}$");
                option = ""; //si no al tornar al menu principal es surt del bucle
                break;
            default:
                throw new InvalidOption();
        }

        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the address:");
        String address = sc.nextLine();
        System.out.println("Enter the phone number:");
        String phoneNumber = sc.nextLine();

        if(!phoneNumberPattern.matcher(phoneNumber).matches()){
            throw new InvalidOption();
        }
        int intComprovation = Integer.parseInt(phoneNumber);

        Contact contact = new Contact(name, factory.createAddress(address), factory.createPhoneNumber(phoneNumber) );
        contactList.add(contact);
        System.out.println("Contact addes successfully");

    }
    private static void listConstactList(){
        if(contactList.isEmpty()){
            System.out.println("Empty Contact List... make some friends");
        }else{
            System.out.println("-------------CONTACT LIST-----------");
            contactList.forEach(contact -> System.out.println(contact));
        }
    }
}
