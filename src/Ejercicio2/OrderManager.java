package Ejercicio2;
import java.util.*;

public class OrderManager implements IntOrderManager{
    private int order;
    private Map<Integer, List<Pizza>> orderPizzas = new HashMap<>();
    private User user;
    private String status;

    public OrderManager(int order, User user) {
        this.order = order;
        this.user = user;
    }

    public void addOrder(int order) {
        orderPizzas.put(order, new ArrayList<>());
    }

    public void addPizzaToOrder(int order, Pizza pizza){
        List<Pizza> pizzas = orderPizzas.get(order);
        if (pizzas != null) {
            pizzas.add(pizza);
            System.out.println("Pizza " + pizza.getNombre() + " added to order " + order);
        } else {
            System.out.println("Order " + order + " not found.");
        }
    }

    public void removeOrder(int id) {
        if (orderPizzas.containsKey(id)) {
            orderPizzas.remove(id);
            System.out.println("Order " + id + " removed.");
        } else {
            System.out.println("Order " + id + " not found.");
        }
    }
    public void updateOrder(int oldOrderId, int newOrderId) {
        List<Pizza> pizzas = orderPizzas.remove(oldOrderId);
        if (pizzas != null) {
            orderPizzas.put(newOrderId, pizzas);
            System.out.println("Order " + oldOrderId + " updated to " + newOrderId);
        } else {
            System.out.println("Order " + oldOrderId + " not found.");
        }
    }


    public void removePizzaByName(int order, String pizzaName) {
        List<Pizza> pizzas = orderPizzas.get(order);
        if (pizzas != null) {
            Iterator<Pizza> iterator = pizzas.iterator();
            while (iterator.hasNext()) {
                Pizza pizza = iterator.next();
                if (pizza.getNombre().equals(pizzaName)) {
                    iterator.remove();
                    System.out.println("Pizza " + pizzaName + " removed from order " + order);
                    return;
                }
            }
            System.out.println("Pizza " + pizzaName + " not found in order " + order);
        } else {
            System.out.println("Order " + order + " not found.");
        }
    }
    public void showOrders() {
        for (Map.Entry<Integer, List<Pizza>> entry : orderPizzas.entrySet()) {
            System.out.println("Order number: " + entry.getKey());
            System.out.println("Pizzas in this order: ");
            for (Pizza pizza : entry.getValue()) {
                System.out.println(pizza.getNombre());
            }
        }
    }


    public int getOrder() {
        return order;
    }
    public Set<Integer> getOrders() {
        return orderPizzas.keySet();
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
