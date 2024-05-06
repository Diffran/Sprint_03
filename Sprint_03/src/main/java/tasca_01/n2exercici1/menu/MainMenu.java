package tasca_01.n2exercici1.menu;

import tasca_01.n2exercici1.exceptions.InvalidOption;

import java.util.Scanner;

public class MainMenu {
    private static String option;
    private static Scanner sc = new Scanner(System.in);
    public static void mainMenu(){
        do{
            System.out.println("-----------------CONTACT LIST MANAGEMENT-------------------------");
            System.out.println("1- ADD CONTACT");
            System.out.println("2- LIST CONTACTS");
            System.out.println("3- EXIT");
            System.out.println("choose an option: ");


            option = sc.nextLine();
            try{
                switch(option){
                    case "1":
                        Contact.createContact();
                        break;
                    case "2":
                        Contact.listContacts();
                        break;
                    case "3":
                        System.exit(0);
                    default:
                        throw new InvalidOption();
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }while(!option.equals("3"));
    }

}
