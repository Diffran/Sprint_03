package tasca_02.n2exercici1.store;

import tasca_02.n2exercici1.exceptions.InvalidOptionException;
import tasca_02.n2exercici1.paymentMethod.*;

import java.util.*;


public class ShoeStore {
    private static String option;
    private static StringBuilder orderToText = new StringBuilder();
    private static Scanner sc = new Scanner(System.in);
    private static Shoe s1 = new Shoe(Item.ADIDAS_SAMBA.getName(), Item.ADIDAS_SAMBA.getPrice());
    private static Shoe s2 = new Shoe(Item.ALL_STAR_CONVERSE.getName(), Item.ALL_STAR_CONVERSE.getPrice());
    private static Shoe s3 = new Shoe(Item.AIR_JORDANS.getName(), Item.AIR_JORDANS.getPrice());
    private static PaymentGateway paymentGateway = new PaymentGateway();
    private static HashMap<Shoe,Integer> order = new HashMap<>(){{
        put(s1, 0);
        put(s2, 0);
        put(s3, 0);
    }};
    public void addItem() throws InvalidOptionException {
        System.out.println("--------------ITEM MENU--------------");
        System.out.println("1- ADIDAS SAMBA");
        System.out.println("2- ALL STAR CONVERSE");
        System.out.println("3- AIR JORDANS");

        option = sc.nextLine();
        switch (option) {
            case "1":
                order.put(s1, order.getOrDefault(s1,0)+1);
                System.out.println("ADDED AN ADIDAS SAMBA");
                break;
            case "2":
                order.put(s2, order.getOrDefault(s2,0)+1);
                System.out.println("ADDED AN ALL STAR CONVERSE");
                break;
            case "3":
                order.put(s3, order.getOrDefault(s3,0)+1);
                System.out.println("ADDED AN AIR JORDANS");
                break;
            default:
                throw new InvalidOptionException();
        }
    }

    private String orderToString(){
        for (Map.Entry<Shoe, Integer> entry : order.entrySet()) {
            Shoe shoe = entry.getKey();
            orderToText.append(shoe.toString())
                    .append("   x")
                    .append(entry.getValue())
                    .append("\n");
        }
        return orderToText.toString();
    }
    public double getTotalPrice(){
        double price=0;
        for (Map.Entry<Shoe, Integer> entry : order.entrySet()) {
            Shoe shoe = entry.getKey();
            price = price + shoe.getPrice()*entry.getValue();
        }
        return price;
    }
    @Override
    public String toString() {
        String order =
         "---------------------Order----------------------\n" +
                orderToString() +
                "final price: ---------->" + getTotalPrice();
        //I empty the String builder cause if not it will keep adding String everytime i call it
        orderToText.setLength(0);
        return order;
    }

    public void makePayment(double amount) throws InvalidOptionException{
        CallbackPayment callback;
        System.out.println("---------------PAYMENT MENU--------------");
        System.out.println("1- PAYPAL");
        System.out.println("2- CREDIT CARD");
        System.out.println("3- BANK TRANSFER");
        System.out.println("choose payment type");

        option = sc.nextLine();
        switch (option) {
            case "1":
                callback = new PayPal();
                break;
            case "2":
                callback = new CreditCard();
                break;
            case "3":
                callback = new BankTransfer();
                break;
            default:
                throw new InvalidOptionException();
        }
        paymentGateway.processPayment(callback,amount);
    }

    public void newOrder(){
        order.replace(s1,0);
        order.replace(s2,0);
        order.replace(s3,0);
    }

}
