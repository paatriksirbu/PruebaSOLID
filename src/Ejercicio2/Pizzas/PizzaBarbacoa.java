package Ejercicio2.Pizzas;
import Ejercicio2.Pizza;

public class PizzaBarbacoa extends Pizza {

    public PizzaBarbacoa(String masa) {
        super(masa);
        setNombre("Pizza Barbacoa");
        addTopping("Tomate natural");
        addTopping("Carne picada");
        addTopping("Pollo marinado");
        addTopping("Bacon ahumado");
        addTopping("Queso mozzarella");
        addTopping("Salsa barbacoa");
    }
}
