package Ejercicio2;
import java.util.*;
public interface IntDataBaseManager {
    public void savePizza(Pizza pizza);
    public void deletePizza(Pizza pizza);
    public void updatePizza(Pizza pizza);
    public void readPizza(Pizza pizza);
    public void readAllPizzas();
    public void deleteAllPizzas();
    public void updateAllPizzas(List<Pizza> newPizzas);
    public void saveAllPizzas(List<Pizza> newPizzas);
}
