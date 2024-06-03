package tasca_02.n1exercici1.interfaces;

public interface IObservable {
    void addObserver(Object object);
    void removeObserver(Object object);
    void notifyObservers();
}
