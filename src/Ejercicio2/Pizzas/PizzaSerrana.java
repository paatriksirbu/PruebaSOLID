package Ejercicio2.Pizzas;

import Ejercicio2.Pizza;

public class PizzaSerrana extends Pizza {

    public PizzaSerrana(String masa) {
        super(masa);
        setNombre("Pizza Serrana");
        addTopping("Tomate natural");
        addTopping("Jamón serrano");
        addTopping("Tocineta");
        addTopping("Anchoas");
        addTopping("Queso mozzarella");
        addTopping("Orégano");
    }
}
