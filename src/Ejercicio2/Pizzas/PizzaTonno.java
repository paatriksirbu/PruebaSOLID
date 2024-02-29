package Ejercicio2.Pizzas;

import Ejercicio2.Pizza;

public class PizzaTonno extends Pizza {

        public PizzaTonno(String masa) {
            super(masa);
            setNombre("Pizza Tonno");
            addTopping("Tomate natural");
            addTopping("Atún");
            addTopping("Cebolla");
            addTopping("Queso mozzarella");
            addTopping("Aceitunas");
            addTopping("Aceite de oliva");
        }
}
