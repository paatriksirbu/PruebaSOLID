package Ejercicio2;
import java.util.*;

public abstract class Pizza implements IntPizza {

    private String masa;
    private String nombre;
    private List<String> toppings = new ArrayList<>();

    public Pizza() {
        this.masa = masa;
        this.nombre = nombre;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void removeTopping(String topping) {
        toppings.remove(topping);
    }

    public void showToppings() {
        System.out.println("Toppings: ");
        for (String topping : toppings) {
            System.out.println(topping);
        }
    }

    public String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void prepare() {
        System.out.println("Preparando pizza " + nombre);
        System.out.println("Amasando la masa...");
        System.out.println("Añadiendo los ingredientes: ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    public void bake() {
        System.out.println("Horneando pizza");
    }

    public void cut() {
        System.out.println("Cortando pizza");
    }

    public void box() {
        System.out.println("Empaquetando pizza");
    }




}
