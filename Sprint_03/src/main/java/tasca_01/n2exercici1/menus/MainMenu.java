package tasca_01.n2exercici1.menus;

import tasca_01.n2exercici1.exceptions.NotValidMenuOptionException;

import java.util.Scanner;

import static java.lang.System.exit;

public class MainMenu {
    private static Scanner sc = new Scanner(System.in);
    private static String option;

    public static void mainMenu(){
        do {
            System.out.println("----------MENU---------");
            System.out.println("1- ADD CONTACT");
            System.out.println("2- LIST CONTACTS");
            System.out.println("3- EXIT");
            System.out.println("Choose an option: ");
            try {
                option = sc.nextLine();
                switch (option) {
                    case "1":
                        //CRrea el contacte, necessitara address i phone i per fer-ho correctament d'on és. per poder
                        //escullir quina factory utilitzar
                        break;
                    case "2":
                        //agafa la list de contactes i la recorre
                        break;
                    case "3":
                        exit(0);
                    default:
                        throw new NotValidMenuOptionException();
                }
            }catch(NumberFormatException e){
                System.out.println("ERROR: "+e.getMessage()+" - Please enter a integer");
            }catch(NotValidMenuOptionException e){
                System.out.println(e.getMessage());
            }
        }while(!option.equals("3"));
    }
}
