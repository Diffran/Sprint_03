package tasca_02.n1exercici1;

import tasca_02.n1exercici1.interfaces.IObservable;
import tasca_02.n1exercici1.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Broker implements IObservable {
    private static List<IObserver> observers = new ArrayList<IObserver>();
    private static double stockExchange = 1;
    private static String update;
    private final String name;

    public Broker(String name) {
        this.name = name;
    }

    public static double getStockExchange() {
        return stockExchange;
    }

    public  void setStockExchange(double stockExchange) {
        if(this.stockExchange > stockExchange){
            update = "The stock market has fallen.";
        }else{
            update = "The stock market has risen";
        }
        this.stockExchange = stockExchange;
        notifyObservers();
    }

    @Override
    public  void addObserver(IObserver agency){
        this.observers.add(agency);
    }
    public  void removeObserver(IObserver observer){
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(){
        observers.forEach(observador -> observador.update(update));
    }

    @Override
    public void listObservers() {
        observers.forEach(System.out::println);
    }
}
