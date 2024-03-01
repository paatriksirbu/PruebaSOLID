package Ejercicio2;
import java.util.*;

public class OrderManager implements IntOrderManager{
    private int order;

    private List<Integer> orders = new ArrayList<>();
    private List<Pizza> pizzas = new ArrayList<>();
    private User user;
    private String status;

    public OrderManager(int order, User user) {
        this.order = order;
        this.orders = new ArrayList<>();
        this.user = user;
        this.pizzas = new ArrayList<>();
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

    public void updateOrder(int nuevaId) {
        int index = orders.indexOf(nuevaId);
        if (index != -1) {
            orders.set(index, nuevaId);
        } else {
            System.out.println("Order with id " + nuevaId + " not found.");
        }
    }

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }
    public void removePizza(Pizza pizza) {
        this.pizzas.remove(pizza);
    }

    public void removePizzaByName(String pizzaName) {
        Iterator<Pizza> iterator = pizzas.iterator();
        while (iterator.hasNext()) {
            Pizza pizza = iterator.next();
            if (pizza.getNombre().equals(pizzaName)) {
                iterator.remove();
                System.out.println("Pizza " + pizzaName + " removed from the order.");
                return;
            }
        }
        System.out.println("Pizza " + pizzaName + " not found in the order.");
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
