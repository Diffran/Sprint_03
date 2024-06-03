package tasca_02.n1exercici1.brokerageFirmObservers;

import tasca_02.n1exercici1.Broker;
import tasca_02.n1exercici1.interfaces.IObserver;

public class BorsaConnect implements IObserver {
    private double stockExchangeInvestment = 5.4;

    public BorsaConnect(Broker broker) {
        this.broker = broker;
        this.broker.attach(this);
    }

    @Override
    public void update(boolean stockMarketStatus){
        System.out.println("BorsaConnect: you have -> "+stockExchangeInvestment+" shares -> "+update);
    }

}
