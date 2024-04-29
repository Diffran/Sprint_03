package tasca_01.n1exercici1;

public class Order {
    private final int ID;
    private static int generalId=0;
    public Order(){
        generalId++;
        this.ID=generalId;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString(){
        return "Order ID: "+ID;
    }
}
