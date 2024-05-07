package tasca_02.n1exercici1.brokerageFirmObservers;

import tasca_02.n1exercici1.Broker;

public class ValorBursatil extends Observer{
    private double stockExchangeInvestment = 9.3;

    public ValorBursatil(Broker broker) {
        this.broker = broker;
        this.broker.attach(this);
    }

    @Override
    public void update(){
        System.out.println("ValorBursatil: "+(broker.getStockExchange()*stockExchangeInvestment));
    }
}
