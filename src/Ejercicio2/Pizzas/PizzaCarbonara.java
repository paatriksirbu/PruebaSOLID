package Ejercicio2.Pizzas;

import Ejercicio2.Pizza;

public class PizzaCarbonara extends Pizza {

    public PizzaCarbonara(String masa) {
        super(masa);
        setNombre("Pizza Carbonara");
        addTopping("Queso mozzarella");
        addTopping("Huevo");
        addTopping("Bacon ahumado");
        addTopping("Queso parmigiano");
        addTopping("Pimienta negra");
    }

}
