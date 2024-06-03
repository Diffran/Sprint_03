package tasca_02.n1exercici1.brokerageFirmObservers;

public interface IObservable {
    void addObserver(Object object);
    void removeObserver(Object object);
    void notifyObservers();
}
