package Ejercicio2.Pizzas;

import Ejercicio2.Pizza;

public class PizzaAmatriciana extends Pizza {

    public PizzaAmatriciana(String masa) {
        super(masa);
        setNombre("Pizza Amatriciana");
        addTopping("Tomate natural");
        addTopping("Bacon ahumado");
        addTopping("Queso mozzarella");
        addTopping("Queso parmigiano");

    }

}
