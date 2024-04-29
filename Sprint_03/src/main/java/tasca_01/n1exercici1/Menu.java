package tasca_01.n1exercici1;

import java.sql.SQLOutput;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    private static Scanner sc = new Scanner(System.in);
    private static String option;
    private static Undo undo = Undo.getInstance();
    public static void mainMenu(){
        do {
            System.out.println("----------MENU---------");
            System.out.println("1- ADD ORDER");
            System.out.println("2- DELETE ORDER");
            System.out.println("3- LIST ORDERS");
            System.out.println("4- EXIT");
            System.out.println("Choose an option: ");
            try {
                option = sc.nextLine();
                switch (option) {
                    case "1":
                        undo.add(new Order());
                        break;
                    case "2":
                        undo.remove(removeMenu());
                        break;
                    case "3":
                        undo.list();
                        break;
                    case "4":
                        exit(0);
                    default:
                        System.out.println("ERROR: Invalid Option, enter a valid number.");
                }
            }catch(NumberFormatException e){
                System.out.println("ERROR: "+e.getMessage()+" - Please enter a integer");
            }
        }while(!option.equals("4"));
    }
    private static String removeMenu() throws NumberFormatException{
        System.out.println("Please enter order ID: ");
        return  sc.nextLine();
    }
}
