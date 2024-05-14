package tasca_01.n2exercici1Corregit;

import tasca_01.n2exercici1.exceptions.InvalidOption;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    private static Scanner sc = new Scanner(System.in);
    private static String option;
    //crear una llista de contactes
    public static void mainMenu(){
        do{
            System.out.println("-----------------CONTACT LIST MANAGEMENT-------------------------");
            System.out.println("1- CREATE NEW CONTACT");
            System.out.println("2- LIST CONTACTS");
            System.out.println("3- EXIT");
            System.out.println("choose an option: ");

            option = sc.nextLine();
            try{
                switch(option){
                    case "1":

                        break;
                    case "2":

                        break;
                    case "3":
                        System.exit(0);
                    default:
                        throw new InvalidOption();
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }while(!option.equals(""));
    }
    private static createNewContact(){
        //metode que afegeix contacts a la list de contactes
    }
    private static listConstactList(){
        //metode que recorre la contact List i la imprimeix
    }
}
