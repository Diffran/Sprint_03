package tasca_01.n2exercici1.menu;

import tasca_01.n2exercici1.exceptions.InvalidOption;

import java.util.Scanner;

public class MainMenu {
    private static String option;
    private static Scanner sc = new Scanner(System.in);
    public static void mainMenu(){
        System.out.println("-----------------AGENDA--------------------------");
        System.out.println("1- ADD CONTACT");
        System.out.println("2- LIST CONTACTS");
        System.out.println("3- EXIT");
        System.out.println("choose an option: ");

        option = sc.nextLine();
        do{
            try{
                switch(option){
                    case "1":
                        Contact.createContact();
                    case "2":
                        Contact.listContacts();
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
