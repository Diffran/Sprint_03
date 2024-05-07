package tasca_02.n1exercici1.brokerageFirmObservers;

import tasca_02.n1exercici1.Broker;

public class BorsaFutur extends Observer{
    private double stockExchangeInvestment = 8.1;

    public BorsaFutur(Broker broker) {
        this.broker = broker;
        this.broker.attach(this);
    }

    @Override
    public void update(){
        System.out.println("BorsaFutur: "+(broker.getStockExchange()*stockExchangeInvestment));
    }
}
