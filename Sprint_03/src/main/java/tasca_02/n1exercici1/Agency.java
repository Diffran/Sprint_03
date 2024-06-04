package tasca_02.n1exercici1;

import tasca_02.n1exercici1.interfaces.IObserver;

public class Agency implements IObserver{
    private String name;

    public Agency(String name) {
        this.name = name;
    }

    @Override
    public void update(String update) {
        System.out.println(update+" message for agency: "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "name='" + name + '\'' +
                '}';
    }
}
