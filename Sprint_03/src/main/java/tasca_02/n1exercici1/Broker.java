package tasca_02.n1exercici1;

import tasca_02.n1exercici1.interfaces.IObservable;
import tasca_02.n1exercici1.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Broker implements IObservable {
    private static List<IObserver> observers = new ArrayList<IObserver>();
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

    @Override
    public  void addObserver(IObserver agency){
        this.observers.add(agency);
    }
    public static void removeObserver(IObserver observer){
        observers.remove(observer);
    }
    public static void notifyAllBrokerageFirms(String update){
        observers.forEach(observador -> observador.update(update));
    }
}
