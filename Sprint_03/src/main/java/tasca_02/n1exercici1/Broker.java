package tasca_02.n1exercici1;

import tasca_02.n1exercici1.brokerageFirmObservers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private static List<Observer> observers = new ArrayList<Observer>();
    private static double stockExchange = 1;
    private static String update;

    public static double getStockExchange() {
        return stockExchange;
    }

    public static void setStockExchange(double stockExchange) {
        if(Broker.stockExchange > stockExchange){
            update = "The stock market has fallen.";
        }else{
            update = "The stock market has risen";
        }
        Broker.stockExchange = stockExchange;
        notifyAllBrokerageFirms(update);
    }

    public static void attach(Observer observer){
        observers.add(observer);
    }
    public static void notifyAllBrokerageFirms(String update){
        observers.forEach(observador -> observador.update(update));
    }
}
