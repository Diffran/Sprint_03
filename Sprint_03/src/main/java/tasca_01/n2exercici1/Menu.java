package tasca_01.n2exercici1;


import tasca_01.n2exercici1.exceptions.NotValidMenuOptionException;

import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {

    private static Scanner sc = new Scanner(System.in);
    private static String option;

    public static void mainMenu(){
        do {
            System.out.println("----------MENU---------");
            System.out.println("1- ADD CONTACT");
            System.out.println("2- DELETE CONTACT");
            System.out.println("3- LIST CONTACTS");
            System.out.println("4- EXIT");
            System.out.println("Choose an option: ");
            try {
                option = sc.nextLine();
                switch (option) {
                    case "1":
                        //CRrea el contacte, necessitara address i phone i per fer-ho correctament d'on és. per poder
                        //escullir quina factory utilitzar
                        break;
                    case "2":
                        //elimina pel numero de telefon..
                        break;
                    case "3":
                        //agafa la list de contactes i la recorre
                        break;
                    case "4":
                        exit(0);
                    default:
                        throw new NotValidMenuOptionException();
                }
            }catch(NumberFormatException e){
                System.out.println("ERROR: "+e.getMessage()+" - Please enter a integer");
            }catch(NotValidMenuOptionException e){
                System.out.println(e.getMessage());
            }
        }while(!option.equals("4"));
    }
    private static String removeContact() throws NumberFormatException{
        System.out.println("Please enter the phone number of the contact you wish to delete: ");
        return  sc.nextLine();
    }
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
                throw new NotValidMenuOptionException();
        }
    }
    /**
     * Estados Unidos:
     * Formato de teléfono: +1 (555) 123-4567
     * Formato de dirección: 123 Main Street, City, State, ZIP Code
     * China:
     * Formato de teléfono: +86 10 1234 5678
     * Formato de dirección: 123 Main Street, District, City, Province, Postal Code
     * España:
     * Formato de teléfono: +34 123 45 67 89
     * Formato de dirección: Calle Principal, Número, Código Postal, Ciudad
     */
}
