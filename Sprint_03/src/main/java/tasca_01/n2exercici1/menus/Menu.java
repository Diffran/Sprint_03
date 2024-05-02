package tasca_01.n2exercici1.menus;

import tasca_01.n2exercici1.exceptions.NotValidMenuOptionException;
import java.util.Scanner;
import static java.lang.System.exit;

public class Menu {

    private static Scanner sc = new Scanner(System.in);
    private static String option;

    private static void countryMenu(){
        System.out.println("---------------COUNTRY MENU---------------");
        System.out.println("1- SPAIN");
        System.out.println("2- EEUU");
        System.out.println("3- XINA");
        System.out.println("choose a country: ");
        option = sc.nextLine();
        switch (option) {
            case "1":
                //crida a la factory de spain. tant pel telefon com per la address
                //phone -> 9 num
                //address -> carrer, numero, cp, ciutat
                break;
            case "2":
                //crida factory de eeuu, tant tel com address
                //phone 10 num
                //address -> carrer, district, city, provincem pc
                break;
            case "3":
                //factory eeuu
                break;
            case "4":
                exit(0);
            default:
                //throw new NotValidMenuOptionException();
        }
    }
    public static void createNewContact(){

    }
    /**
     * Estados Unidos:
     * Formato de teléfono: +1 (555) 123-4567
     * Formato de dirección: street, city, state + country
     * China:
     * Formato de teléfono: +86 10 1234 5678
     * Formato de dirección: street, city,province + country
     * España:
     * Formato de teléfono: +34 123 45 67 89
     * Formato de dirección: street, city + country
     */
}
