package Ejercicio2.Pizzas;

import Ejercicio2.Pizza;

public class PizzaMargarita extends Pizza {


    public PizzaMargarita(String masa) {
        super(masa);
        setNombre("Pizza Margarita");
        addTopping("Tomate natural");
        addTopping("Queso mozzarella");
        addTopping("Albahaca fresca");
        addTopping("Aceite de oliva");
        addTopping("Sal");
        addTopping("Pimienta Negra");

    }


}