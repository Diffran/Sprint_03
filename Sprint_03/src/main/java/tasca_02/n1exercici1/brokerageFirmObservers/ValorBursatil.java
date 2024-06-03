package tasca_02.n1exercici1.brokerageFirmObservers;

import tasca_02.n1exercici1.Broker;
import tasca_02.n1exercici1.interfaces.IObserver;

public class ValorBursatil implements IObserver {
    private double stockExchangeInvestment = 23;

    public ValorBursatil(Broker broker) {
        this.broker = broker;
        this.broker.attach(this);
    }

    @Override
    public void update(String update){
        System.out.println("ValorBursatil: you have -> "+stockExchangeInvestment+" shares -> "+update);
    }
}
