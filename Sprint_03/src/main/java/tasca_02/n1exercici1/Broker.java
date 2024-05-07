package tasca_02.n1exercici1;

import tasca_02.n1exercici1.brokerageFirmObservers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Broker {//subject
    private static List<Observer> observers = new ArrayList<Observer>();
    private static double stockExchange;

    public static double getStockExchange() {
        return stockExchange;
    }

    public static void setStockExchange(double stockExchange) {
        Broker.stockExchange = stockExchange;
        notifyAllBrokerageFirms();
    }

    public static void attach(Observer observer){
        observers.add(observer);
    }
    public static void notifyAllBrokerageFirms(){
        observers.forEach(observador -> observador.update());
    }
}
