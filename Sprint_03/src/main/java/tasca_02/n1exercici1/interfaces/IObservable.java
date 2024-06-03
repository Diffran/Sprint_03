package tasca_02.n1exercici1.interfaces;

public interface IObservable {
    void addObserver(IObserver object);
    void removeObserver(IObserver object);
    void notifyObservers();
}
