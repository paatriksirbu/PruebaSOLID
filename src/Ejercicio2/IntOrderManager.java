package Ejercicio2;

public interface IntOrderManager {

    public void addOrder(int order);
    public void addPizzaToOrder(int order, Pizza pizza);
    public void removeOrder(int orderId);
    public void updateOrder(int oldOrderId, int newOrderId);
    public void removePizzaByName(int order, String pizzaName);
}
