package Ejercicio2;
import javax.xml.crypto.Data;
import java.util.*;

public class DataBaseManager implements IntDataBaseManager {
    private User user;
    private List<Pizza> pizzas = new ArrayList<>();
    private List<OrderManager> orders = new ArrayList<>();
    private OrderManager orderManager;





    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void savePizza(Pizza pizza) {    // Guarda la pizza en la base de datos
        pizzas.add(pizza);
        System.out.println("Guardando pizza " + pizza.getNombre() + " en la base de datos");
    }

    public void deletePizza(Pizza pizza) {
        pizzas.remove(pizza);
        System.out.println("Borrando pizza " + pizza.getNombre() + " de la base de datos");
    }

    public void updatePizza(Pizza pizza) {
        int index = pizzas.indexOf(pizza);
        if (index != -1) {
            pizzas.set(index, pizza);
            System.out.println("Actualizando pizza " + pizza.getNombre() + " en la base de datos");
        } else {
            System.out.println("No se ha encontrado la pizza " + pizza.getNombre() + " en la base de datos");
        }
    }

    public void readPizza(Pizza pizza) {
        if (pizzas.contains(pizza)) {
            System.out.println("Leyendo pizza " + pizza.getNombre() + " de la base de datos");
        } else {
            System.out.println("No se ha encontrado la pizza " + pizza.getNombre() + " en la base de datos");
        }
    }

    public void readAllPizzas() {
        for (Pizza pizza: pizzas) {
            System.out.println("Leyendo todas las pizzas de la base de datos");
        }
    }

    public void deleteAllPizzas() {
        pizzas.clear();
        System.out.println("Borrando todas las pizzas de la base de datos");
    }


    public void updateAllPizzas(List<Pizza> newPizzas){
        pizzas = newPizzas;
        System.out.println("Actualizando todas las pizzas de la base de datos");
    }

    public void saveAllPizzas(List<Pizza> newPizzas) {
        pizzas.addAll(newPizzas);
        System.out.println("Guardando todas las pizzas en la base de datos");
    }

    public void saveOrder(OrderManager order) {
        orders.add(order);
        System.out.println("Guardando pedido " + order.getOrder() + " en la base de datos");
    }

    public void deleteOrder(OrderManager order) {
        orders.remove(order);
        System.out.println("Borrando pedido " + order.getOrder() + " de la base de datos");
    }

    public void updateOrder(OrderManager order) {
        int index = orders.indexOf(order);
        if (index != -1) {
            orders.set(index, order);
            System.out.println("Actualizando pedido " + order.getOrder() + " en la base de datos");
        } else {
            System.out.println("No se ha encontrado el pedido " + order.getOrder() + " en la base de datos");
        }
    }

    public void updateOrderStatus(OrderManager order, String status) {
        int index = orders.indexOf(order);
        if (index != -1) {
            orders.get(index).setStatus(status);
            System.out.println("Actualizando estado del pedido " + order + " en la base de datos");
        } else {
            System.out.println("No se ha encontrado el pedido " + order + " en la base de datos");
        }
    }
    public void readOrder(OrderManager order) {
        if (orders.contains(order)) {
            System.out.println("Leyendo pedido " + order.getOrder() + " de la base de datos");
        } else {
            System.out.println("No se ha encontrado el pedido " + order.getOrder() + " en la base de datos");
        }
    }

    public void readAllOrders() {
        for (OrderManager order: orders) {
            System.out.println("Leyendo todos los pedidos de la base de datos");
        }
    }

    public void deleteAllOrders() {
        orders.clear();
        System.out.println("Borrando todos los pedidos de la base de datos");
    }

    public void updateAllOrders(List<OrderManager> newOrders){
        orders = newOrders;
        System.out.println("Actualizando todos los pedidos de la base de datos");
    }

    public void saveAllOrders(List<OrderManager> newOrders) {
        orders.addAll(newOrders);
        System.out.println("Guardando todos los pedidos en la base de datos");
    }


}
