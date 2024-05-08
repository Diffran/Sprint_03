package tasca_02.n2exercici1.store;

public enum Item {
    ADIDAS_SAMBA("Samba",100),
    AIR_JORDANS("AirJordans",150),
    ALL_STAR_CONVERSE("AllStar",60);

    private final String name;
    private final double price;
    Item(String name,double price) {
        this.price = price;
        this.name=name;
    }
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
