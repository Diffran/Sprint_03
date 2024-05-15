package tasca_02.n2exercici1;

import tasca_02.n2exercici1.exceptions.InvalidOptionException;
import tasca_02.n2exercici1.store.ShoeStore;

import java.util.Scanner;

import static java.lang.System.exit;

public class MainMenu {
    private static Scanner sc = new Scanner(System.in);
    private static String option;
    private static ShoeStore store = new ShoeStore();
    public static void menuMain(){
        do{
            System.out.println("--------SHOES STORE------");
            System.out.println("1- ADD ITEM");
            System.out.println("2- LIST ITEMS");
            System.out.println("3- PAY");
            System.out.println("4- NEW PURCHASE");
            System.out.println("4- EXIT");

            try {
                option = sc.nextLine();
                switch (option) {
                    case "1":
                        store.addItem();
                        break;
                    case "2":
                        store.toString();
                        break;
                    case "3":
                        store.makePayment(store.getTotalPrice());
                        break;
                    case "4":
                        store = new ShoeStore();
                    case"5":
                        exit(0);
                    default:
                        throw new InvalidOptionException();
                }
            }catch(InvalidOptionException e){
                System.out.println(e.getMessage());
            }

        }while(!option.equals("5"));

    }
}
