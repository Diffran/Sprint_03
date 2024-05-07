package tasca_02.n1exercici1;

import tasca_02.n1exercici1.brokerageFirmObservers.BorsaConnect;
import tasca_02.n1exercici1.brokerageFirmObservers.BorsaFutur;
import tasca_02.n1exercici1.brokerageFirmObservers.ValorBursatil;

public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker();

        new BorsaConnect(broker);
        new BorsaFutur(broker);
        new ValorBursatil(broker);

        System.out.println("-----CANVI INDEX BORSA-----");
        System.out.println("el index de la borsa és: 3.4");
        broker.setStockExchange(3.4);
        System.out.println("-----CANVI INDEX BORSA-----");
        System.out.println("el index de la borsa és: 6.6");
        broker.setStockExchange(6.5);
    }
}
