package Ejercicio2;
import java.util.*;

public class OrderManager implements IntOrderManager{
    private int order;

    private List<Integer> orders = new ArrayList<>();
    private List<Pizza> pizzas = new ArrayList<>();
    private Pizza pizza;
    private User user;
    private String status;

    public OrderManager(int order, User user) {
        this.order = order;
        this.orders = new ArrayList<>();
        this.user = user;
    }

    public void addOrder(int order) {
        orders.add(order);
    }

    public void removeOrder(int orderId) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) == orderId) {
                orders.remove(i);
                System.out.println("Pedido " + orderId + " eliminado.");
                return;
            }
        }
        System.out.println("No se encontró ningún pedido con el ID " + orderId);
    }

    public void updateOrder(int order) {
        orders.set(orders.indexOf(order), order);
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void showOrders() {
        System.out.println("Orders: ");
        for (int order : orders) {
            System.out.println(order);
        }
    }


    public int getOrder() {
        return order;
    }

    public List<Integer> getOrders() {
        return orders;
    }

    public User getUser() {
        return user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
