package tasca_02.n1exercici1.brokerageFirmObservers;

import tasca_02.n1exercici1.Broker;
import tasca_02.n1exercici1.interfaces.IObserver;

public class BorsaFutur implements IObserver {
    private double stockExchangeInvestment = 8.1;

    public BorsaFutur(Broker broker) {
        this.broker = broker;
        this.broker.attach(this);
    }

    @Override
    public void update(String update){
        System.out.println("BorsaFutur: you have -> "+stockExchangeInvestment+" shares -> "+update);
    }
}
