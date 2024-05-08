package tasca_02.n1exercici1.brokerageFirmObservers;

import tasca_02.n1exercici1.Broker;

public abstract class Observer {
    protected Broker broker;
    public abstract void update(String update);
}
