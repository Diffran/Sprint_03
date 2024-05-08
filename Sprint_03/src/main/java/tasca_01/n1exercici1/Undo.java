package tasca_01.n1exercici1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Undo {
    private static Undo instance;
    private static List<Order> orders = new ArrayList<Order>();
    private static List<String> undo = new ArrayList<String>(List.of("----------UNDO LIST--------"));
    private static final String ADD = "you have added a new order, ID: ";
    private static final String REMOVE = "you have removed an order, ID: ";
    private static final String LIST = "you have listed the orders";

    private Undo(){

    }
    public static Undo getInstance(){
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void add(Order o){
        undo.add("option 1 -> add an order");
        orders.add(o);
        System.out.println("Order successfully added");
        undo.add(ADD+o.getID());
    }
    public void remove(String id) throws NumberFormatException{
        undo.add("option 2 -> remove an order");
        int idInt = Integer.parseInt(id);
        boolean exist = false;
        Order order;
        Iterator<Order> iterator = orders.iterator();

        while(iterator.hasNext()){
            order = iterator.next();
            if(order.getID()==idInt) {
                iterator.remove();
                System.out.println("Order successfully removed");
                exist=true;
                undo.add(REMOVE+order.getID());
            }
        }
        if(!exist){
            System.out.println("the id doesn't exist");
            undo.add(REMOVE+"doesn't exist");
        }
    }
    public void list(){
        undo.add("option 3 -> list orders");
        orders.forEach(order -> System.out.println(order));
        undo.add(LIST);
    }

    public void undoList(){
        undo.add("option 4 -> list undo history");
        undo.forEach(undo -> System.out.println(undo));
    }

    public static List<String> getUndo() {
        return undo;
    }
}
