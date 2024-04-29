package tasca_01.n1exercici1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Undo {
    private static Undo instance;
    private static List<Order> undo = new ArrayList<Order>();

    private Undo(){

    }
    public static Undo getInstance(){
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void add(Order o){
        undo.add(o);
        System.out.println("Order successfully added");
    }
    public void remove(String id) throws NumberFormatException{
        int idInt = Integer.parseInt(id);
        boolean exist = false;
        Order order;
        Iterator<Order> iterator = undo.iterator();

        while(iterator.hasNext()){
            order = iterator.next();
            if(order.getID()==idInt) {
                iterator.remove();
                System.out.println("Order successfully removed");
                exist=true;
            }
        }
        if(!exist){
            System.out.println("the id doesn't exist");
        }
    }
    public void list(){
        undo.forEach(order -> System.out.println(order));
    }

}
