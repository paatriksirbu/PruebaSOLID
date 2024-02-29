package Ejercicio2.Pizzas;

import Ejercicio2.Pizza;

public class PizzaDiavola extends Pizza {

        public PizzaDiavola(String masa) {
            super(masa);
            setNombre("Pizza Diavola");
            addTopping("Tomate natural");
            addTopping("Salame picante");
            addTopping("Queso mozzarella");
            addTopping("AOVE al peperoncino");
        }
}
