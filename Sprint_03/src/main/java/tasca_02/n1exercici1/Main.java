package tasca_02.n1exercici1;


public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker("The broker");

        Agency borsaFutur = new Agency("Borsa Futur");
        Agency ConnectBorsa = new Agency("Connect Borsa");
        Agency leBorse = new Agency("Le Borse");

        broker.addObserver(borsaFutur);
        broker.addObserver(ConnectBorsa);
        broker.addObserver(leBorse);

        System.out.println("AGENCIES LIST");
        broker.listObservers();

        System.out.println("\nCHANGING STOCK EXCHANGE");
        System.out.println("RISING: ");
        broker.setStockExchange(1.5);
        System.out.println("FALLING: ");
        broker.setStockExchange(0.9);
        System.out.println("RAISING");
        broker.setStockExchange(1.1);

        System.out.println("\nREMOVING AN AGENCY");
        broker.removeObserver(borsaFutur);
        System.out.println("\nAGENCY LIST");
        broker.listObservers();
    }
}
