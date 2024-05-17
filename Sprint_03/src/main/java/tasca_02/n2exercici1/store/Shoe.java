package tasca_02.n2exercici1.store;

public class Shoe {
    private String name;
    private  double price;
    public Shoe(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  ""+name +
                " -> " + price +
                "€";
    }
}
