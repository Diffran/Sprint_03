package tasca_02.n2exercici1;

import tasca_02.n2exercici1.exceptions.InvalidOptionException;

import java.util.Scanner;

import static java.lang.System.exit;

public class MainMenu {
    private static Scanner sc = new Scanner(System.in);
    private static String option;
    public static void menuMain(){
        do{
            System.out.println("--------SHOES STORE------");
            System.out.println("1- ADD ITEM");
            System.out.println("2- LIST ITEMS");
            System.out.println("3- PAY");
            System.out.println("4- EXIT");

            try {
                switch (option) {
                    case "1":
                        System.out.println("Opción 1 seleccionada: ADD ITEM");
                        break;
                    case "2":
                        System.out.println("Opción 2 seleccionada: LIST ITEMS");
                        break;
                    case "3":
                        System.out.println("Opción 3 seleccionada: PAY");
                        break;
                    case "4":
                        exit(0);
                    default:
                        throw new InvalidOptionException();
                }
            }catch(InvalidOptionException e){
                System.out.println(e.getMessage());
            }

        }while(!option.equals("4"));

    }
}
