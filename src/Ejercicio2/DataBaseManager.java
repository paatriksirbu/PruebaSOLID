package Ejercicio2;
import java.util.*;

public class DataBaseManager implements IntDataBaseManager {

    private List<Pizza> pizzas = new ArrayList<>();
    public void savePizza(Pizza pizza) {
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
}
