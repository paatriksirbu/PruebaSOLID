package Ejercicio2;
import java.util.*;

public class OrderManager{
    private String order;

    private List<String> orders = new ArrayList<>();
    private Pizza pizza;

    public OrderManager(String order) {
        this.order = order;
        this.orders = new ArrayList<>();
    }

    public void addOrder(String order) {
        orders.add(order);
    }

    public void removeOrder(String order) {
        orders.remove(order);
    }

    public void updateOrder(String order) {
        orders.set(orders.indexOf(order), order);
    }


    public void showOrders() {
        System.out.println("Orders: ");
        for (String order : orders) {
            System.out.println(order);
        }
    }

    public String getOrder() {
        return order;
    }

    public List<String> getOrders() {
        return orders;
    }
}
